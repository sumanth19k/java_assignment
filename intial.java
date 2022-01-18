package intial_project;

import java.lang.Math;

public class intial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// widening (int can be convereted to float not vice versa)
		//int a=10;
		//float b=a;
		
//		double a=Math.sqrt(25);
//		
//		System.out.println((float)3+4);
//		System.out.println("this is my first \'java class\'");
//		System.out.println(a);
		
//		

		// 1. operators
		System.out.println("i) shift operator");
		int a = 5;
		System.out.println(a<<1); 
		System.out.println(a>>1);
		
		System.out.println("ii) logical operator"); 
		int b=5, c=10, d=3 ;
		System.out.println(c>d && b<d);
		System.out.println(c>d || b<d);
		
		System.out.println("iii) ternary assignment");
		System.out.println((b>d)? "b is greater":"d is greater");
		
		// 2. prime number
		boolean flag=true;
		 for (int i = 2; i < c; i++) {
	            if (c % i == 0) {
	                flag=false;
	                break;
	            }           	
	            }
		 if(flag)
		 System.out.println(c+" is a prime number");
		 else System.out.println(c+" is not a prime number");
		 
		 // 3. leap year or not
		 int year = 2000;
		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println(year+" is a leap year");
	      else
	         System.out.println(year+" is not a leap year");
		 
		 // 4. sum of first 10 numbers
		 int sum=0;
		 for(int i=0;i<=10;i++) {
			 sum+=i;
			 
		 }
		 System.out.println(sum);
		 // 5. switch statement
		 int day = 5;
	        String dayName;

	        switch (day) {
	        case 1:
	            dayName = "Monday";
	            break;
	        case 2:
	            dayName = "Tuesday";
	            break;
	        case 3:
	            dayName = "Wednesday";
	            break;
	        case 4:
	            dayName = "Thursday";
	            break;
	        case 5:
	            dayName = "Friday";
	            break;
	        case 6:
	            dayName = "Saturday";
	            break;
	        case 7:
	            dayName = "Sunday";
	            break;
	        default:
	            dayName = "Invalid day";
	        }
	        System.out.println(dayName);
	}

}
