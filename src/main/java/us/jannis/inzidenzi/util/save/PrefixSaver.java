package us.jannis.inzidenzi.util.save;

import us.jannis.inzidenzi.command.CommandManager;

import java.io.*;
import java.util.HashMap;

public class PrefixSaver {

    private static final File SAVE_FILE = new File("artifacts", "prefixes.save");

    public static void savePrefixes() {
        try (FileOutputStream fileOut = new FileOutputStream(SAVE_FILE)) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(CommandManager.PREFIX_MAP);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadPrefixes() {
        try (FileInputStream fis = new FileInputStream(SAVE_FILE)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            CommandManager.PREFIX_MAP.putAll((HashMap<Long, String>) ois.readObject());
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
