package us.jannis.inzidenzi.util.save;

import us.jannis.inzidenzi.responses.StateResponse;

import java.io.FileNotFoundException;
import java.util.List;

public class StateSaver extends Saver<StateResponse> {

    public StateSaver() {
        super(StateResponse.class);
    }

    @Override
    public List<StateResponse> readEntries() throws FileNotFoundException {
        return super.readEntries();
    }

    @Override
    public void saveEntries(List<StateResponse> entries) {
        super.saveEntries(entries);
    }
}
