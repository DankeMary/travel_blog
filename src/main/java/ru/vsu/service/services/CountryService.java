package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.CountryDao;
import ru.vsu.database.entity.CountryEntity;
import ru.vsu.travelapp.bean.CountryBean;
import ru.vsu.utils.beanmapper.CountryBeanMapper;
import ru.vsu.utils.beanmapper.CountryBeanMapperImpl;
import ru.vsu.utils.entitymapper.CountryEntityMapper;
import ru.vsu.utils.entitymapper.CountryEntityMapperImpl;

import java.util.List;

@Service("countryService")
@Transactional
public class CountryService {
    private CountryDao countryDao;
    private CountryEntityMapper entityMapper = new CountryEntityMapperImpl();
    private CountryBeanMapper beanMapper = new CountryBeanMapperImpl();

    public List<CountryBean> getAll(){
        return countryEntityListToBeanList(countryDao.findAll());
    }

    public CountryBean countryEntityToBean(CountryEntity country) {
        return beanMapper.countryToBean(entityMapper.countryToSO(country));
    }

    public CountryEntity countryBeanToEntity(CountryBean country) {
        return entityMapper.countryToEntity(beanMapper.countryToSO(country));
    }

    public List<CountryBean> countryEntityListToBeanList(List<CountryEntity> countries) {
        return beanMapper.countryListToBeanList(entityMapper.countryListToSOList(countries));
    }
    
    @Autowired
    public void setCountryDao(CountryDao countryDao) {
        this.countryDao = countryDao;
    }
}
