package com.carpetcalculator;

import com.carpetcalculator.calculator.Calculator;
import com.carpetcalculator.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarpetCalculatorApplication {

    public static void main(String[] args) throws Exception {

        ApplicationContext container = SpringApplication.run(CarpetCalculatorApplication.class, args);

        Calculator calculator = container.getBean("calculator", Calculator.class);

        System.out.println(calculator.getTotalCarpetCost(City.FAIRFAX));

    }

}
