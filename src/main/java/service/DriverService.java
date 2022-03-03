package service;

import bean.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.driverDAO.DriverDAOImp;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    DriverDAOImp driverDAOImp;

    public List<Driver> getAllDriver(){
        return driverDAOImp.getAll();
    }

    public Driver getById(int id){
        return driverDAOImp.getById(id);
    }

    public boolean addNewDriver(Driver driver){
        return driverDAOImp.addNew(driver);
    }

    public boolean updateDriver(Driver driver){
        return driverDAOImp.update(driver);
    }

    public boolean deleteDriver(Driver driver){
        return driverDAOImp.delete(driver);
    }
    public int getMaxId(){
        return driverDAOImp.getMaxId();
    }
}
