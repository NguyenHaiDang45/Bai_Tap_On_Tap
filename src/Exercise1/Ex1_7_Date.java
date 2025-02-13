package Exercise1;

public class Ex1_7_Date {
    private int day;
    private int month;
    private int year;

    public Ex1_7_Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Ex1_7_Date() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
