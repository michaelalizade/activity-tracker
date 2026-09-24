package com.michaelalizade.activity_tracker.service;

import java.util.List;

public interface ActivityService {

    void loadActivities();

    List<String> getActivities();

    List<String> logActivity(String activity);
}
