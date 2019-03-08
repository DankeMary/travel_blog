package ru.vsu.database.dao;

import ru.vsu.database.entity.PlaceEntity;

import java.util.List;

public interface PlaceDao extends AbstractDao<PlaceEntity, Integer>  {
    List<PlaceEntity> getPlacesLike(String place);
}
