package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.PostPieceEntity;
import ru.vsu.service.serviceobject.PostPieceSO;

import java.util.List;

@Mapper
public interface PostPieceEntityMapper {
    PostPieceSO postPieceToSO(PostPieceEntity pPieceEntity);

    PostPieceEntity postPieceToEntity(PostPieceSO pPieceSO);

    List<PostPieceSO> postPieceListToSOList(List<PostPieceEntity> pPieceListEntity);

    List<PostPieceEntity> postPieceListToEntityList(List<PostPieceSO> pPieceListSO);
}
