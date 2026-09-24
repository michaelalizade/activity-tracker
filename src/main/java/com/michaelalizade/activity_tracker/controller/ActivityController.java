package com.michaelalizade.activity_tracker.controller;

import com.michaelalizade.activity_tracker.service.ActivityService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ActivityController {

    private final ActivityService activityService;

    @GetMapping("/activities")
    public List<String> getActivities() {
        return activityService.getActivities();
    }

    @PostMapping("/activities/log")
    public List<String> logActivity(@RequestBody String activity){
        return activityService.logActivity(activity);
    }

}
