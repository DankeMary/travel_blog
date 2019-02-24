package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.UserrSO;
import ru.vsu.travelapp.bean.UserrBean;

import java.util.List;

@Mapper
public interface UserrBeanMapper {
    UserrSO userToSO(UserrBean userBean);

    UserrBean userToBean(UserrSO userSO);

    List<UserrSO> userListToSOList(List<UserrBean> userListBean);

    List<UserrBean> userListToBeanList(List<UserrSO> userListSO);
}
