package us.jannis.inzidenzi.util.update;

import us.jannis.inzidenzi.Inzidenzi;

import java.util.TimerTask;

public class UpdateTask extends TimerTask {

    private final int shard;

    public UpdateTask(int shard) {
        this.shard = shard;
    }

    @Override
    public void run() {
        System.out.println("Starting update task...");
        if(Inzidenzi.hasData()){
            System.out.println("No need to update data as of now.");
            Inzidenzi.loadData();
            return;
        }
        if(shard == 0){
            System.out.println("Gathering new data...");
            Inzidenzi.saveData();
        }
        System.out.println("Loading new data...");
        Inzidenzi.loadData();
        System.out.println("Done updating");
    }

}
