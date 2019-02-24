package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.CitySO;
import ru.vsu.travelapp.bean.CityBean;

import java.util.List;

@Mapper
public interface CityBeanMapper {
    CitySO cityToSO(CityBean cityBean);

    CityBean cityToBean(CitySO citySO);

    List<CitySO> cityListToSOList(List<CityBean> cityListBean);

    List<CityBean> cityListToBeanList(List<CitySO> cityListSO);
}
