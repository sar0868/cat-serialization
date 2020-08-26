package ru.toofast.cat.serializers;

import ru.toofast.cat.model.CatCollection;

public interface CatSerializer {
    void serialize(CatCollection catCollection, String fileName);
}
