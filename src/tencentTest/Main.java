package tencentTest;
import java.util.*;
public class Main{
 public static void main(String []args){
 	Scanner in = new Scanner(System.in);
   int nlength = in.nextInt();
   
   in.nextLine();
   
   String []strings = new String[nlength];
   for(int i=0;i<nlength;i++){
   	strings[i] = in.nextLine();
   }
   
   int mlength = in.nextInt();
   in.nextLine();
   String []stringm = new String[mlength];
   for(int i = 0;i<mlength;i++){
   	stringm[i] = in.nextLine();
   }
   
   for(int i = 0;i<mlength;i++){
   	String []ms = stringm[i].split(" ");
     if(ms[0].equals("insert")){
       for(int j = 0;j<nlength;j++){
         if(ms[1].equals(strings[j])){
         	System.out.println(1);
           break;
         }
         if(j==nlength-1){
         	System.out.println(0);
         }
       }
     }
     else{
       int howMany = 0;
       for(int j =0 ;j<nlength;j++){
         char[] ms1 = ms[1].toCharArray();
         char[] ss = strings[j].toCharArray();
         if(ms1.length>ss.length){
         	break;
         }
         
         
         for(int k = 0,sameNumber=0;k<ms1.length;k++){
           if(ms1[k]==ss[k]){
           		sameNumber++;
           }
           if(sameNumber == ms1.length){
           		howMany++;
           }
         }
         
       }
       System.out.println(howMany);
     }
   }
   
 }
}
