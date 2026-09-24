package com.michaelalizade.activity_tracker.service.impl;

import com.michaelalizade.activity_tracker.service.ActivityService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    private List<String> activities; // todo: Should have list of activities through a User. Need DB for this

    // todo: Added DB dependencies, need to configure DB before next launch. Likely need Liquibase migrations.

    @PostConstruct
    @Override
    public void loadActivities() {
        activities = List.of();
    }

    @Override
    public List<String> getActivities() {
        return activities;
    }

    @Override
    public List<String> logActivity(String activity) {
        List<String> fucks = addToActivities(activity, activities);
        activities = fucks;
        return fucks;
    }

    // todo: remove after real functionality persists
    private List<String> addToActivities(String activity, List<String> activities) {
        List<String> newList = new ArrayList<>(activities);
        newList.add(activity);
        return newList;
    }

}
