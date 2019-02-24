package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.FavouritePostDao;
import ru.vsu.utils.beanmapper.FavouritePostBeanMapper;
import ru.vsu.utils.beanmapper.FavouritePostBeanMapperImpl;
import ru.vsu.utils.entitymapper.FavouritePostEntityMapper;
import ru.vsu.utils.entitymapper.FavouritePostEntityMapperImpl;

@Service("favouritePostService")
@Transactional
public class FavouritePostService {
    private FavouritePostDao favouritePostDao;
    private FavouritePostEntityMapper entityMapper = new FavouritePostEntityMapperImpl();
    private FavouritePostBeanMapper beanMapper = new FavouritePostBeanMapperImpl();

    @Autowired
    public void setFavouritePostDao(FavouritePostDao favouritePostDao) {
        this.favouritePostDao = favouritePostDao;
    }
}
