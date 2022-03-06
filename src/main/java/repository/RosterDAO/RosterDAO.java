package repository.RosterDAO;

import bean.BusRoute;
import bean.Driver;
import bean.roster.Roster;

import java.util.List;

public interface RosterDAO {

    List<Roster> getAll();

    Roster getById(int id);

    boolean addNew(Roster roster);

    boolean update(Roster roster);

    boolean delete(Roster roster);

    List<Driver> getDistinct();

    boolean checkDriverFromDrivingList(int driverId);

    long totalRouteQuantity(Driver driver);

    Roster getBusRouteFromRoster(Driver driver, BusRoute busRoute);
}
