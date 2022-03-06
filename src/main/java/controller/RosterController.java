package controller;

import bean.roster.Roster;
import bean.roster.RosterTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.RosterService;

@Controller
@RequestMapping("/")
public class RosterController {

    @Autowired
    RosterService rosterService;

    @RequestMapping(value = "/roster", method = RequestMethod.GET)
    public ModelAndView roster(){
        ModelAndView modelAndView = new ModelAndView("view/RosterView");
        modelAndView.addObject("object",rosterService.getAllRoster());
        return modelAndView;
    }

    @RequestMapping(value = "/roster/add", method = RequestMethod.GET)
    public ModelAndView addOrEditRoster(@ModelAttribute("roster") Roster roster, ModelMap modelMap){
        ModelAndView modelAndView = new ModelAndView("view/AddOrEditRoster","command",new Roster());
        modelAndView.addObject("status","Add new Roster");
        return modelAndView;
    }
}
