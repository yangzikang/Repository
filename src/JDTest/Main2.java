package JDTest;

import java.util.Scanner;

public class Main2 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int number3 =0;
		
		int []wei1 = new int[length];
		int []wei2 = new int[length];
		int []wei3 = new int[length];
		
		
		for(int i=0;i<length;i++){
			wei1[i]=number1%10;
			wei2[i]=number2%10;
			number1 /=10;
			number2 /=10;
			if(wei1[i]==wei2[i]){
				wei3[i] = 0;
			}
			else{
				wei3[i] = 1; 
			}
		}
		
		for(int i= 0,j = 1;i<length;i++){
			number3+=wei3[i]*j;
			j=j*2;
		}
		
		System.out.println(number3);
		
	}
}
