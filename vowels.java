/*	NOTE : Class Name should be Main */
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

/* uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
import java.lang.String;
class Main {
	public static void main(String args[] ) throws Exception {

		/* Sample code to perform I/O
         * Use either of these methods for input

		//BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
        String name = br.readLine();   // Reading input from STDIN
        System.out.println(name);    // Writing output to STDOUT 

		//Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();   // Reading input from STDIN
        System.out.println(name);    // Writing output to STDOUT
        */ 

		//Write your code here 
		//Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		//StringBuffer sb = new StringBuffer(str);
	
	 	System.out.println(new StringBuffer(new Scanner(System.in).next()).reverse());
    //     System.out.println(vowels(str));
	// }  
	// public static int vowels(String str){
	//     	int count = 0;
	//     	int lenstr =  str.length();
		
    //         for(int i=0;i<lenstr;i++){
    //             if(str.charAt(i) == 'a' || str.charAt(i) == 'A'|| str.charAt(i) == 'e'|| str.charAt(i) == 'E'|| str.charAt(i) == 'i'|| str.charAt(i) == 'I'|| str.charAt(i) == 'o'|| str.charAt(i) == 'O'|| str.charAt(i) == 'u'|| str.charAt(i) == 'U'){
    //                 count++;
    //             }
    //         }
    //         return count;

}
}