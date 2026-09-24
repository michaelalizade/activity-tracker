package com.michaelalizade.activity_tracker.entity.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class ActivityRequestDto {
    private String action;
    private int minutes;
    private LocalDate date;
}
