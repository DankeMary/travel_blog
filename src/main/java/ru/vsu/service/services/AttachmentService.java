package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.AttachmentDao;
import ru.vsu.utils.beanmapper.AttachmentBeanMapper;
import ru.vsu.utils.beanmapper.AttachmentBeanMapperImpl;
import ru.vsu.utils.entitymapper.AttachmentEntityMapper;
import ru.vsu.utils.entitymapper.AttachmentEntitytMapperImpl;

@Service("attachmentService")
@Transactional
public class AttachmentService {
    private AttachmentDao attachmentDao;
    private AttachmentEntityMapper entityMapper = new AttachmentEntitytMapperImpl();
    private AttachmentBeanMapper beanMapper = new AttachmentBeanMapperImpl();

    @Autowired
    public void setAttachmentDao(AttachmentDao attachmentDao) {
        this.attachmentDao = attachmentDao;
    }
}
