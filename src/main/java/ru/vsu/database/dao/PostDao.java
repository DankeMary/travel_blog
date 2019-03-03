package ru.vsu.database.dao;

import ru.vsu.database.entity.PostEntity;

import java.util.List;

public interface PostDao extends AbstractDao<PostEntity, Integer>  {

    List<PostEntity> getAllNewest(int page, int maxResult);
    int countAllNewestPages(int maxResult);
}
