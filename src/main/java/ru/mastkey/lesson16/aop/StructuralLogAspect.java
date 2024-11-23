package ru.mastkey.lesson16.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Aspect
@Component
public class StructuralLogAspect {
    @Around("@annotation(ru.mastkey.lesson16.aop.StructuralLogWithRequestIdFieldAnnotation)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        var requestId = UUID.randomUUID().toString();
        try (var ignored = MDC.putCloseable("RequestId", requestId)) {
            return pjp.proceed();
        }
    }
}
