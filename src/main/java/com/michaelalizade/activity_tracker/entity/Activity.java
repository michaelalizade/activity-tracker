package com.michaelalizade.activity_tracker.entity;

import java.time.LocalDate;

//todo: Entity and table maybe? Plan out User <-> List<Activities> relationship and field relations
public class Activity {
    private String action;
    private int minutes;
    private LocalDate date;
}
