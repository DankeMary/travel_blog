package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.FavouritePostDao;
import ru.vsu.database.entity.FavouritePostEntity;
import ru.vsu.travelapp.bean.FavouritePostBean;
import ru.vsu.utils.beanmapper.FavouritePostBeanMapper;
import ru.vsu.utils.beanmapper.FavouritePostBeanMapperImpl;
import ru.vsu.utils.entitymapper.FavouritePostEntityMapper;
import ru.vsu.utils.entitymapper.FavouritePostEntityMapperImpl;

import java.util.List;

@Service("favouritePostService")
@Transactional
public class FavouritePostService {
    private FavouritePostDao favouritePostDao;
    private FavouritePostEntityMapper entityMapper = new FavouritePostEntityMapperImpl();
    private FavouritePostBeanMapper beanMapper = new FavouritePostBeanMapperImpl();

    public FavouritePostBean favouritePostEntityToBean(FavouritePostEntity favouritePost) {
        return beanMapper.favouritePostToBean(entityMapper.favouritePostToSO(favouritePost));
    }

    public FavouritePostEntity favouritePostBeanToEntity(FavouritePostBean favouritePost) {
        return entityMapper.favouritePostToEntity(beanMapper.favouritePostToSO(favouritePost));
    }

    public List<FavouritePostBean> favouritePostEntityListToBeanList(List<FavouritePostEntity> favouritePosts) {
        return beanMapper.favouritePostListToBeanList(entityMapper.favouritePostListToSOList(favouritePosts));
    }

    @Autowired
    public void setFavouritePostDao(FavouritePostDao favouritePostDao) {
        this.favouritePostDao = favouritePostDao;
    }
}
