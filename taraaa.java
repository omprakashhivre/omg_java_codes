//import jdk.internal.vm.PostVMInitHook;
import java.lang.Thread;
import java.lang.String;

class taraa1234 extends Thread{
    static Thread mt;
    public void run(){
           // mt.join();
        
        
        for(int i=0;i<10;i++){
            System.out.println("child thread");
           // Thread.sleep(500);
        }
    }
}

class demothread1234{
    public static void main(String[] args) throws InterruptedException {
        taraa1234.mt=Thread.currentThread();
        taraa1234 t=new taraa1234();
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread");
            Thread.sleep(1000);
        }


        
    }
}