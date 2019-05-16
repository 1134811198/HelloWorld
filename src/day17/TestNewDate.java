package day17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Test;

public class TestNewDate {
	@Test
  public void test1(){
		LocalDateTime ldt=LocalDateTime.now();
		 System.out.println(ldt);
		 System.out.println(ldt.getYear());
		 System.out.println(ldt.getMonth());
		  System.out.println(ldt.getMonthValue());
		  System.out.println(ldt.getDayOfMonth());
		  System.out.println(ldt.getHour());
		  System.out.println(ldt.getMinute());
		  System.out.println(ldt.getSecond());
	  LocalDate ld=LocalDate.now();
	  System.out.println(ld);
	  System.out.println(ld.getYear());
	  System.out.println(ld.getMonth());
	  System.out.println(ld.getMonthValue());
	  System.out.println(ld.getDayOfMonth());
	  LocalTime lt=LocalTime.now();
	  System.out.println(lt);
	  System.out.println(lt.getHour());
	  System.out.println(lt.getMinute());
	  System.out.println(lt.getSecond());
  }
	
}
