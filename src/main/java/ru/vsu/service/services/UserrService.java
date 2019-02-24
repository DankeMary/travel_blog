package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.UserrDao;
import ru.vsu.database.entity.UserrEntity;
import ru.vsu.travelapp.bean.UserrBean;
import ru.vsu.utils.beanmapper.UserrBeanMapper;
import ru.vsu.utils.beanmapper.UserrBeanMapperImpl;
import ru.vsu.utils.entitymapper.UserrEntityMapper;
import ru.vsu.utils.entitymapper.UserrEntityMapperImpl;

import java.util.List;

@Service("userrService")
@Transactional
public class UserrService {
    private UserrDao userrDao;
    private UserrEntityMapper entityMapper = new UserrEntityMapperImpl();
    private UserrBeanMapper beanMapper = new UserrBeanMapperImpl();

    public UserrBean userrEntityToBean(UserrEntity userr) {
        return beanMapper.userToBean(entityMapper.userToSO(userr));
    }

    public UserrEntity userrBeanToEntity(UserrBean userr) {
        return entityMapper.userToEntity(beanMapper.userToSO(userr));
    }

    public List<UserrBean> userrEntityListToBeanList(List<UserrEntity> userrs) {
        return beanMapper.userListToBeanList(entityMapper.userListToSOList(userrs));
    }
    
    @Autowired
    public void setUserrDao(UserrDao userrDao) {
        this.userrDao = userrDao;
    }
}
