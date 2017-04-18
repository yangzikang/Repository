package OrderTest;


import java.util.*;

public class Main {
	public static void main(String []args){
		int[] numbers = {3,2,1,5,4,6,7};
		//sortOrder(numbers);
		
	}
	
	/**
	 * 简单冒泡排序
	 * 时间复杂度O(n^2)
	 * 稳定的
	 * @param numbers
	 */
	public static void sortOrder(int[] numbers){
		for(int i=0;i<numbers.length-1;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[j]<numbers[i]){
					int temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
				print(numbers);
			}
		}
		System.out.print("结果：");
		print(numbers);
	}
	
	
	public static void print(int[] numbers){
		for(int i:numbers){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
