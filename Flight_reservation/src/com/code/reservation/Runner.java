package com.code.reservation;
import java.util.Scanner; 

public class Runner {

	public static void main(String[] args) {
		
		
		
		//in.bookmyticket(8000);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter vendor name:");
		String vendor_name=sc.next();
		Yatra y=new Yatra();
		
		Makemytrip mmt=new Makemytrip();
		Indigo in=new Indigo();
        if(vendor_name.equals("Makemytrip")) {
			//System.out.println("sud1");
			mmt.bookmytrip(8000);
		}else if(vendor_name.equals("Yatra"))
		{
		//System.out.println("sud2");
			y.bookmytrip(8000);
		}
		else {
			
			System.out.println("you entered wrong data");
		}

	}

}
