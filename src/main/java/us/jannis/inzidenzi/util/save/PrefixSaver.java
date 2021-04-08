package us.jannis.inzidenzi.util.save;

import us.jannis.inzidenzi.command.CommandManager;

import java.io.*;
import java.util.HashMap;

public class PrefixSaver {

    private static final File SAVE_FILE = new File("artifacts", "prefixes.save");

    private PrefixSaver(){

    }

    public static void savePrefixes() {
        try (FileOutputStream fileOut = new FileOutputStream(SAVE_FILE)) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(CommandManager.getPrefixMap());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadPrefixes() {
        try {
            if (!SAVE_FILE.exists() && !SAVE_FILE.createNewFile())
                return;
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_FILE))) {
                final Object o = ois.readObject();
                if(!(o instanceof HashMap))
                    return;
                CommandManager.getPrefixMap().putAll((HashMap<Long, String>) ois.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
