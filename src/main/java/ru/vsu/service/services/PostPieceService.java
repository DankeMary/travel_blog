package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.PostPieceDao;
import ru.vsu.utils.beanmapper.PostPieceBeanMapper;
import ru.vsu.utils.beanmapper.PostPieceBeanMapperImpl;
import ru.vsu.utils.entitymapper.PostPieceEntityManagerImpl;
import ru.vsu.utils.entitymapper.PostPieceEntityMapper;

@Service("postPieceService")
@Transactional
public class PostPieceService {
    private PostPieceDao postPieceDao;
    private PostPieceEntityMapper entityMapper = new PostPieceEntityManagerImpl();
    private PostPieceBeanMapper beanMapper = new PostPieceBeanMapperImpl();

    @Autowired
    public void setPostPieceDao(PostPieceDao postPieceDao) {
        this.postPieceDao = postPieceDao;
    }
}
