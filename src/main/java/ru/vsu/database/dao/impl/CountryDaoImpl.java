package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.CountryDao;
import ru.vsu.database.entity.CountryEntity;

@Repository
public class CountryDaoImpl extends AbstractDaoImpl<CountryEntity, Integer> implements CountryDao {

}
