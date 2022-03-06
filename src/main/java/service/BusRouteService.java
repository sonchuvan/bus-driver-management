package service;

import bean.BusRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.busRouteDAO.BusRouteDAOImp;

import java.util.List;

@Service
public class BusRouteService {
    @Autowired
    BusRouteDAOImp busRouteDAOImp;

    public List<BusRoute> getAllBusRoute(){
        return busRouteDAOImp.getAll();
    }

    public BusRoute getById(int id){
        return busRouteDAOImp.getById(id);
    }

    public int getMaxId() {
        return busRouteDAOImp.getMaxId();
    }

    public boolean addNewBusRoute(BusRoute busRoute) {
        return busRouteDAOImp.addNew(busRoute);
    }

    public boolean updateBusRoute(BusRoute busRoute) {
        return busRouteDAOImp.update(busRoute);
    }

    public boolean deleteBusRoute(BusRoute busRoute){
        return busRouteDAOImp.delete(busRoute);
    }
}
