package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.AttachmentSO;
import ru.vsu.travelapp.bean.AttachmentBean;

import java.util.List;

@Mapper
public interface AttachmentBeanMapper {
    AttachmentSO attachmentToSO(AttachmentBean aBean);

    AttachmentBean attachmentToBean(AttachmentSO aSO);

    List<AttachmentSO> attachmentListToSOList(List<AttachmentBean> aListBean);

    List<AttachmentBean> attachmentListToBeanList(List<AttachmentSO> aListSO);
}
