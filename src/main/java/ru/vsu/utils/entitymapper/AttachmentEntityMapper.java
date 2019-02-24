package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.AttachmentEntity;
import ru.vsu.service.serviceobject.AttachmentSO;

import java.util.List;

@Mapper//(uses= {LocalDateMapper.class, LocalTimeMapper.class})
public interface AttachmentEntityMapper {
    AttachmentSO attachmentToSO(AttachmentEntity aEntity);

    AttachmentEntity attachmentToEntity(AttachmentSO aSO);

    List<AttachmentSO> attachmentListToSOList(List<AttachmentEntity> aListEntity);

    List<AttachmentEntity> attachmentListToEntityList(List<AttachmentSO> aListSO);
}

