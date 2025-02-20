package Exercise3.Ex3_5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    private static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    private static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) return false;
        int maxDays = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) maxDays = 29;
        return day >= 1 && day <= maxDays;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    public void setYear(int year) {
        if (isValidDate(year, month, day)) this.year = year;
    }

    public void setMonth(int month) {
        if (isValidDate(year, month, day)) this.month = month;
    }

    public void setDay(int day) {
        if (isValidDate(year, month, day)) this.day = day;
    }

    public String toString() {
        int dayOfWeekIndex = getDayOfWeek(year, month, day);
        return DAYS[dayOfWeekIndex] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            return new MyDate(year, month, day + 1);
        } else if (month == 12) {
            return new MyDate(year + 1, 1, 1);
        } else {
            return new MyDate(year, month + 1, 1);
        }
    }

    public MyDate nextMonth() {
        if (month == 12) {
            return new MyDate(year + 1, 1, day);
        }
        return new MyDate(year, month + 1, day);
    }

    public MyDate nextYear() {
        return new MyDate(year + 1, month, day);
    }

    public MyDate previousDay() {
        if (day > 1) {
            return new MyDate(year, month, day - 1);
        } else if (month == 1) {
            return new MyDate(year - 1, 12, 31);
        } else {
            int prevMonth = month - 1;
            int prevDay = DAYS_IN_MONTHS[prevMonth - 1];
            if (prevMonth == 2 && isLeapYear(year)) prevDay = 29;
            return new MyDate(year, prevMonth, prevDay);
        }
    }

    public MyDate previousMonth() {
        if (month == 1) {
            return new MyDate(year - 1, 12, day);
        }
        return new MyDate(year, month - 1, day);
    }

    public MyDate previousYear() {
        return new MyDate(year - 1, month, day);
    }
}

