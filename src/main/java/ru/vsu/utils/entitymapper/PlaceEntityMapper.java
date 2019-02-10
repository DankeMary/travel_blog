package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.PlaceEntity;
import ru.vsu.service.serviceobject.PlaceSO;

import java.util.List;

@Mapper
public interface PlaceEntityMapper {
    PlaceSO placeToSO(PlaceEntity placeEntity);

    PlaceEntity placeToEntity(PlaceSO placeSO);

    List<PlaceSO> placeListToSOList(List<PlaceEntity> placeListEntity);

    List<PlaceEntity> placeListToEntityList(List<PlaceSO> placeListSO);
}
