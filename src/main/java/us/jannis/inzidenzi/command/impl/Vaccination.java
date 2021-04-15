package us.jannis.inzidenzi.command.impl;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.annotations.ArgumentsNeeded;
import us.jannis.inzidenzi.annotations.Globally;
import us.jannis.inzidenzi.command.Command;
import us.jannis.inzidenzi.responses.OWIDResponse;
import us.jannis.inzidenzi.util.Comparison;

import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Globally
@ArgumentsNeeded(amount = 1, comparison = Comparison.GRATER_OR_EQUAL)
public class Vaccination extends Command {


    public Vaccination() {
        super("Vaccination", "impfungen");
    }

    @Override
    public void execute(String[] args, MessageChannel messageChannel, Message message, Guild guild) {
        final String query = new String(String.join(" ", args).trim().getBytes(StandardCharsets.UTF_8));
        final List<OWIDResponse> owidResponses = Inzidenzi.getOwidResponses().stream().filter(index -> match(query, index.getLocation(), 0.9f)).collect(Collectors.toList());
        if (owidResponses.isEmpty())
            return;
        Collections.reverse(owidResponses);
        final OWIDResponse vaccinationResponse = owidResponses.get(0);
        final EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Vaccination data for " + vaccinationResponse.getLocation(), "https://github.com/owid/covid-19-data/blob/master/public/data/vaccinations/vaccinations.csv");
        embedBuilder.setColor(Color.green);
        embedBuilder.addField("People vaccinated (At least one vaccine dose)", readable(vaccinationResponse.getPeopleVaccinated()), false);
        embedBuilder.addField("People fully vaccinated", readable(vaccinationResponse.getPeopleFullyVaccinated()), false);
        embedBuilder.addField("Total doses administered", readable(vaccinationResponse.getTotalVaccinations()), false);
        embedBuilder.addField("New doses administered", readable(vaccinationResponse.getNewVaccinations()), false);
        embedBuilder.addField("People vaccinated (At least one vaccine dose) per hundred", readable(vaccinationResponse.getPeopleVaccinatedPerHundred()) + "%", false);
        embedBuilder.addField("People fully vaccinated per hundred", readable(vaccinationResponse.getPeopleFullyVaccinatedPerHundred()) + "%", false);
        embedBuilder.addField("New doses administered per million", readable(vaccinationResponse.getNewVaccinationsSmoothedPerMillion()) + "%", false);
        embedBuilder.setFooter("Date of observation: " + vaccinationResponse.getLastUpdatedDate());

        messageChannel.sendMessage(embedBuilder.build()).queue();

    }

    @Override
    public String[] getHelp() {
        return new String[]{"<country/ISO 3166-1 alpha-3>", "Shows the current vaccination data of a country"};
    }

    @Override
    public String getSyntax() {
        return null;
    }
}
