package controller;

import bean.BusRoute;
import bean.Driver;
import bean.roster.Roster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.BusRouteService;
import service.DriverService;
import service.RosterService;

import java.util.List;

@Controller
@RequestMapping("/")
public class RosterController {

    @Autowired
    RosterService rosterService;
    @Autowired
    DriverService driverService;
    @Autowired
    BusRouteService busRouteService;

    @RequestMapping(value = "/roster", method = RequestMethod.GET)
    public ModelAndView roster(){
        ModelAndView modelAndView = new ModelAndView("view/RosterView");
        modelAndView.addObject("object",rosterService.getAllRoster());
        return modelAndView;
    }

    @RequestMapping(value = "/roster/addOrEditRoster",method = RequestMethod.POST)
    public String addRoster(@ModelAttribute("roster") Roster roster, ModelMap modelMap){

        Driver driver = driverService.getById(roster.getDriver().getDriverId());
        BusRoute busRoute = busRouteService.getById(roster.getBusRoute().getBusRouteId());
        roster.setDriver(driver);
        roster.setBusRoute(busRoute);
        rosterService.saveRoster(roster);
        return "redirect:../roster";
    }

    @RequestMapping(value = "/roster/add", method = RequestMethod.GET)
    public ModelAndView addRoster(){
        ModelAndView modelAndView = new ModelAndView("view/AddOrEditRoster","command",new Roster());
        modelAndView.addObject("status","Add new Roster");
        modelAndView.addObject("driverIdList",rosterService.getDriverIdList());
        modelAndView.addObject("busRouteIdList",rosterService.getBusRouteIdList());
        return modelAndView;
    }

    @RequestMapping(value = "/roster/edit",method = RequestMethod.GET)
    public ModelAndView editRoster(){
        ModelAndView modelAndView = new ModelAndView("view/AddOrEditRoster","command",new Roster());
        modelAndView.addObject("status","Edit Roster");
        modelAndView.addObject("driverIdList",rosterService.getDriverIdList());
        modelAndView.addObject("busRouteIdList",rosterService.getBusRouteIdList());
        return modelAndView;
    }

    @RequestMapping(value = "/roster/delete",method = RequestMethod.GET)
    public String deleteRoster(@RequestParam int driverId,@RequestParam int busRouteId){
        Driver driver = driverService.getById(driverId);
        BusRoute busRoute = busRouteService.getById(busRouteId);
        rosterService.deleteRoster(rosterService.getRoster(driver,busRoute));
        return "redirect:../roster";
    }

//    @ModelAttribute("driverIdList")
//    public List<Integer> getDriverIdList(){
//        return rosterService.getDriverIdList();
//    }
//
//    @ModelAttribute("busRouteIdList")
//    public List<Integer> getBusRouteIdList(){
//        return rosterService.getBusRouteIdList();
//    }
}
