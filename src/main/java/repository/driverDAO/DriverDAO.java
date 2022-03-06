package repository.driverDAO;

import bean.Driver;

import java.util.List;

public interface DriverDAO {
    List<Driver> getAll();

    List<Driver> search(String search);

    Driver getById(int id);

    boolean addNew(Driver driver);

    boolean update(Driver driver);

    boolean delete(Driver driver);

    int getMaxId();
}
