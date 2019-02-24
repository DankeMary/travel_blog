package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.UserrRoleDao;
import ru.vsu.utils.beanmapper.UserrRoleBeanMapper;
import ru.vsu.utils.beanmapper.UserrRoleBeanMapperImpl;
import ru.vsu.utils.entitymapper.UserrRoleEntityMapper;
import ru.vsu.utils.entitymapper.UserrRoleEntityMapperImpl;

@Service("userrRoleService")
@Transactional
public class UserrRoleService {
    private UserrRoleDao userrRoleDao;
    private UserrRoleEntityMapper entityMapper = new UserrRoleEntityMapperImpl();
    private UserrRoleBeanMapper beanMapper = new UserrRoleBeanMapperImpl();

    @Autowired
    public void setUserrRoleDao(UserrRoleDao userrRoleDao) {
        this.userrRoleDao = userrRoleDao;
    }
}
