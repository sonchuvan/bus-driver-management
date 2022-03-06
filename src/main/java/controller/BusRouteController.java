package controller;

import bean.BusRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.BusRouteService;

@Controller
@RequestMapping("/")
public class BusRouteController {

    @Autowired
    BusRouteService busRouteService;

    @RequestMapping(value = "/busRoute", method = RequestMethod.GET)
    public ModelAndView busRoute(){
        ModelAndView modelAndView = new ModelAndView("view/BusRouteView");
        modelAndView.addObject("object",busRouteService.getAllBusRoute());
        return modelAndView;
    }

    @RequestMapping(value = "/busRoute/addOrEditBusRoute", method = RequestMethod.POST)
    public String addOrEdit(@ModelAttribute("busRoute") BusRoute busRoute, ModelMap modelMap){

        if(busRouteService.getById(busRoute.getBusRouteId())==null){
            busRouteService.addNewBusRoute(busRoute);
        }
        else {
            busRouteService.updateBusRoute(busRoute);
            System.out.println("update");
        }
        return "redirect:../busRoute";
    }

    @RequestMapping(value = "/busRoute/add", method = RequestMethod.GET)
    public ModelAndView addBusRoute(){
        ModelAndView modelAndView = new ModelAndView("view/AddOrEditBusRoute","command", new BusRoute(busRouteService.getMaxId()));
        modelAndView.addObject("status","Add new bus route");
        return modelAndView;
    }

    @RequestMapping(value = "/busRoute/edit")
    public ModelAndView editBusRoute(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("view/AddOrEditBusRoute","command", busRouteService.getById(id));
        modelAndView.addObject("status","Edit bus route");
        return modelAndView;
    }

    @RequestMapping(value = "/busRoute/delete")
    public String deleteBusRoute(@RequestParam int id){
        busRouteService.deleteBusRoute(busRouteService.getById(id));
        return "redirect:../busRoute";
    }
}
