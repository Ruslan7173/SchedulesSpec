package com.example.SchedulesSpec;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SpecialistController {

    private final SpecialistService specialistService;

    public SpecialistController(SpecialistService specialistService) {
        this.specialistService = specialistService;
    }

    @GetMapping("/")
    public String index(Model model) {
        return "index"; // Главная страница с таблицей
    }

    @GetMapping("/specialist-schedule")
    public String specialistSchedule(Model model) {
        List<Specialist> specialists = specialistService.getAllSpecialists();
        model.addAttribute("specialists", specialists);
        return "specialist_schedule"; // Расписание врача специалиста
    }

    @GetMapping("/pediatrician-schedule")
    public String pediatricianSchedule(Model model) {
        return "pediatrician_schedule"; // Расписание врачей-участковых педиаторов
    }

    @GetMapping("/pediatric_sections")
    public String pediatricSections(Model model) {
        return "pediatric_sections"; // Перечень педиатрических участков
    }

    @GetMapping("/working-hours")
    public String workingHours(Model model) {
        return "working_hours"; // Режим работы поликлиники
    }
}