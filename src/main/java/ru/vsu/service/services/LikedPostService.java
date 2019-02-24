package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.LikedPostDao;
import ru.vsu.database.entity.LikedPostEntity;
import ru.vsu.travelapp.bean.LikedPostBean;
import ru.vsu.utils.beanmapper.LikedPostBeanMapper;
import ru.vsu.utils.beanmapper.LikedPostBeanMapperImpl;
import ru.vsu.utils.entitymapper.LikedPostEntityMapper;
import ru.vsu.utils.entitymapper.LikedPostEntityMapperImpl;

import java.util.List;

@Service("likedPostService")
@Transactional
public class LikedPostService {
    private LikedPostDao likedPostDao;
    private LikedPostEntityMapper entityMapper = new LikedPostEntityMapperImpl();
    private LikedPostBeanMapper beanMapper = new LikedPostBeanMapperImpl();

    public LikedPostBean likedPostEntityToBean(LikedPostEntity likedPost) {
        return beanMapper.likedPostToBean(entityMapper.likedPostToSO(likedPost));
    }

    public LikedPostEntity likedPostBeanToEntity(LikedPostBean likedPost) {
        return entityMapper.likedPostToEntity(beanMapper.likedPostToSO(likedPost));
    }

    public List<LikedPostBean> likedPostEntityListToBeanList(List<LikedPostEntity> likedPosts) {
        return beanMapper.likedPostListToBeanList(entityMapper.likedPostListToSOList(likedPosts));
    }
    
    @Autowired
    public void setLikedPostDao(LikedPostDao likedPostDao) {
        this.likedPostDao = likedPostDao;
    }
}
