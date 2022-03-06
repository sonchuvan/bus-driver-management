package controller;

import bean.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DriverService;

import java.util.Map;

@Controller
@RequestMapping("/")
public class DriverController {

    @Autowired
    DriverService driverService;

    @RequestMapping(value = "/driver",method = RequestMethod.GET)
    public ModelAndView driver(){
        ModelAndView modelAndView = new ModelAndView("view/DriverView");
        modelAndView.addObject("object",driverService.getAllDriver());
        return modelAndView;
    }

    @RequestMapping(value = "/driver/search", method = RequestMethod.GET)
    public ModelAndView searchDriver(@RequestParam String search){
        ModelAndView modelAndView = new ModelAndView("view/DriverView");
        modelAndView.addObject("object",driverService.searchDriver(search));
        return modelAndView;
    }

    @RequestMapping(value = "/driver/addOrEdit",method = RequestMethod.POST)
    public String addOrEditDriver(@ModelAttribute("driver") Driver driver, ModelMap modelMap){
        if(driverService.getById(driver.getDriverId())==null){
            driverService.addNewDriver(driver);
            System.out.println("add new");
        }
        else {
            driverService.updateDriver(driver);
            System.out.println("update");
        }
        return "redirect:../driver";
    }

    @RequestMapping(value = "/driver/add",method = RequestMethod.GET)
    public ModelAndView addDriver(){
        ModelAndView modelAndView = new ModelAndView("view/AddOrEditDriver","command",new Driver(driverService.getMaxId()));
        modelAndView.addObject("status","Add new driver");
        return modelAndView;
    }

    @RequestMapping(value = "/driver/edit",method = RequestMethod.GET)
    public ModelAndView editDriver(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("view/AddOrEditDriver","command",driverService.getById(id));
        modelAndView.addObject("id",id);
        modelAndView.addObject("status","Edit driver");
        return modelAndView;
    }

    @RequestMapping(value = "/driver/delete",method = RequestMethod.GET)
    public String deleteDriver(@RequestParam int id){
        driverService.deleteDriver(driverService.getById(id));
        return "redirect:../driver";
    }

    @ModelAttribute("levelList")
    public Map<String, String> getLevelList(){
        return driverService.getLevelList();
    }

}
