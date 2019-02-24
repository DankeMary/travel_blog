package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.UserrDao;
import ru.vsu.utils.beanmapper.UserrBeanMapper;
import ru.vsu.utils.beanmapper.UserrBeanMapperImpl;
import ru.vsu.utils.entitymapper.UserrEntityMapper;
import ru.vsu.utils.entitymapper.UserrEntityMapperImpl;

@Service("userrService")
@Transactional
public class UserrService {
    private UserrDao userrDao;
    private UserrEntityMapper entityMapper = new UserrEntityMapperImpl();
    private UserrBeanMapper beanMapper = new UserrBeanMapperImpl();

    @Autowired
    public void setUserrDao(UserrDao userrDao) {
        this.userrDao = userrDao;
    }
}
