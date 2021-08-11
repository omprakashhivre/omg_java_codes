import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println(decodings(str));
        
    }
    static int decodings(String str)
    {
        int len=str.length(),count=0,num,rem,rem2;
        num=Integer.parseInt(str);
       // int[] array=new int[str.length()];
        //array=str.toCharArray().ParseInt();

        if(len==0 || len==1)
        return 1;

        if(num>0)
        count++;
        for(int i=0;i<len;i++)
        {
        
           rem = num%10;
           num = num/10;
           rem2 = num%10;
           num = num/10;
           if(rem2*10 + rem > 9 && rem2*10 + rem <=26 )
           count++;
           num=num*10 + rem2;
           // array[i]=array[i].parseInt();
        }
      return count;
    }
}