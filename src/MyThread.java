import java.util.ArrayList;

public class MyThread implements  Runnable {
    private  Thread t;
    private  String threadName;
    private static   ArrayList<Character> charArray;

    MyThread(String name){
        threadName =name;
        System.out.println("Creating "+ threadName);
    }
    @Override
    public void run() {
        funcThread();
    }

    public void start(){
        System.out.println("Starting "+ threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }

    public  void funcThread(){
        if (threadName == "thread01"){
            charArray.add('A');
        }else if(threadName == "thread02" ){
            charArray.add('B');
        }else if(threadName == "thread03" ){
            charArray.add('C');
        }else if (threadName == "thread04" ){
            charArray.add('D');
        }


    }

}
