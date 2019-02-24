package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.LikedPostDao;
import ru.vsu.database.entity.LikedPostEntity;

@Repository
public class LikedPostDaoImpl extends AbstractDaoImpl<LikedPostEntity, Integer> implements LikedPostDao {
}
