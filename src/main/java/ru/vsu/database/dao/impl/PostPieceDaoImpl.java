package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.PostPieceDao;
import ru.vsu.database.entity.PostPieceEntity;

@Repository
public class PostPieceDaoImpl extends AbstractDaoImpl<PostPieceEntity, Integer> implements PostPieceDao {
}
