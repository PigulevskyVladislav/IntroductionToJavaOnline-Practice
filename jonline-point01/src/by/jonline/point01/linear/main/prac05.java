package by.jonline.point01.linear.main;

import java.util.Scanner;

public class prac05 {
	
	public static void main(String args[]) {
		
		int sec_pool, secs, mins, hours;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the count of seconds: ");
		sec_pool = s.nextInt();
		s.close();
		
		hours = sec_pool / 3600;
		mins = (sec_pool - hours * 3600) / 60;
		secs = (sec_pool - hours * 3600 - mins * 60);
		System.out.println("Result: " + hours + "ч " + mins + "мин " + secs + "с.");
	}
}
