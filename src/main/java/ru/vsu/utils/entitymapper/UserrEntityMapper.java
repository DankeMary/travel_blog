package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.UserrEntity;
import ru.vsu.service.serviceobject.UserrSO;

import java.util.List;

@Mapper
public interface UserrEntityMapper {
    UserrSO userToSO(UserrEntity userEntity);

    UserrEntity userToEntity(UserrSO userSO);

    List<UserrSO> userListToSOList(List<UserrEntity> userListEntity);

    List<UserrEntity> userListToEntityList(List<UserrSO> userListSO);
}
