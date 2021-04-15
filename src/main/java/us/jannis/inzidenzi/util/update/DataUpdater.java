package us.jannis.inzidenzi.util.update;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DataUpdater {

    private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newScheduledThreadPool(1);

    private DataUpdater() {

    }

    public static void startTimer(int shard) {
        final ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        ZonedDateTime nextRun = now.withHour(2).withMinute(shard == 0 ? 0 : 5).withSecond(0);
        if (now.compareTo(nextRun) > 0)
            nextRun = nextRun.plusDays(1);
        final Duration duration = Duration.between(now, nextRun);
        SCHEDULED_EXECUTOR_SERVICE.scheduleAtFixedRate(new UpdateTask(shard),
                duration.getSeconds(),
                TimeUnit.DAYS.toSeconds(1),
                TimeUnit.SECONDS);
    }

}
