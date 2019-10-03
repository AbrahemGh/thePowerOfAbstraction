package TE1;

public class Date{
    private int month;
    private int day;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0) {
            this.month=month;
        } else {
            this.month=1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>0) {
            this.day=day;
        } else {
            this.day=1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year=year;
        } else {
            this.year=1994;
        }
    }

    private int year;
    public Date(int month, int day, int year) {
        this.setMonth( month);
        this.setDay( day);
        this.setYear(year);
    }

    @Override
    public String toString() {
        return "Date:" +
                  month +
                "/" + day +
                "/" + year
                ;//
    }
    public void displayDate(){
        System.out.println(this.toString());
    }
}

