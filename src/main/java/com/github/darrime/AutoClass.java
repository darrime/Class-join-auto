package com.github.darrime;


import com.github.darrime.addOn.ClassList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AutoClass {
    public static void getClassTime() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date time = new Date();
        String time1 = format.format(time);


        System.out.println(time1);
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇교시 입니까?");
        int classTime = sc.nextInt();

        String dayOfweek = DayOfWeek.getDayOfWeek();

        System.out.println(dayOfweek);

        String subject = DataBase.init(dayOfweek, classTime);
        ClassList.loading(subject);
        System.out.println(subject);
    }
}
