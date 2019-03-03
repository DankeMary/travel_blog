package ru.vsu.database.dao;

import ru.vsu.database.entity.PostPieceEntity;

import java.util.List;

public interface PostPieceDao extends AbstractDao<PostPieceEntity, Integer>  {
    List<PostPieceEntity> findPiecesByPostId(int postId);
}
