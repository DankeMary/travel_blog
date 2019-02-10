package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.FavouritePostEntity;
import ru.vsu.service.serviceobject.FavouritePostSO;

import java.util.List;

@Mapper
public interface FavouritePostEntityMapper {
    FavouritePostSO favouritePostToSO(FavouritePostEntity favPostEntity);

    FavouritePostEntity favouritePostToEntity(FavouritePostSO favPostSO);

    List<FavouritePostSO> favouritePostListToSOList(List<FavouritePostEntity> favPostListEntity);

    List<FavouritePostEntity> favouritePostListToEntityList(List<FavouritePostSO> favPostListSO);
}
