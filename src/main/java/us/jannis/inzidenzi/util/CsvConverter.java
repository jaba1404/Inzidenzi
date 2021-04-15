package us.jannis.inzidenzi.util;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CsvConverter {

    private static final Gson GSON = new Gson();

    public static String toJsonString(String csv) throws IOException {
        return GSON.toJson(readObjectsFromCsv(csv));
    }

    public static Object toObject(String csv, Class<?> clazz) throws IOException {
        return GSON.fromJson(GSON.toJson(readObjectsFromCsv(csv)), clazz);
    }

    public static List<Map<Object, Object>> readObjectsFromCsv(String string) throws IOException {
        CsvSchema bootstrap = CsvSchema.emptySchema().withHeader();
        CsvMapper csvMapper = new CsvMapper()
                .enable(CsvParser.Feature.SKIP_EMPTY_LINES)
                .enable(CsvParser.Feature.INSERT_NULLS_FOR_MISSING_COLUMNS)
                .enable(CsvParser.Feature.EMPTY_STRING_AS_NULL);
        MappingIterator<Map<Object, Object>> mappingIterator = csvMapper.readerFor(Map.class).with(bootstrap).readValues(string);
        return mappingIterator.readAll();
    }


}
