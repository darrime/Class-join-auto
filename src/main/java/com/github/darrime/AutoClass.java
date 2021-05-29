package com.github.darrime;


import java.sql.*;


import java.util.Calendar;
import java.util.Scanner;

public class AutoClass {
    public static void loading() {
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int li = 2;

        if(dayOfWeek % 2 == 0) {
            li = 6;
        } else if(dayOfWeek % 2 != 0){
            li = 7;
        }
        String[] subList = new String[li];
        System.out.println("과목 입력: ");
        for(int i = 0; i < li; i++) {
            subList[i] = sc.nextLine();
        }
        System.out.println("오늘의 과목은: ");
        for(int i = 0; i < li; i++) {
            ClassList.loading(subList[i]);
            System.out.println(subList[i]);

        }
    }



    public static void main(String[] args)  {
        System.out.println(DataBase.init());
    }
}
