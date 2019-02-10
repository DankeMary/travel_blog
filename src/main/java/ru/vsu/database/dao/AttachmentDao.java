package ru.vsu.database.dao;

public interface AttachmentDao {

}

public interface RouteDAO extends AbstractDao<RouteDO, Integer> {
    List<RouteDO> getRoutesByTrainId(int trainId);
}