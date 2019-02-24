package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.PlaceDao;
import ru.vsu.database.entity.PlaceEntity;
import ru.vsu.travelapp.bean.PlaceBean;
import ru.vsu.utils.beanmapper.PlaceBeanMapper;
import ru.vsu.utils.beanmapper.PlaceBeanMapperImpl;
import ru.vsu.utils.entitymapper.PlaceEntityMapper;
import ru.vsu.utils.entitymapper.PlaceEntityMapperImpl;

import java.util.List;

@Service("placeService")
@Transactional
public class PlaceService {
    private PlaceDao placeDao;
    private PlaceEntityMapper entityMapper = new PlaceEntityMapperImpl();
    private PlaceBeanMapper beanMapper = new PlaceBeanMapperImpl();

    public PlaceBean placeEntityToBean(PlaceEntity place) {
        return beanMapper.placeToBean(entityMapper.placeToSO(place));
    }

    public PlaceEntity placeBeanToEntity(PlaceBean place) {
        return entityMapper.placeToEntity(beanMapper.placeToSO(place));
    }

    public List<PlaceBean> placeEntityListToBeanList(List<PlaceEntity> places) {
        return beanMapper.placeListToBeanList(entityMapper.placeListToSOList(places));
    }
    
    @Autowired
    public void setPlaceDao(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }
}
