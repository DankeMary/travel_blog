package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.RegionDao;
import ru.vsu.database.entity.RegionEntity;
import ru.vsu.travelapp.bean.RegionBean;
import ru.vsu.utils.beanmapper.RegionBeanMapper;
import ru.vsu.utils.beanmapper.RegionBeanMapperImpl;
import ru.vsu.utils.entitymapper.RegionEntityMapper;
import ru.vsu.utils.entitymapper.RegionEntityMapperImpl;

import java.util.List;

@Service("regionService")
@Transactional
public class RegionService {
    private RegionDao regionDao;
    private RegionEntityMapper entityMapper = new RegionEntityMapperImpl();
    private RegionBeanMapper beanMapper = new RegionBeanMapperImpl();

    public RegionBean regionEntityToBean(RegionEntity region) {
        return beanMapper.regionToBean(entityMapper.regionToSO(region));
    }

    public RegionEntity regionBeanToEntity(RegionBean region) {
        return entityMapper.regionToEntity(beanMapper.regionToSO(region));
    }

    public List<RegionBean> regionEntityListToBeanList(List<RegionEntity> regions) {
        return beanMapper.regionListToBeanList(entityMapper.regionListToSOList(regions));
    }
    
    @Autowired
    public void setRegionDao(RegionDao regionDao) {
        this.regionDao = regionDao;
    }
}
