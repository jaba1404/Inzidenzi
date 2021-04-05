package us.jannis.inzidenzi.util.save;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import us.jannis.inzidenzi.exception.InitializationException;

import java.io.*;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Saver<T> {

    private final Gson gson;
    private final File saveFile;
    private final Class<T> type;
    private String lastUpdate;

    public Saver(Class<T> tClass) {
        this.type = tClass;
        gson = new GsonBuilder().setPrettyPrinting().create();
        File dir = new File(".", "saves");
        if(!dir.exists() && !dir.mkdir())
            throw new InitializationException();
        saveFile = new File(dir, tClass.getSimpleName() + "-" + getDateTime()+ "-saves.json");
        if(!hasTodayAsSave() && dir.listFiles().length > 0){
            for (File file : dir.listFiles()) {
                try {
                    Files.delete(file.toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void clearEntries(){
        for (File file : new File(".", "saves").listFiles()) {
            try {
                Files.delete(file.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean hasTodayAsSave(){
        return saveFile.exists();
    }

    private String getDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public void saveEntries(List<T> entries) {
        try {
            lastUpdate = getDateTime();
            if(!hasTodayAsSave() && !saveFile.createNewFile())
                throw new InitializationException();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (final BufferedWriter buffWriter = Files.newBufferedWriter(saveFile.toPath())) {
            buffWriter.append(gson.toJson(entries, new TypeToken<List<T>>() {
            }.getType()));
            buffWriter.newLine();
        } catch (IOException e) {
            throw new InitializationException();
        }
    }

    public List<T> readEntries() throws FileNotFoundException {
        lastUpdate = saveFile.getName().split("-")[1];
        return gson.fromJson(new JsonReader(new FileReader(saveFile)), TypeToken.getParameterized(ArrayList.class, type).getType());
    }

    public String getLastUpdate() {
        return lastUpdate;
    }
}
