package com.rays.loop;

public class Rupies {

	public static void main(String[]args) {
		int amt = 5640;
		int a=0, b=0,c=0, d=0, e=0, f=0;
		  
		 while(amt >= 2000) {
			 a= amt / 2000;
			 amt = amt % 2000;
			 System.out.println("total number of 2000 rupees notes = "+ a);
			 break;
		 }
		 while ( amt >= 500 ){ 
		b = amt / 500 ;
		 amt = amt % 500;
		 System.out.println("total number Of 500 rupees notes = "+b);
		 break ;
		 } 
		 while (amt >= 100){
		c = amt / 100 ;
		 amt = amt % 100;
		 System.out.println("total number Of 100 rupees notes = "+ c) ;
		 break ;
		 }
		 while (amt >= 50){
		 d = amt / 50 ;
		 amt = amt % 50;
		 System.out.println("total number Of 50 rupees notes = "+ d) ;
		 break ;
		 }
		 while (amt >= 20)
		 {
		e = amt / 20 ;
		 amt = amt % 20;
		 System.out.println("total number Of 20 rupees notes = "+ e) ;
		 break ;
		 }
		 while (amt >= 10){
		 f = amt / 10 ;
		 amt = amt % 10;
		 System.out.println("total number Of 10 rupees notes = "+ f);
		 break ;
		 }
		 
		 }
}
