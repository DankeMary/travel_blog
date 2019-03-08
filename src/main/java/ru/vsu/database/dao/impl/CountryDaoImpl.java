package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.CountryDao;
import ru.vsu.database.entity.CountryEntity;

import java.util.List;

@Repository
public class CountryDaoImpl extends AbstractDaoImpl<CountryEntity, Integer> implements CountryDao {

    @Override
    public List<CountryEntity> getCountryLike(String subString) {
        List<CountryEntity> list = (List<CountryEntity>) getEntityManager()
                .createQuery("from CityEntity ce " +
                        " where ce.namee like :subString")
                .setParameter("subString", subString)
                .list();
        return list;
    }
}
