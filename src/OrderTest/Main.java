package OrderTest;


import java.util.*;

public class Main {
	public static void main(String []args){
		int[] numbers = {3,2,1,5,4,6,7};
		//order(numbers);
		//BubbleSort_2(numbers);
		insertion_sort(numbers);
		print(numbers);
		
	}
	
	
	//普通的排序
	public static void order(int[] numbers){
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
	
	/**
	 * 简单冒泡排序
	 * 时间复杂度O(n^2)
	 * 稳定的
	 * @param numbers
	 */
	static void BubbleSort_2(int a[])
	{
		boolean bSwaped = true;
		for (int i = 0; i < a.length -1; i++)
		{
			// 每次先重置为false
			bSwaped = false;
			for (int j = a.length - 1; j > i ; j--)
			{
				if (a[j-1] > a[j])
				{
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;

					bSwaped = true;
				}
			}
			// 如果上一次扫描没有发生交换，则说明数组已经全部有序，退出循环
			if (!bSwaped)
				break;
		}
	}
	
	static void insertion_sort(int[] unsorted)
    {
        for (int i = 1; i < unsorted.length; i++)
        {
            if (unsorted[i - 1] > unsorted[i])
            {
                int temp = unsorted[i];
                int j = i;
                while (j > 0 && unsorted[j - 1] > temp)
                {
                    unsorted[j] = unsorted[j - 1];
                    j--;
                }
                unsorted[j] = temp;
            }
        }
    }
	
	public static void print(int[] numbers){
		for(int i:numbers){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
