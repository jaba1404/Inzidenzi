package us.jannis.inzidenzi.listener;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import us.jannis.inzidenzi.Inzidenzi;

public class GuildMessageListener extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        Inzidenzi.getCommandManager().execute(event.getMessage());
    }


}
