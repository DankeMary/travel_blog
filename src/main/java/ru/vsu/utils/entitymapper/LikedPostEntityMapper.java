package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.LikedPostEntity;
import ru.vsu.service.serviceobject.LikedPostSO;

import java.util.List;

@Mapper
public interface LikedPostEntityMapper {
    LikedPostSO likedPostToSO(LikedPostEntity likedPostEntity);

    LikedPostEntity likedPostToEntity(LikedPostSO likedPostSO);

    List<LikedPostSO> likedPostListToSOList(List<LikedPostEntity> likedPostListEntity);

    List<LikedPostEntity> likedPostListToEntityList(List<LikedPostSO> likedPostListSO);
}
