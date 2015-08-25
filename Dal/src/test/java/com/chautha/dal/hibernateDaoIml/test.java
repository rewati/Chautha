package com.chautha.dal.hibernateDaoIml;

import org.junit.Test;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author Rewati Raman
 */
public class test {
    @Test
    public void test1(){
        System.out.println(getTheRequiredString("2389"));
        System.out.println(getTheRequiredString("2459"));
        System.out.println(getTheRequiredString("739"));
        System.out.println(getTheRequiredString("0002"));
        System.out.println(get1TheRequiredString("938989"));
        System.out.println(get1TheRequiredString("0023"));
        System.out.println(get1TheRequiredString("938989"));
    }

    public String getTheRequiredString(String s) {
        String returnString = null;
        Integer i=null;
        try{
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            // Do what you need to do in it is not a integer
            return returnString;
        }
        if(i>=1000&&i<=9999) {
            returnString = s.substring(0,2)+"x"+s.substring(2,4);
        } else {
            // Do what you need to do if the number is not 4 digit
        }
        return returnString;
    }

    public String get1TheRequiredString(String s) {
        String returnString = null;
        if(s != null && s.length() == 4) {
            try {
                NumberFormat.getInstance().parse(s);
                returnString = s.substring(0,1)+"x"+s.substring(2,3);
            } catch(ParseException e) {
// not a number
                returnString = s;
            }
        }
        return returnString;
    }
}
