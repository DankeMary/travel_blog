package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.PlaceDao;
import ru.vsu.database.entity.PlaceEntity;

@Repository
public class PlaceDaoImpl extends AbstractDaoImpl<PlaceEntity, Integer> implements PlaceDao {
}
