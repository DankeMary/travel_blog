package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.PostPieceDao;
import ru.vsu.database.entity.PlaceEntity;
import ru.vsu.database.entity.PostPieceEntity;

import java.util.List;

@Repository
public class PostPieceDaoImpl extends AbstractDaoImpl<PostPieceEntity, Integer> implements PostPieceDao {
    @Override
    public List<PostPieceEntity> findPiecesByPostId(int postId) {
        List<PostPieceEntity> list = (List<PostPieceEntity>) getEntityManager()
                .createQuery("from PostPieceEntity ppe " +
                        " where ppe.post.id = :postId")
                .setParameter("postId", postId)
                .list();
        return list;

    }
}
