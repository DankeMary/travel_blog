package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.UserrRoleSO;
import ru.vsu.travelapp.bean.UserrRoleBean;

import java.util.List;

@Mapper
public interface UserrRoleBeanMapper {
    UserrRoleSO userRoleToSO(UserrRoleBean uRoleBean);

    UserrRoleBean userRoleToBean(UserrRoleSO uRoleSO);

    List<UserrRoleSO> userRoleListToSOList(List<UserrRoleBean> uRoleListBean);

    List<UserrRoleBean> userRoleListToBeanList(List<UserrRoleSO> uRoleListSO);
}
