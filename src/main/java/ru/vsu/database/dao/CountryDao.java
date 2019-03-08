package ru.vsu.database.dao;

import ru.vsu.database.entity.CountryEntity;

import java.util.List;

public interface CountryDao extends AbstractDao<CountryEntity, Integer>  {
    List<CountryEntity> getCountryLike(String subString);
}
