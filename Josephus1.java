import java.util.*;
import java.lang.Math;
import java.lang.String;


class tar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of people in circle : ");
        int n = sc.nextInt();

        String binstr = Integer.toBinaryString(n);
        //System.out.println(binstr);

        StringBuffer sb = new StringBuffer(binstr);
        sb.deleteCharAt(0);
        sb.append("1");
        System.out.println("and the winner goes to " +winner(sb.toString()));
    }

    static int winner(String str){
        //"11110000"
        
        int count = 0;
        double total = 0;
        int siz = str.length();
        for(int i= siz - 1 ; i >= 0 ;i--){
            int ch = str.charAt(i) - '0';
           total +=  ch * Math.pow(2,count);
           count++;
        }
              
    return (int)total;
    }
    
}
