package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.PlaceDao;
import ru.vsu.utils.beanmapper.PlaceBeanMapper;
import ru.vsu.utils.beanmapper.PlaceBeanMapperImpl;
import ru.vsu.utils.entitymapper.PlaceEntityMapper;
import ru.vsu.utils.entitymapper.PlaceEntityMapperImpl;

@Service("placeService")
@Transactional
public class PlaceService {
    private PlaceDao placeDao;
    private PlaceEntityMapper entityMapper = new PlaceEntityMapperImpl();
    private PlaceBeanMapper beanMapper = new PlaceBeanMapperImpl();

    @Autowired
    public void setPlaceDao(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }
}
