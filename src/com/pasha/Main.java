package com.pasha;

import com.pasha.exceptions.ValidationFailedException;

public class Main {

    public static void main(String[] args) {
        Integer a = 9;
        Integer b = 98;

        String s = "iu";
        String x = "Iu";

        Double d = 7.9;

        ValidationSystem v = new ValidationSystem();

        try {
            v.validate(d);
        }catch (ValidationFailedException ex){
            ex.printStackTrace();
        }

       /* try {
            v.validate(a);
            v.validate(b);
        } catch (ValidationFailedException ex) {
            ex.printStackTrace();
        }*/

        try {
            v.validate(x);
            v.validate(s);
        }catch (ValidationFailedException ex){
            ex.printStackTrace();
        }


    }
}
