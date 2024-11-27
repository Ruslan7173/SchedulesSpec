package com.example.SchedulesSpec;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SpecialistService {
    private final List<Specialist> specialists;

    public SpecialistService() {
        this.specialists = new ArrayList<>();

        specialists.add(new Specialist(1L, "Врачи специалисты"));
        specialists.add(new Specialist(2L, "Врачи-участковые педиаторы"));
        specialists.add(new Specialist(3L, "Перечень педиатрических участков"));
        specialists.add(new Specialist(4L, "Режим работы поликлиники"));
    }

    // Метод для получения всех специалистов
    public List<Specialist> getAllSpecialists() {
        return specialists;
    }

    // Метод для поиска специалиста по id
    public Optional<Specialist> getSpecialistById(Long id) {
        return specialists.stream()
                .filter(specialist -> specialist.getId().equals(id))
                .findFirst();
    }
}