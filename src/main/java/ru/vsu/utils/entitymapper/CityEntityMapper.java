package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.CityEntity;
import ru.vsu.service.serviceobject.CitySO;

import java.util.List;

@Mapper
public interface CityEntityMapper {
    CitySO cityToSO(CityEntity cityEntity);

    CityEntity cityToEntity(CitySO citySO);

    List<CitySO> cityListToSOList(List<CityEntity> cityListEntity);

    List<CityEntity> cityListToEntityList(List<CitySO> cityListSO);
}
