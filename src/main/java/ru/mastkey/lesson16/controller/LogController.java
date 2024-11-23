package ru.mastkey.lesson16.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mastkey.lesson16.LogService;
import ru.mastkey.lesson16.aop.StructuralLogWithRequestIdFieldAnnotation;

@Slf4j
@RestController
@RequiredArgsConstructor
public class LogController {
    private final LogService logService;

    @GetMapping("/log")
    @StructuralLogWithRequestIdFieldAnnotation
    public void log() {
        log.info("logController start");
        logService.logMethod();
        log.info("logController end");
    }
}
