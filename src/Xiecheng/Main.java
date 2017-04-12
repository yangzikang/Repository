package Xiecheng;

import java.util.Scanner;

public class Main {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int []numbers = new int[length];
		for(int i=0;i<length;i++){
			numbers[i] = in.nextInt();
		}
		int sum = 0;
		int max = 0;
		
		for(int i =0;i<length;i++){
			if(sum+numbers[i]>0){
				sum = sum+numbers[i];
			}
			else{
				sum = 0;
			}
			if(sum>max){
				max = sum;
			}
		}
		
		System.out.println(max);
	}
}
