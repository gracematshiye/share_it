package com.thoughtworks.warehouse.controller;

import com.thoughtworks.warehouse.entity.Computer;
import com.thoughtworks.warehouse.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/computers")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @RequestMapping(method = RequestMethod.GET)
    public String displayAll(ModelMap modelMap) {

        List<Computer> computers = computerService.getComputers();
        modelMap.addAttribute("computers", computers);

        modelMap.addAttribute("computer", new Computer());

        return "computers";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String saveComputer(@ModelAttribute(value = "computer") Computer computer, BindingResult result) {
        computerService.addComputer(computer);
        return "redirect:/computers"; //Go to GET /computers
    }
}
