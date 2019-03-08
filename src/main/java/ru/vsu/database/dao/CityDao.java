package ru.vsu.database.dao;

import ru.vsu.database.entity.CityEntity;

import java.util.List;

public interface CityDao extends AbstractDao<CityEntity, Integer> {
    List<CityEntity> getCitiesLike(String subString);
}
