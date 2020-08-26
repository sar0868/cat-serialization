package ru.toofast.cat.serializers;

import org.junit.jupiter.api.Assertions;
import ru.toofast.cat.model.Cat;
import ru.toofast.cat.model.CatCollection;
import ru.toofast.cat.model.Sex;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

class BinCatSerializerTest {

    @org.junit.jupiter.api.Test
    void serialize() {
        CatCollection catCollection = prepareTestData();
        BinCatSerializer binCatSerializer = new BinCatSerializer();
        binCatSerializer.serialize(catCollection, "cat.txt");

        Assertions.assertTrue(new File("cat.txt").exists());
    }

    @org.junit.jupiter.api.Test
    void jsonSerializeTest() {
        CatCollection catCollection = prepareTestData();
        JsonCatSerializer binCatSerializer = new JsonCatSerializer();
        binCatSerializer.serialize(catCollection, "cat.json");

        Assertions.assertTrue(new File("cat.json").exists());
    }

    @org.junit.jupiter.api.Test
    void xmlSerializeTest() {
        CatCollection catCollection = prepareTestData();
        XmlCatSerializer binCatSerializer = new XmlCatSerializer();
        binCatSerializer.serialize(catCollection, "cat.xml");

        Assertions.assertTrue(new File("cat.xml").exists());
    }



    private CatCollection prepareTestData() {
        Cat mara = new Cat();
        mara.setName("Mara");
        mara.setSex(Sex.FEMALE);
        mara.setNicknames(Arrays.asList("One eyed Devil"));

        Cat yura = new Cat();
        yura.setName("Yura");
        yura.setSex(Sex.MALE);
        yura.setNicknames(Arrays.asList("Red Baron", "The Fat Man"));
        CatCollection catCollection = new CatCollection();
        catCollection.setCats(new ArrayList<Cat>());
        catCollection.getCats().add(mara);
        catCollection.getCats().add(yura);
        return catCollection;
    }
}