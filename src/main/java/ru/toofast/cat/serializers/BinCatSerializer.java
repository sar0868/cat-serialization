package ru.toofast.cat.serializers;

import ru.toofast.cat.model.CatCollection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinCatSerializer implements CatSerializer {

    public void serialize(CatCollection catCollection, String fileName){
        FileOutputStream faos = null;
        ObjectOutputStream ous = null;
        try {
            faos = new FileOutputStream(fileName);
            ous = new ObjectOutputStream(faos);
            ous.writeObject(catCollection);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ous != null) {
                try {
                    ous.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                faos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
