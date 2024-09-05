package userdefinedException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = sc.nextInt();
		System.out.println("enter your weight:");
		int weight = sc.nextInt();
		try {
			Method.validate(age,weight);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
