package com.example.SchedulesSpec;


public class Specialist {
    private Long id;
    private String name;
    private String name1;
    private String name2;

    public Specialist(Long id, String name, String name1, String name2) {
        this.id = id;
        this.name = name;
        this.name1 = name1;
        this.name2 = name2;
    }

    public Specialist(String name1, String name, Long id) {
        this.name1 = name1;
        this.name = name;
        this.id = id;
    }

    // Конструктор
    public Specialist(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public String getName1() {
        return name1;
    }

    // Геттеры
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}