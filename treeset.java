import java.util.TreeSet;
import java.lang.String;

import javax.lang.model.util.ElementScanner14;
import javax.print.event.PrintEvent;

class employee implements Comparable{
    int eid;
    String ename;
    employee(String ename,int eid){
        this.ename= ename;
        this.eid = eid;
    }
    public int compareTo(Object obj){
        int eid1 = this.eid;
        employee e =(employee)obj;
        int eid2 = e.eid;
        if(eid1 > eid2)
            return 1;
        else if(eid1 < eid2)
            return -1;
        else       
            return 0; 
    } 
    public String toString(){
        return eid+"------>"+ename;
    }   
}

class treeset {
    public static void main(String[] args) {
        employee e1 = new employee("omg",100);
        employee e2 = new employee("tara", 200);
        employee e3 = new employee("kiara",300);
        employee e4 = new employee("prem",400);
        employee e5 = new employee("sam", 500);
        employee e6 = new employee("tia", 600);
        employee e7 = new employee("ram", 700);
        TreeSet t = new TreeSet<>();
       // for(int i=0;i<7 ;i++){
        t.add(e1);         t.add(e2);         t.add(e3);         t.add(e4);
            t.add(e5);         t.add(e6);         t.add(e7);
        
System.out.println(t);
for (Object oj : t) {
    System.out.println(oj.toString());
    
}
    }
}