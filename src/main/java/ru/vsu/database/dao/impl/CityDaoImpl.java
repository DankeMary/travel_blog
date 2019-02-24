package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.CityDao;
import ru.vsu.database.entity.CityEntity;

@Repository
public class CityDaoImpl extends AbstractDaoImpl<CityEntity, Integer> implements CityDao {
}
