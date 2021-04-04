package us.jannis.inzidenzi.util.save;

import us.jannis.inzidenzi.responses.DistrictResponse;

import java.io.FileNotFoundException;
import java.util.List;

public class DistrictSaver extends Saver<DistrictResponse> {

    public DistrictSaver() {
        super(DistrictResponse.class);
    }

    @Override
    public List<DistrictResponse> readEntries() throws FileNotFoundException {
        return super.readEntries();
    }

    @Override
    public void saveEntries(List<DistrictResponse> entries) {
        super.saveEntries(entries);
    }
}
