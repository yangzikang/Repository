package sreach;

public class Sreach {
	public static void main(String args[]){
		int numbers[] = {1,2,3,4,5,6,7,8};
		//System.out.println(sreach(numbers,5));
		System.out.println(erfenDiguiSreach(numbers,8));
		
	}

	private static int sreach(int []numbers,int value){
		for(int i=0;i<numbers.length;i++){
			if(numbers[i] == value){
				return i;
			}
		}
		return -1;
	}
	
	private static int erfenSreach(int []numbers,int value){
		int begin = 0;
		int end = numbers.length-1;
		while(begin<=end){
			int mid = (begin+end)/2;
			//System.out.println(mid);
			if(numbers[mid] == value){
				return mid;
			}
			else if(numbers[mid]<value){
				begin = mid + 1;
			}
			else if(numbers[mid]>value){
				end = mid - 1;
			}
			
		}
		
		return -1;
	}
	
	private static int erfenDiguiSreach(int []numbers,int value){
		return diguiSreach(numbers,value,0,numbers.length-1);
	}
	private static int diguiSreach(int []numbers,int value,int begin,int end){
		int mid = (begin +end)/2;
		if(numbers[mid]==value){
			return mid;
		}
		else if(numbers[mid]<value){
			return diguiSreach(numbers,value,mid+1,end);
		}
		else if(numbers[mid]>value){
			return diguiSreach(numbers,value,begin,mid-1);
		}
		return -1;
	}
}
