package com.munsun.notifications.dto.out;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TrainDtoOut(
        String type,
        Long weight,
        Long axes,
        Long units,
        @JsonProperty("tail")
        String tailWagonNumber,
        @JsonProperty("oncoming")
        String oncomingWagonNumber
) {}