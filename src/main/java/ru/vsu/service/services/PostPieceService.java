package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.PostPieceDao;
import ru.vsu.database.entity.PostPieceEntity;
import ru.vsu.travelapp.bean.PostPieceBean;
import ru.vsu.utils.beanmapper.PostPieceBeanMapper;
import ru.vsu.utils.beanmapper.PostPieceBeanMapperImpl;
import ru.vsu.utils.entitymapper.PostPieceEntityMapper;
import ru.vsu.utils.entitymapper.PostPieceEntityMapperImpl;

import java.util.List;

@Service("postPieceService")
@Transactional
public class PostPieceService {
    private PostPieceDao postPieceDao;
    private PostPieceEntityMapper entityMapper = new PostPieceEntityMapperImpl();
    private PostPieceBeanMapper beanMapper = new PostPieceBeanMapperImpl();

    public PostPieceBean postPieceEntityToBean(PostPieceEntity postPiece) {
        return beanMapper.postPieceToBean(entityMapper.postPieceToSO(postPiece));
    }

    public PostPieceEntity postPieceBeanToEntity(PostPieceBean postPiece) {
        return entityMapper.postPieceToEntity(beanMapper.postPieceToSO(postPiece));
    }

    public List<PostPieceBean> postPieceEntityListToBeanList(List<PostPieceEntity> postPieces) {
        return beanMapper.postPieceListToBeanList(entityMapper.postPieceListToSOList(postPieces));
    }
    
    @Autowired
    public void setPostPieceDao(PostPieceDao postPieceDao) {
        this.postPieceDao = postPieceDao;
    }
}
