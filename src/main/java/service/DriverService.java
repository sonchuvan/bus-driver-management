package service;

import bean.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.driverDAO.DriverDAOImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<Driver> searchDriver(String search){
        return driverDAOImp.search(search);
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

    public Map<String,String> getLevelList(){
        Map<String, String> levelList = new HashMap<>();
        levelList.put(Driver.A,"A");
        levelList.put(Driver.B,"B");
        levelList.put(Driver.C,"C");
        levelList.put(Driver.D,"D");
        levelList.put(Driver.E,"E");
        levelList.put(Driver.F,"F");
        return levelList;
    }
}
