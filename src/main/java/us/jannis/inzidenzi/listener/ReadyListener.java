package us.jannis.inzidenzi.listener;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import us.jannis.inzidenzi.Inzidenzi;
import us.jannis.inzidenzi.util.update.DataUpdater;

public class ReadyListener extends ListenerAdapter {

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        if (event.getJDA().getShardInfo().getShardId() == 0 && !Inzidenzi.hasData()) {
            Inzidenzi.saveData();
        }
        DataUpdater.startTimer(event.getJDA().getShardInfo().getShardId());
        Inzidenzi.loadData();
    }
}
