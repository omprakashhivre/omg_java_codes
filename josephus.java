import java.util.*;
import java.lang.String;
import java.lang.Integer;


public class josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=1; i<=n ;i++){
            if(i%2 == 1);
                l.add(i);
        }
        System.out.println("and the winner is At "+removePerson(l));
    }
    public static int removePerson(ArrayList<Integer> al){
        int size = al.size();
        int xc = 0;
        if(size == 1){
            return (int)al.get(0);
        }
        else if(size % 2 == 0){
            for(int i=0 ; i<size ; i=i+2)
                al.remove(i);
           // removePerson(al);
        }
        else {
            for(int i=1 ; i<size ; i=i+2)
                al.remove(i);
           // removePerson(al);
        }
        removePerson(al);

        return (int)al.get(xc);
    }
    
}
