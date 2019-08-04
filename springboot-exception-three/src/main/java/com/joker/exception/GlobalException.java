package com.joker.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value={NullPointerException.class})
    public ModelAndView nullPointerException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        modelAndView.setViewName("error");
        return modelAndView;
    }


    @ExceptionHandler(value={ArithmeticException.class})
    public ModelAndView arithmeticException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        modelAndView.setViewName("error2");

        return modelAndView;
    }

    @ExceptionHandler(value = {ArrayIndexOutOfBoundsException.class})
    public ModelAndView arrayIndexOutOfBoundsException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        modelAndView.setViewName("error2");
        return modelAndView;

    }
}
