package com.michaelalizade.activity_tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

//todo: Entity and table maybe? Plan out User <-> List<Activities> relationship and field relations
@Entity
@Table(name = "activity")
public class Activity {
    @Id
    private String action; // todo: make sure string PK will scale; walk on dec 10th and apr 15th must not overlap/override
    private int minutes;
    private LocalDate date;
}
