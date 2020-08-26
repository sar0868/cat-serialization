package ru.toofast.cat.serializers;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.toofast.cat.model.CatCollection;

import java.io.File;
import java.io.IOException;

public class JsonCatSerializer implements CatSerializer{


    public void serialize(CatCollection catCollection, String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        File out = new File(fileName);
        try {
            objectMapper.writerFor(CatCollection.class).writeValue(out, catCollection);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
