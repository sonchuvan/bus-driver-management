package main;

import bean.Driver;
import repository.driverDAO.DriverDAOImp;

import java.util.List;

public class MainRun {
    public static void main(String[] args) {
        DriverDAOImp driverDAOImp = new DriverDAOImp();

        List<Driver> drivers = driverDAOImp.getAll();

        drivers.forEach(driver -> System.out.println(driver));
    }
}
