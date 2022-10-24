package com.company;

import com.company.beverage.Beverage;
import com.company.beverage.DarkRoast;
import com.company.beverage.Espresso;
import com.company.beverage.HouseBlend;
import com.company.decorator.LowerCaseInputStream;
import com.company.decorator.Mocha;
import com.company.decorator.Soy;
import com.company.decorator.Whip;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
//        Beverage espresso = new Espresso();
//        System.out.println(espresso.getDescription() + "$" + espresso.cost());
//        //开始添加材料
//        Beverage darkRoast = new DarkRoast();
//        darkRoast = new Mocha(darkRoast);
//        darkRoast = new Mocha(darkRoast);
//        darkRoast = new Whip(darkRoast);
//        String a = darkRoast.getDescription();
//        System.out.println(darkRoast.getDescription() + "$" + darkRoast.cost());
//
//        Beverage hoseBlend = new HouseBlend();
//        hoseBlend = new Soy(hoseBlend);
//        hoseBlend = new Mocha(hoseBlend);
//        hoseBlend = new Whip(hoseBlend);
//        System.out.println(hoseBlend.getDescription() + "$" + hoseBlend.cost());
        System.out.println("------------结合Java I/O的装饰器------------");
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
