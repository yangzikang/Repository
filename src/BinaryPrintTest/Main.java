package BinaryPrintTest;

import java.util.Scanner;

public class Main {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int x= -5;
		System.out.println(Integer.toBinaryString(x));
		x = x>>5;
		System.out.println(Integer.toBinaryString(x));
		x = x<<5;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(x);
	}
}
