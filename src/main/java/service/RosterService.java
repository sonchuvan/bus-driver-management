package service;

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
}
