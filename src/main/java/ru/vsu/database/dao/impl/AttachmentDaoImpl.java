package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.AttachmentDao;
import ru.vsu.database.entity.AttachmentEntity;

@Repository
public class AttachmentDaoImpl extends AbstractDaoImpl<AttachmentEntity, Integer> implements AttachmentDao {
}
