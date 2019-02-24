package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.PostDao;
import ru.vsu.utils.beanmapper.PostBeanMapper;
import ru.vsu.utils.beanmapper.PostBeanMapperImpl;
import ru.vsu.utils.entitymapper.PostEntityMapper;
import ru.vsu.utils.entitymapper.PostEntityMapperImpl;

@Service("postService")
@Transactional
public class PostService {
    private PostDao postDao;
    private PostEntityMapper entityMapper = new PostEntityMapperImpl();
    private PostBeanMapper beanMapper = new PostBeanMapperImpl();

    @Autowired
    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }
}
