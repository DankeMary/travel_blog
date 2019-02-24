package ru.vsu.database.dao.impl;

import org.springframework.stereotype.Repository;
import ru.vsu.database.dao.RegionDao;
import ru.vsu.database.entity.RegionEntity;

@Repository
public class RegionDaoImpl extends AbstractDaoImpl<RegionEntity, Integer> implements RegionDao {
}
