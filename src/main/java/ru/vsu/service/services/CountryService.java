package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.CountryDao;
import ru.vsu.utils.beanmapper.CountryBeanMapper;
import ru.vsu.utils.beanmapper.CountryBeanMapperImpl;
import ru.vsu.utils.entitymapper.CountryEntityMapper;
import ru.vsu.utils.entitymapper.CountryEntityMapperImpl;

@Service("countryService")
@Transactional
public class CountryService {
    private CountryDao countryDao;
    private CountryEntityMapper entityMapper = new CountryEntityMapperImpl();
    private CountryBeanMapper beanMapper = new CountryBeanMapperImpl();

    @Autowired
    public void setCountryDao(CountryDao countryDao) {
        this.countryDao = countryDao;
    }
}
