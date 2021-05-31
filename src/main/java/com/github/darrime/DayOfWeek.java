package com.github.darrime;

import java.util.Calendar;

public class DayOfWeek {
    public static String getDayOfWeek() {
        String today = null;
        Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 2:
                today = "월요일" ;
                return today;
            case 3:
                today = "화요일";
                return today;
            case 4:
                today = "수요일";
                return today;
            case 5:
                today = "목요일";
                return today;
            case 6:
                today = "금요일";
                return today;
            default:
                today = "주말";
                return today;
        }

    }
}
