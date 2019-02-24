package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.CityDao;
import ru.vsu.database.entity.CityEntity;
import ru.vsu.travelapp.bean.CityBean;
import ru.vsu.utils.beanmapper.CityBeanMapper;
import ru.vsu.utils.beanmapper.CityBeanMapperImpl;
import ru.vsu.utils.entitymapper.CityEntityMapper;
import ru.vsu.utils.entitymapper.CityEntityMapperImpl;

import java.util.List;

@Service("cityService")
@Transactional
public class CityService {
    private CityDao cityDao;
    private CityEntityMapper entityMapper = new CityEntityMapperImpl();
    private CityBeanMapper beanMapper = new CityBeanMapperImpl();

    public CityBean cityEntityToBean(CityEntity city) {
        return beanMapper.cityToBean(entityMapper.cityToSO(city));
    }

    public CityEntity cityBeanToEntity(CityBean city) {
        return entityMapper.cityToEntity(beanMapper.cityToSO(city));
    }

    public List<CityBean> cityEntityListToBeanList(List<CityEntity> cities) {
        return beanMapper.cityListToBeanList(entityMapper.cityListToSOList(cities));
    }
    
    @Autowired
    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }
}
