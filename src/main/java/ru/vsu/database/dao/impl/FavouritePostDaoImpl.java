package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.FavouritePostDao;
import ru.vsu.database.entity.FavouritePostEntity;

@Repository
public class FavouritePostDaoImpl extends AbstractDaoImpl<FavouritePostEntity, Integer> implements FavouritePostDao {
}
