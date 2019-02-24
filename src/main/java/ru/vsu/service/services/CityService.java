package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.CityDao;
import ru.vsu.utils.beanmapper.CityBeanMapper;
import ru.vsu.utils.beanmapper.CityBeanMapperImpl;
import ru.vsu.utils.entitymapper.CityEntityMapper;
import ru.vsu.utils.entitymapper.CityEntityMapperImpl;

@Service("cityService")
@Transactional
public class CityService {
    private CityDao cityDao;
    private CityEntityMapper entityMapper = new CityEntityMapperImpl();
    private CityBeanMapper beanMapper = new CityBeanMapperImpl();

    @Autowired
    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }
}
