package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.UserrRoleDao;
import ru.vsu.database.entity.UserrRoleEntity;
import ru.vsu.travelapp.bean.UserrRoleBean;
import ru.vsu.utils.beanmapper.UserrRoleBeanMapper;
import ru.vsu.utils.beanmapper.UserrRoleBeanMapperImpl;
import ru.vsu.utils.entitymapper.UserrRoleEntityMapper;
import ru.vsu.utils.entitymapper.UserrRoleEntityMapperImpl;

import java.util.List;

@Service("userrRoleService")
@Transactional
public class UserrRoleService {
    private UserrRoleDao userrRoleDao;
    private UserrRoleEntityMapper entityMapper = new UserrRoleEntityMapperImpl();
    private UserrRoleBeanMapper beanMapper = new UserrRoleBeanMapperImpl();

    public UserrRoleBean userrRoleEntityToBean(UserrRoleEntity userrRole) {
        return beanMapper.userRoleToBean(entityMapper.userRoleToSO(userrRole));
    }

    public UserrRoleEntity userrRoleBeanToEntity(UserrRoleBean userrRole) {
        return entityMapper.userRoleToEntity(beanMapper.userRoleToSO(userrRole));
    }

    public List<UserrRoleBean> userrRoleEntityListToBeanList(List<UserrRoleEntity> userrRoles) {
        return beanMapper.userRoleListToBeanList(entityMapper.userRoleListToSOList(userrRoles));
    }
    
    @Autowired
    public void setUserrRoleDao(UserrRoleDao userrRoleDao) {
        this.userrRoleDao = userrRoleDao;
    }
}
