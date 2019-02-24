package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.RegionDao;
import ru.vsu.utils.beanmapper.RegionBeanMapper;
import ru.vsu.utils.beanmapper.RegionBeanMapperImpl;
import ru.vsu.utils.entitymapper.RegionEntityMapper;
import ru.vsu.utils.entitymapper.RegionEntityMapperImpl;

@Service("regionService")
@Transactional
public class RegionService {
    private RegionDao regionDao;
    private RegionEntityMapper entityMapper = new RegionEntityMapperImpl();
    private RegionBeanMapper beanMapper = new RegionBeanMapperImpl();

    @Autowired
    public void setRegionDao(RegionDao regionDao) {
        this.regionDao = regionDao;
    }
}
