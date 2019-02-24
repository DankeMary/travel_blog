package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.CommentaryDao;
import ru.vsu.utils.beanmapper.CommentaryBeanMapper;
import ru.vsu.utils.beanmapper.CommentaryBeanMapperImpl;
import ru.vsu.utils.entitymapper.CommentaryEntityMapper;
import ru.vsu.utils.entitymapper.CommentaryEntityMapperImpl;

@Service("commentaryService")
@Transactional
public class CommentaryService {
    private CommentaryDao commentaryDao;
    private CommentaryEntityMapper entityMapper = new CommentaryEntityMapperImpl();
    private CommentaryBeanMapper beanMapper = new CommentaryBeanMapperImpl();

    @Autowired
    public void setCommentaryDao(CommentaryDao commentaryDao) {
        this.commentaryDao = commentaryDao;
    }
}
