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

import java.util.LinkedList;
import java.util.List;

@Service("userrService")
@Transactional
public class UserrService {
    private UserrDao userrDao;
    private UserrEntityMapper entityMapper = new UserrEntityMapperImpl();
    private UserrBeanMapper beanMapper = new UserrBeanMapperImpl();

    public void create(UserrBean userr) {
        try {
            userrDao.create(userrBeanToEntity(userr));
        } catch (Exception e) {
            //LOG.error("Failed to create userr", e);
        }
    }

    public UserrBean createReturnObject(UserrBean userr) {
        UserrBean userrBean = null;
        try {
            userrBean = userrEntityToBean(userrDao.createReturnObject(userrBeanToEntity(userr)));
        } catch (Exception e) {
            //LOG.error("Failed to create userr", e);
        }
        return userrBean;
    }

    public void update(UserrBean userr) {
        try {
            userrDao.update(userrBeanToEntity(userr));
        } catch (Exception e) {
            //LOG.error("Failed to update userr", e);
        }
    }

    public void delete(int id) {
        try {
            userrDao.delete(userrDao.find(id));
        } catch (Exception e) {
            //LOG.error(String.format("Failed to delete userr by id=%s", id), e);
        }
    }

    public List<UserrBean> getAll() {
        List<UserrBean> userrs = new LinkedList<>();
        try {
            userrs = userrEntityListToBeanList(userrDao.findAll());
        } catch (Exception e) {
            //LOG.error("Failed to get all userrs", e);
        }
        return userrs;
    }

    public List<UserrBean> getAll(int page, int maxResult) {
        List<UserrBean> userrs = new LinkedList<>();
        try {
            userrs = userrEntityListToBeanList(userrDao.findAll(page, maxResult));
        } catch (Exception e) {
            //LOG.error("Failed to get all userrs", e);
        }
        return userrs;
    }

    public UserrBean getUserr(int id) {
        UserrBean userrBean = null;
        try {
            userrBean = userrEntityToBean(userrDao.find(id));
        } catch (Exception e) {
            //LOG.error(String.format("Failed to get userr by id=%s", id), e);
        }
        return userrBean;
    }

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
