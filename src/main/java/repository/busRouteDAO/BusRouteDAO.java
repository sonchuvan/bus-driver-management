package repository.busRouteDAO;

import bean.BusRoute;

import java.util.List;

public interface BusRouteDAO {

    List<BusRoute> getAll();

    BusRoute getById(int id);

    boolean addNew(BusRoute busRoute);

    boolean update(BusRoute busRoute);

    boolean delete(BusRoute busRoute);

    int getMaxId();
}
