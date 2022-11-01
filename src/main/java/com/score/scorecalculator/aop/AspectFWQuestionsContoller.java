package com.score.scorecalculator.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Log4j2
@Component
public class AspectFWQuestionsContoller {

    // before the method call
    @Before("execution(* com.score.scorecalculator.controller.FWQuestionsController.add(..))")
    public void doAccessCheck(JoinPoint joinPoint) {   log.info("before add question call..");}

    //dummy method to define pointcut
    // any repository custom method call will be taken here
    @Pointcut("within(@org.springframework.stereotype.Repository *)")
    public void repositoryClassMethods() {
    }

    // work around above pointcut
    @Before("repositoryClassMethods()")
    public void pointcut(){
        log.info("withing repo call");

    }

// we can achieve the functionality of both @Before and @After advice. For this we need to create a method annotated with @Around in aspect class
    @Around("execution(* com.score.scorecalculator.controller.FWQuestionsController.getById(..))")
    public void aroundMethod(ProceedingJoinPoint joinPoint){
        log.info("@Around: Before calculation-"+ new Date());
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        log.info("@Around: After calculation-"+ new Date());
    }


}
