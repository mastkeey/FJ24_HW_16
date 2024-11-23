package ru.mastkey.lesson16;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogService {
    public void logMethod() {
        log.info("logMethod");
    }
}
