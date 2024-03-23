// Date1.java

package model;



public class Date1{
    private int day;
    private int month;
    private int year;

    public Date1(int pDay, int pMonth, int pYear){
        this.day = pDay;
        this.month = pMonth;
        this.year = pYear;
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }

    public static String diffDatetoString(Date1 date){
        return date.year + "years, " + date.month + "months and" + date.day + "days \n";
    }

    public Date1 timeBetween(Date1 today){
        int diffDays = Math.abs(today.day - this.day);
        int diffMonths = Math.abs(today.month - this.month);
        int diffYear = Math.abs(today.year - this.year);
        Date1 diffDate = new Date1(diffDays, diffMonths, diffYear);
        
        return diffDate;
        
    }


}