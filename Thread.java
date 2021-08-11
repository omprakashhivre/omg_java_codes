//import jdk.internal.vm.PostVMInitHook;

class taraa extends Thread{
    static Thread mt;
    public void run(){
        try{
            mt.join();
        }
        catch(InterruptedException e){
           // System.out.println("error :"+e.getMessage());
        }
        for(int i=0;i<10;i++){
            System.out.println("child thread");
            //Thread.sleep(1000);
        }
    }
}

class demothread{
    public static void main(String[] args) throws InterruptedException {
        taraa mt=Thread.currentThread();
        taraa t=new taraa();
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread");
            Thread.sleep(1000);
        }


        
    }
}