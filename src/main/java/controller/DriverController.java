package controller;

import bean.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DriverService;

import java.util.HashMap;
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
    @RequestMapping(value = "/driver/add",method = RequestMethod.GET)
    public ModelAndView addOrEdit(){
        ModelAndView modelAndView = new ModelAndView("view/AddOrEditDriver","command",new Driver(driverService.getMaxId()));
        modelAndView.addObject("status","Add new driver");
        return modelAndView;
    }

    @RequestMapping(value = "/driver/addOrEdit",method = RequestMethod.POST,produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String addDriver(@ModelAttribute("driver") Driver driver, ModelMap modelMap){
        driver.setDriverId(driverService.getMaxId());
        System.out.println(driverService.addNewDriver(driver));
        System.out.println(driver);
        return "redirect:../driver";
    }

    @RequestMapping(value = "/driver/edit",method = RequestMethod.GET)
    public ModelAndView editDriver(@RequestParam int id){
        Driver driver = driverService.getById(id);
        driverService.updateDriver(driver);
        ModelAndView modelAndView = new ModelAndView("view/AddOrEditDriver","command",driver);
        modelAndView.addObject("id",id);
        modelAndView.addObject("status","Edit driver");
        return modelAndView;
    }

    @RequestMapping(value = "/driver/delete",method = RequestMethod.GET)
    public String deleteDriver(@RequestParam int id){
        Driver driver = driverService.getById(id);
        System.out.println(driverService.deleteDriver(driver));
        return "redirect:../driver";
    }

    @ModelAttribute("levelList")
    public Map<String, String> getLevelList(){
        Map<String, String> countryList = new HashMap<>();
        countryList.put(Driver.A,"A");
        countryList.put(Driver.B,"B");
        countryList.put(Driver.C,"C");
        countryList.put(Driver.D,"D");
        countryList.put(Driver.E,"E");
        countryList.put(Driver.F,"F");
        return countryList;
    }

}
