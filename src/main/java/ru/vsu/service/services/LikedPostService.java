package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.LikedPostDao;
import ru.vsu.utils.beanmapper.LikedPostBeanMapper;
import ru.vsu.utils.beanmapper.LikedPostBeanMapperImpl;
import ru.vsu.utils.entitymapper.LikedPostEntityMapper;
import ru.vsu.utils.entitymapper.LikedPostEntityMapperImpl;

@Service("likedPostService")
@Transactional
public class LikedPostService {
    private LikedPostDao likedPostDao;
    private LikedPostEntityMapper entityMapper = new LikedPostEntityMapperImpl();
    private LikedPostBeanMapper beanMapper = new LikedPostBeanMapperImpl();

    @Autowired
    public void setLikedPostDao(LikedPostDao likedPostDao) {
        this.likedPostDao = likedPostDao;
    }
}
