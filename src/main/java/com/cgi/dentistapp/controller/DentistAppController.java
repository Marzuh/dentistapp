package com.cgi.dentistapp.controller;

import com.cgi.dentistapp.dto.DentistDTO;
import com.cgi.dentistapp.dto.DentistVisitDTO;
import com.cgi.dentistapp.service.DentistService;
import com.cgi.dentistapp.service.DentistVisitService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

@Controller
@EnableAutoConfiguration
public class DentistAppController extends WebMvcConfigurerAdapter {

    private final DentistVisitService dentistVisitService;
    private final DentistService dentistService;

    public DentistAppController(DentistVisitService dentistVisitService, DentistService dentistService) {
        this.dentistService = dentistService;
        this.dentistVisitService = dentistVisitService;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showMainPage() {
        return "index";
    }




    @GetMapping("/register")
    public String showRegisterForm(DentistDTO dentistDTO, DentistVisitDTO dentistVisitDTO, Model model) {
        model.addAttribute("dentistList", dentistService.getAllDentists());
        model.addAttribute("visitTimes", dentistVisitService.getAllFreeDentistVisits());
        return "form";
    }

    @PostMapping("/register")
    public String postRegisterForm(@Valid DentistVisitDTO dentistVisitDTO,DentistDTO dentistDTO,
                                   BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("dentistList", dentistService.getAllDentists());
            model.addAttribute("visitTimes", dentistVisitService.getAllFreeDentistVisits());
            return "form";
        }
        if (dentistVisitService.isVisitAvailable(dentistVisitDTO.getVisitId())) {
            dentistVisitService.addVisit(dentistVisitDTO.getVisitId(),
                    dentistVisitDTO.getVisitorId());
            return "redirect:/results";

        } else {
            model.addAttribute("savedDentistId", dentistVisitDTO.getDentistId());
            model.addAttribute("visitAlreadyBooked", "true");
            model.addAttribute("dentistList", dentistService.getAllDentists());
            model.addAttribute("visitTimes", dentistVisitService.getVisitsById(dentistVisitDTO.getDentistId()));
            return "form";
        }
    }

    @PostMapping("/register2")
    public String dentistChoosen(Model model, @Valid DentistDTO dentistDTO, DentistVisitDTO dentistVisitDTO,
                                 BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("dentistList", dentistService.getAllDentists());
            return "form";
        }
        model.addAttribute("dentistList", dentistService.getAllDentists());
        model.addAttribute("visitTimes", dentistVisitService.getVisitsById(dentistDTO.getDentistId()));
        model.addAttribute("savedDentistId", dentistDTO.getDentistId());

        return "form";
    }

    @GetMapping("/registered-visits")
    public String showRegisteredVisits(Model model) {
        model.addAttribute("registeredVisits", dentistVisitService.getRegisteredVisits());
        return "registered-visits";
    }

    @PostMapping("/delete-visit")
    public String deleteVisit(@Valid DentistVisitDTO dentistVisitDTO, Model model) {
        if (!dentistVisitService.getDentistVisitById(dentistVisitDTO.getVisitId()).isPresent()) {
            model.addAttribute("bookedTimeError", true);
        }else{
        dentistVisitService.delete(dentistVisitDTO.getVisitId());}
        return "redirect:/registered-visits";
    }


}

