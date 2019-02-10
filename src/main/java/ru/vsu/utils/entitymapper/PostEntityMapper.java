package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.PostEntity;
import ru.vsu.service.serviceobject.PostSO;

import java.util.List;

@Mapper
public interface PostEntityMapper {
    PostSO postToSO(PostEntity postEntity);

    PostEntity postToEntity(PostSO postSO);

    List<PostSO> postListToSOList(List<PostEntity> postListEntity);

    List<PostEntity> postListToEntityList(List<PostSO> postListSO);
}
