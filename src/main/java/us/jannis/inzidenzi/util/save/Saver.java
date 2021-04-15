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

    private final File dir = new File(".", "saves");
    private final Class<T> type;
    private String lastUpdate;
    private final Gson gson;

    public Saver(Class<T> tClass) {
        this.type = tClass;
        gson = new GsonBuilder().setPrettyPrinting().create();
        if (!dir.exists() && !dir.mkdir())
            throw new InitializationException();
        if (!hasTodayAsSave() && dir.listFiles().length > 0) {
            for (File file : dir.listFiles()) {
                try {
                    Files.delete(file.toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public File getSaveFile() {
        return new File(dir, type.getSimpleName() + "-" + getDateTime() + ".json");
    }

    public void clearEntries() {
        for (File file : new File(".", "saves").listFiles()) {
            try {
                Files.delete(file.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean hasTodayAsSave() {
        return getSaveFile().exists();
    }

    private String getDateTime() {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        final LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public void saveEntries(List<T> entries) {
        try {
            lastUpdate = getDateTime();
            if (!hasTodayAsSave() && !getSaveFile().createNewFile())
                throw new InitializationException();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (final BufferedWriter buffWriter = Files.newBufferedWriter(getSaveFile().toPath())) {
            buffWriter.append(gson.toJson(entries, new TypeToken<List<T>>() {
            }.getType()));
            buffWriter.newLine();
        } catch (IOException e) {
            throw new InitializationException();
        }
    }

    public List<T> readEntries() throws FileNotFoundException {
        lastUpdate = getSaveFile().getName().split("-")[1].replace(".json","");
        return gson.fromJson(new JsonReader(new FileReader(getSaveFile())), TypeToken.getParameterized(ArrayList.class, type).getType());
    }

    public String getLastUpdate() {
        return lastUpdate;
    }
}
