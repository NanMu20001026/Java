import java.io.*;
import java.util.HashMap;

/**
 * @Auther:黎奉时
 * @Date：2021/12/26-12-26-16:40
 * @Description:IntelliJ IDEA
 * @version:2.0
 **/
public class qq {
    static String fileName="D:\\Java\\java.txt";//文件地址

    //读取数据---input
    public static void readDate(String fileName, HashMap<Integer,Student> message) throws IOException {
        FileInputStream fis=new FileInputStream(fileName);//访问文件
        BufferedInputStream bis = new BufferedInputStream(fis);//缓冲流--读取数据

        byte[] buf = new byte[1024];//创建字节数组，存储临时读取的数据
        int len = 0;//记录数据读取的长度
        //循环读取数据
        while((len = bis.read(buf)) != -1) { //长度为-1则读取完毕
            System.out.println(new String(buf,0,len));
        }
        bis.close(); //关闭流
    }
    //写入数据----output
    public static void wirteDate(HashMap<Integer,Student> message) throws IOException {

        FileOutputStream fos=new FileOutputStream(fileName);//访问文件
        BufferedOutputStream bis = new BufferedOutputStream(fos);//缓冲流--写入数据





    }
}
