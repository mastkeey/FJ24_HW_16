package ru.mastkey.lesson16.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CustomMetricsController {

    private final Counter customCounter;

    public CustomMetricsController(MeterRegistry registry) {
        this.customCounter = registry.counter("custom_requests_total", "type", "custom_metric");
    }

    @GetMapping("/custom")
    public void incrementCustomMetric() {
        log.info("Custom metric incremented");
        customCounter.increment();
    }
}