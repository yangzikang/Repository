package deleteLastOfEachThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteLastOfEachThree {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		
		List<Integer> l = new ArrayList<Integer>();
		for(int i =0;i<length;i++){
			l.add(i);
		}
	
		int temp = 0;
		while(length!=1){
			temp += 2;
			while(true){
				if(temp>=length){
					temp = temp-length;
				}
				else{
					break;
				}
			}
			/*System.out.println("length:"+length);
			System.out.println("temp:"+temp);
			System.out.println((int)l.get(temp));*/
			l.remove(temp);		
			length--;
		}
		System.out.println((int)l.get(0));
		in.close();
		
	}
}
