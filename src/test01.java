import com.sun.javafx.collections.MappingChange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static javafx.application.Platform.exit;

public class test01 {
   //static  private  int sum;
    //字符统计
    public  static void  main(String[] arg) throws Exception {
         /*final int a = 1;   //局部变量
         final int  b = 1;
        sum=a+b;
        System.out.println(sum);*/
         //从屏幕输入一行字符串
        String in= null;
        System.out.println("please input a string!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            in=br.readLine();
        }catch (Exception e) {
           // exit()
        }

        //si思路：转化为字符数组，放入map内。
        char[] charArr = in.toCharArray();
        Map<Integer ,Character>  m = new TreeMap< Integer,Character>();
        for (int x=0 ; x < charArr.length; x++) {
            if (!m.containsKey(charArr[x]) ){
            m.put(1,charArr[x]);
            }else{
            m.put(charArr[x] + 1,m.get(charArr[x]) );
            }
        }
        //map 按照 val大小，打印key

    }



}
