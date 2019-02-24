package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.PostDao;
import ru.vsu.database.entity.PostEntity;

@Repository
public class PostDaoImpl extends AbstractDaoImpl<PostEntity, Integer> implements PostDao {
}
