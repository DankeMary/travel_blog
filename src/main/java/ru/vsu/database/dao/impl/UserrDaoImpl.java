package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.UserrDao;
import ru.vsu.database.entity.UserrEntity;

@Repository
public class UserrDaoImpl extends AbstractDaoImpl<UserrEntity, Integer> implements UserrDao {
}
