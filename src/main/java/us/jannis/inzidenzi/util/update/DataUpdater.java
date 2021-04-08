package us.jannis.inzidenzi.util.update;

import java.util.Calendar;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class DataUpdater {

    private static final Timer UPDATE_TIMER = new Timer();

    private DataUpdater() {

    }

    public static void startTimer(int shard) {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 2);
        calendar.set(Calendar.MINUTE, shard > 0 ? 3 : 0);
        calendar.set(Calendar.SECOND, 0);
        UPDATE_TIMER.schedule(new UpdateTask(shard), calendar.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
    }

}
