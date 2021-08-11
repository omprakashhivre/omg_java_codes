import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

       public static String decryptPassword(String s) {
    // Write your code here
    //char[] arr=new char[s.length()];
    char tmp;
    int n=s.length();
    char[] arr=s.toCharArray();
    char [] str=new char[n];
    for(int i=0;i<n;i++)
    {
        if(arr[i]!='#')
        {
        if(Character.isDigit(arr[i]))
        {
            for(int j=n-1;j>1;j--)
            {
                if(arr[j]=='0')
                {
                    str[j]=arr[i];
                    arr[j]='#';
                    break;
                }
            }
        }
        else if(Character.isUpperCase(arr[i]) && Character.isLowerCase(arr[i+1]))
        {
            str[i]=arr[i+1];
            str[i+1]=arr[i];
            arr[i]='#';
            arr[i+1]='#';
            arr[i+2]='#';
        }
        else
        {
        str[i]=arr[i];
        arr[i]='#';
        }
    }
    }
    String tara=String.valueOf(str).trim().replaceAll(" ","");
    String strWithoutSpace = tara.replaceAll(" ", "");
    return strWithoutSpace;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.decryptPassword(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
