import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class testIO {

    public  static void  main(String[] arg)  {
         /*// C从文件读写，加缓存功能

        char a =  'A';
        System.out.println(a+2);*/


         //test MultiThread
        System.out.println("please input times of ABCD cycle");
        int t = 0;


        MyThread R1 = new MyThread("thread01");
        R1.start();

        MyThread R2 = new MyThread("thread01");
        R2.start();

        MyThread R3 = new MyThread("thread01");
        R3.start();

        MyThread R4 = new MyThread("thread01");
        R4.start();




    }







}
