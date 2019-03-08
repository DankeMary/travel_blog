package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.PlaceDao;
import ru.vsu.database.entity.PlaceEntity;

import java.util.List;

@Repository
public class PlaceDaoImpl extends AbstractDaoImpl<PlaceEntity, Integer> implements PlaceDao {
    @Override
    public List<PlaceEntity> getPlacesLike(String place) {
        List<PlaceEntity> list = (List<PlaceEntity>) getEntityManager()
                .createQuery("from PlaceEntity pe " +
                        " where pe.placeName like :placeName")
                .setParameter("placeName", "%" + place + "%")
                .list();
        return list;
    }
}
