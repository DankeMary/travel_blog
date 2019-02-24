package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.PlaceSO;
import ru.vsu.travelapp.bean.PlaceBean;

import java.util.List;

@Mapper
public interface PlaceBeanMapper {
    PlaceSO placeToSO(PlaceBean placeBean);

    PlaceBean placeToBean(PlaceSO placeSO);

    List<PlaceSO> placeListToSOList(List<PlaceBean> placeListBean);

    List<PlaceBean> placeListToBeanList(List<PlaceSO> placeListSO);
}
