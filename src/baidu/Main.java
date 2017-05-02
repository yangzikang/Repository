package baidu;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        String all = in.nextLine();
        in.close();
        String result="";
        if(number.equals("0")){
        	
        	String strings[] = all.split(":");
        	for(int i=0;i<strings.length;i++){
        		int end = 0;
        		for(int j=0;j<strings[i].length();j++){
        			if(strings[i].charAt(j)=='0'){
        				end = j+1;
        			}
        			else{
        				
        				break;
        			}
        		}
        		result += strings[i].substring(end)+":";
        	}
        	result = result.substring(0, result.length()-1);
        	
        }
        else if(number.equals("1")){
        	String a[] = all.split(":");
        	StringBuilder sb=new StringBuilder();
    		int i;
    		for(i=0;i<a.length;i++){
    			if(a[i]==null){
    				sb.append("000000");
    			}
    			else if(a[i].length()<6){
    				int sum=6-a[i].length();
    				for(int j=0;j<sum;j++){
    					sb.append("0");
    				}
    				sb.append(a[i]);
    			}
    			else{
    				sb.append(a[i]);
    			}
    			if(i!=a.length-1)
    				sb.append(":");	
    		}
    		for(;i<4;i++){
    			sb.append(":000000");
    		}
    		result = sb.toString();
    		if(result.charAt(0)==':'){
    			result = result.substring(1);
    		}
        }
        
        System.out.println(result);
    }
}