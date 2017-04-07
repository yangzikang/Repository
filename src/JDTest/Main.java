package JDTest;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int []gailv = new int[length];
		for(int i=0;i<length;i++){
			gailv[i] = in.nextInt();
		}
		double jieguo = 0;
		int jidao = length*3;
		if(jidao%5!=0){
			jidao = jidao/5+1;
		}
		else{
			jidao = jidao/5;
		}
		
		for(int i=jidao;i<=length;i++){
			jieguo += C(i,length);
		}
		
		for(int i=0;i<length;i++){
			jieguo*=gailv[i];
			jieguo/=100;
		}
		BigDecimal bd = new BigDecimal(jieguo);
		jieguo = bd.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();	
		
		System.out.print(jieguo);
		
		
	}
	
	public static int C(int i,int total){
		int ta = 1;
		for(int j = total;j>i;j--){
			ta*=j;
		}
		return ta;
	}
}
