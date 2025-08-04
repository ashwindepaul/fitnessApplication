package com.fitness.activity_service.dto;

import java.time.LocalDateTime;
import java.util.Map;

import com.fitness.activity_service.model.ActivityType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class ActivityRequest {
	private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String, Object> additionalMetrics;
}
