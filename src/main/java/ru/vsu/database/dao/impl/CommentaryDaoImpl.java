package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.CommentaryDao;
import ru.vsu.database.entity.CommentaryEntity;

@Repository
public class CommentaryDaoImpl extends AbstractDaoImpl<CommentaryEntity, Integer> implements CommentaryDao {
}
