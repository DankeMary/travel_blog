package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.CityDao;
import ru.vsu.database.entity.CityEntity;

import java.util.List;

@Repository
public class CityDaoImpl extends AbstractDaoImpl<CityEntity, Integer> implements CityDao {
    @Override
    public List<CityEntity> getCitiesLike(String subString) {
        List<CityEntity> list = (List<CityEntity>) getEntityManager()
                .createQuery("from CityEntity ce " +
                        " where ce.namee like :subString")
                .setParameter("subString", subString)
                .list();
        return list;
    }
}
