package ru.vsu.database.dao.impl;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.PostDao;
import ru.vsu.database.entity.PostEntity;

import java.util.List;

@Repository
public class PostDaoImpl extends AbstractDaoImpl<PostEntity, Integer> implements PostDao {
    @Override
    public List<PostEntity> getAllNewest(int page, int maxResult) {
        Query q = getEntityManager()
                .createQuery("from PostEntity pe " +
                        " order by pe.createdOn DESC");
        return findAll(q, page, maxResult);
    }

    @Override
    public int countAllNewestPages(int maxResult) {
        return countPages(getEntityManager()
                        .createQuery("select count(*) from PostEntity "),
                maxResult);
    }
}
