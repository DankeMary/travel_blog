package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.AttachmentDao;
import ru.vsu.database.entity.AttachmentEntity;
import ru.vsu.travelapp.bean.AttachmentBean;
import ru.vsu.utils.beanmapper.AttachmentBeanMapper;
import ru.vsu.utils.beanmapper.AttachmentBeanMapperImpl;
import ru.vsu.utils.entitymapper.AttachmentEntityMapper;
import ru.vsu.utils.entitymapper.AttachmentEntityMapperImpl;

import java.util.List;

@Service("attachmentService")
@Transactional
public class AttachmentService {
    private AttachmentDao attachmentDao;
    private AttachmentEntityMapper entityMapper = new AttachmentEntityMapperImpl();
    private AttachmentBeanMapper beanMapper = new AttachmentBeanMapperImpl();

    public AttachmentBean attachmentEntityToBean(AttachmentEntity attachment) {
        return beanMapper.attachmentToBean(entityMapper.attachmentToSO(attachment));
    }

    public AttachmentEntity attachmentBeanToEntity(AttachmentBean attachment) {
        return entityMapper.attachmentToEntity(beanMapper.attachmentToSO(attachment));
    }

    public List<AttachmentBean> attachmentEntityListToBeanList(List<AttachmentEntity> attachments) {
        return beanMapper.attachmentListToBeanList(entityMapper.attachmentListToSOList(attachments));
    }

    @Autowired
    public void setAttachmentDao(AttachmentDao attachmentDao) {
        this.attachmentDao = attachmentDao;
    }
}
