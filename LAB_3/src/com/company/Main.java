package com.company;
import Dean.Dean;
import Factorial.*;
import Student.*;
import java.util.ArrayList;
import java.util.logging.Logger;


import Dean.SortBySecondName;

public class Main {
    // private static final Logger logger = Logger.getGlobal();
    private static final Logger logger2 = Logger.getLogger("FactorialException");

    static final Logger logger = Logger.getLogger(String.valueOf(Main.class));


    public static void main(String[] args) {

        Dean dean = new Dean();
        ArrayList<Student> studList = new ArrayList<Student>();
        dean.FillList(studList);

        //dean.ShowCursCount(studList);
       //  dean.ShowDayForm(studList);
        // dean.ShowNightForm(studList);
         dean.SortSecondName(studList);
        // dean.SortSecondName(studList);


        try {
            int result = Factorial.getFactorial(2);
            System.out.println(result);
        } catch (FactorialException ex) {
             logger2.info("Факториал должен быть больше чем 1");
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }

    }
}
