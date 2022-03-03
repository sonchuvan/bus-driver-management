package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import repository.driverDAO.DriverDAOImp;

@Controller
@RequestMapping("/")
public class DriverController {

    DriverDAOImp driverDAOImp = new DriverDAOImp();

    @RequestMapping(value = "/driver",method = RequestMethod.GET)
    public ModelAndView driver(){
        ModelAndView modelAndView = new ModelAndView("view/DriverView");
        modelAndView.addObject("object",driverDAOImp.getAll());
        return modelAndView;
    }

}
