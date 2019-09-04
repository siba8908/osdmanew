package com.sunjray.osdma.common;


import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Days {
	
 public static int calculateWorkingDay() {
		 SimpleDateFormat sdf=new SimpleDateFormat("MM");
		 SimpleDateFormat sdf1=new SimpleDateFormat("YYYY");
		 Calendar cal =Calendar.getInstance();
		 cal.add(Calendar.MONTH,-1);
	
    String month = sdf.format(cal.getTime());
    
		
		  String result = sdf1.format(cal.getTime()); 
		  int year = Integer.parseInt(result);
		 	
		
     int number_Of_DaysInMonth = 0; 
     String MonthOfName = "Unknown";
		  
     switch (month) {
     case "01":
         MonthOfName = "January";
         number_Of_DaysInMonth = 31;
         break;
     case "02":
   	 
			MonthOfName = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				number_Of_DaysInMonth = 29;
			} else {
				number_Of_DaysInMonth = 28;
			}
         
         break;
     case "03":
         MonthOfName = "March";
         number_Of_DaysInMonth = 31;
         break;
     case "04":
         MonthOfName = "April";
         number_Of_DaysInMonth = 30;
         break;
     case "05":
         MonthOfName = "May";
         number_Of_DaysInMonth = 31;
         break;
     case "06":
         MonthOfName = "June";
         number_Of_DaysInMonth = 30;
         break;
     case "07":
         MonthOfName = "July";
         number_Of_DaysInMonth = 31;
         break;
     case "08":
         MonthOfName = "August";
         number_Of_DaysInMonth = 31;
         break;
     case "09":
         MonthOfName = "September";
         number_Of_DaysInMonth = 30;
         break;
     case "10":
         MonthOfName = "October";
         number_Of_DaysInMonth = 31;
         break;
     case "11":
         MonthOfName = "November";
         number_Of_DaysInMonth = 30;
         break;
     case "12":
         MonthOfName = "December";
         number_Of_DaysInMonth = 31;
 }
    
//    System.out.println(number_Of_DaysInMonth);
//     System.out.println(MonthOfName);
//		
	 
	    
		  return number_Of_DaysInMonth;
		}
 
 public static List<LocalDate> weeksInCalendar(YearMonth month) {
	    List<LocalDate> firstDaysOfWeeks = new ArrayList<>();
	    for (LocalDate day = firstDayOfCalendar(month); stillInCalendar(month, day); day = day
	        .plusWeeks(1)) {
	      firstDaysOfWeeks.add(day);
	    }
	    return firstDaysOfWeeks;
	  }

	  private static LocalDate firstDayOfCalendar(YearMonth month) {
	    DayOfWeek FIRST_DAY_OF_WEEK = DayOfWeek.SUNDAY;
	    return month.atDay(1).with(FIRST_DAY_OF_WEEK);
	  }

	  private static boolean stillInCalendar(YearMonth yearMonth, LocalDate day) {
	    return !day.isAfter(yearMonth.atEndOfMonth());
	  }
	/*
	 * public static void main(String[] strings) {
	 * 
	 * System.out.println(calculateWorkingDay()); }
	 */
	
	}


