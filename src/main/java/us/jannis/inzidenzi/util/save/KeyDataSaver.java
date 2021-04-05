package us.jannis.inzidenzi.util.save;

import us.jannis.inzidenzi.responses.KeyDataResponse;

import java.io.FileNotFoundException;
import java.util.List;

public class KeyDataSaver extends Saver<KeyDataResponse> {

    public KeyDataSaver() {
        super(KeyDataResponse.class);
    }

    @Override
    public List<KeyDataResponse> readEntries() throws FileNotFoundException {
        return super.readEntries();
    }

    @Override
    public void saveEntries(List<KeyDataResponse> entries) {
        super.saveEntries(entries);
    }
}
