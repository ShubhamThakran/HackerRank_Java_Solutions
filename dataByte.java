import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                else if(x>=-32768 && x<=32768) System.out.println("* short\n* int\n* long");                         
                 else if(x>=-(int)Math.pow(2,31)&&x<=(int)Math.pow(2,31)) System.out.println("* int\n* long");
                else if(x>=-(long)Math.pow(2,63)&& x<=(long)Math.pow(2,63)) {System.out.println("* long");}
                /*else if(x>=-(float)Math.pow(3.4028235,38)&&x<=(float)Math.pow(3.4028235,38)) {System.out.println("*byte\n*Short\n*int\n*long\n*float");
            }
            else if(x>=(double)Math.pow(4.9,-324)&&x<=(double)Math.pow(1.7976931348623157,8))
            { System.out.println("*byte\n*Short\n*int\n*long\n*float\n*double");
            }*/
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
