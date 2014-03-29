package com.calculate;
import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner firstprize = new Scanner(System.in);
		Scanner secondprize = new Scanner(System.in);
		System.out.println("Enter first prize");
		 double x = firstprize.nextInt();
		 System.out.println("Enter second prize");
		 double y = secondprize.nextInt();
		 double z = x-y;
		 String a = "Your Result is";
		 System.out.println(a+z);



	}

}
