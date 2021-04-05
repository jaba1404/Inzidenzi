package us.jannis.inzidenzi.util.update;

import us.jannis.inzidenzi.Inzidenzi;

import java.util.TimerTask;

public class UpdateTask extends TimerTask {

    @Override
    public void run() {
        if(Inzidenzi.getDistrictSaver().hasTodayAsSave()){
            System.out.println("No need to update data as of now.");
            return;
        }
        System.out.println("Deleting old data...");
        Inzidenzi.getDistrictSaver().clearEntries();
        System.out.println("Gathering new data...");
        Inzidenzi.loadData();
        System.out.println("Done updating");
    }

}
