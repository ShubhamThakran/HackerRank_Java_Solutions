import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum=a;
            
            for(int m=0;m<n;m++){
                int s= (int)Math.pow(2,m)*b;
                sum=sum+s;
                System.out.printf("%s ",sum);
                
                 } 
            System.out.println();
        }
        
        in.close();
     
    }
}
