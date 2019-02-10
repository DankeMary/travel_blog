package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.CommentaryEntity;
import ru.vsu.service.serviceobject.CommentarySO;

import java.util.List;

@Mapper
public interface CommentaryEntityMapper {
    CommentarySO commentaryToSO(CommentaryEntity commEntity);

    CommentaryEntity commentaryToEntity(CommentarySO commSO);

    List<CommentarySO> commentaryListToSOList(List<CommentaryEntity> commListEntity);

    List<CommentaryEntity> commentaryListToEntityList(List<CommentarySO> commListSO);
}
