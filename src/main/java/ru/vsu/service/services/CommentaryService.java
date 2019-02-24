package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.CommentaryDao;
import ru.vsu.database.entity.CommentaryEntity;
import ru.vsu.travelapp.bean.CommentaryBean;
import ru.vsu.utils.beanmapper.CommentaryBeanMapper;
import ru.vsu.utils.beanmapper.CommentaryBeanMapperImpl;
import ru.vsu.utils.entitymapper.CommentaryEntityMapper;
import ru.vsu.utils.entitymapper.CommentaryEntityMapperImpl;

import java.util.List;

@Service("commentaryService")
@Transactional
public class CommentaryService {
    private CommentaryDao commentaryDao;
    private CommentaryEntityMapper entityMapper = new CommentaryEntityMapperImpl();
    private CommentaryBeanMapper beanMapper = new CommentaryBeanMapperImpl();

    public CommentaryBean commentaryEntityToBean(CommentaryEntity commentary) {
        return beanMapper.commentaryToBean(entityMapper.commentaryToSO(commentary));
    }

    public CommentaryEntity commentaryBeanToEntity(CommentaryBean commentary) {
        return entityMapper.commentaryToEntity(beanMapper.commentaryToSO(commentary));
    }

    public List<CommentaryBean> commentaryEntityListToBeanList(List<CommentaryEntity> commentaries) {
        return beanMapper.commentaryListToBeanList(entityMapper.commentaryListToSOList(commentaries));
    }
    
    @Autowired
    public void setCommentaryDao(CommentaryDao commentaryDao) {
        this.commentaryDao = commentaryDao;
    }
}
