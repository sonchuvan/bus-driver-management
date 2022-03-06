package service;

import bean.BusRoute;
import bean.Driver;
import bean.roster.Roster;
import controller.RosterController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RosterDAO.RosterDAOImp;

import java.util.List;

@Service
public class RosterService {

    @Autowired
    RosterDAOImp rosterDAOImp;

    public List<Roster> getAllRoster(){
        return rosterDAOImp.getAll();
    }

    public List<Integer> getDriverIdList(){
        return rosterDAOImp.getDriverIdList();
    }

    public List<Integer> getBusRouteIdList(){
        return rosterDAOImp.getBusRouteIdList();
    }

    public Roster getRoster(Driver driver, BusRoute busRoute){
        return rosterDAOImp.getRoster(driver,busRoute);
    }

    public boolean saveRoster(Roster roster){
        return rosterDAOImp.addNew(roster);
    }

    public boolean deleteRoster(Roster roster){
        return rosterDAOImp.delete(roster);
    }
}
