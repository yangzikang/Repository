package OrderTest;

public class FsSortTest {
	public static void main(String[] args){
		int numbers[] = {1,4,5,6,7,88,3,2};
		fsSort(numbers,0,numbers.length-1);
		Main.print(numbers);
	}

	private static void fsSort(int[] numbers, int begin, int end) {
		// TODO Auto-generated method stub
		if(begin>end){return;}
		int index = doing(numbers,begin,end);
		fsSort(numbers,begin,index-1);
		fsSort(numbers,index+1,end);
	}

	private static int doing(int[] numbers, int begin, int end) {
		// TODO Auto-generated method stub
		int key = numbers[begin];
		while(begin<end){
			while(numbers[end]>=key&&begin<end){
				end--;
			}
			numbers[begin]=numbers[end];
			
			while(numbers[begin]<=key&&begin<end){
				begin++;
			}
			numbers[end]=numbers[begin];
		}
		numbers[end]=key;
		return end;
	}
	
}