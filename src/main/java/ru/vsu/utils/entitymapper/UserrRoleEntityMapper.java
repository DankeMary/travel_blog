package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.UserrRoleEntity;
import ru.vsu.service.serviceobject.UserrRoleSO;

import java.util.List;

@Mapper
public interface UserrRoleEntityMapper {
    UserrRoleSO userRoleToSO(UserrRoleEntity uRoleEntity);

    UserrRoleEntity userRoleToEntity(UserrRoleSO uRoleSO);

    List<UserrRoleSO> userRoleListToSOList(List<UserrRoleEntity> uRoleListEntity);

    List<UserrRoleEntity> userRoleListToEntityList(List<UserrRoleSO> uRoleListSO);
}
