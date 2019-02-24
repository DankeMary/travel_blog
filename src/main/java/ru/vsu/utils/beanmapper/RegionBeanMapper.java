package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.RegionSO;
import ru.vsu.travelapp.bean.RegionBean;

import java.util.List;

@Mapper
public interface RegionBeanMapper {
    RegionSO regionToSO(RegionBean regionBean);

    RegionBean regionToBean(RegionSO regionSO);

    List<RegionSO> regionListToSOList(List<RegionBean> regionListBean);

    List<RegionBean> regionListToBeanList(List<RegionSO> regionListSO);
}
