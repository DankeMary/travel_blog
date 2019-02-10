package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.RegionEntity;
import ru.vsu.service.serviceobject.RegionSO;

import java.util.List;

@Mapper
public interface RegionEntityMapper {
    RegionSO regionToSO(RegionEntity regionEntity);

    RegionEntity regionToEntity(RegionSO regionSO);

    List<RegionSO> regionListToSOList(List<RegionEntity> regionListEntity);

    List<RegionEntity> regionListToEntityList(List<RegionSO> regionListSO);
}
