public class Date
{
   private int month;
   private int day;
   private int year;

public Date(int yr, int mo, int d){
   year = yr;
   day = d;
   month = mo;
}
public int getDay(){
   return day;

}
public int getMonth(){
return month;
}
public int getYear(){
return year;
}
public String toString(){
//Returns a String representation of this Date in Year/Month/Day order, such as "2006/07/22".
return(year+"/"+month+"/"+day);
}
public void addDays(int days){
day+=days;
}
public void addWeeks(int weeks){
day+=(weeks*7);
}
public boolean equals(Date that){
return (that.toString() == (year+"/"+month+"/"+day));
}
public int daysInMonth(){
return 30;
}
public boolean isLeapYear()
{
   if(year%400==0) return true;             // century years are special cases
     else if (year% 100 ==0) return false; // 1900 is not a leap year but 2000 is
       else if (year %4 ==0) return true;
         return false;
}
}