import java.util.Objects;
import java.util.Scanner;

/**
 * @Auther:黎奉时
 * @Date：2021/12/21-12-21-22:32
 * @Description:IntelliJ IDEA
 * @version:2.0
 **/
//系统界面
public class LogIn {
    static int a = 2;//设置在第一次输入账号密码错误后的次数。
    static String user  = "1";//设置系统账号
    static String password = "1";//设置系统密码

    public static void login(){
        //打印
                System.out.println("**********************************************************************");
        //打印
                System.out.println("************************-----欢迎使用系统-----***************************");
        //打印
                System.out.println("**********************************************************************");
                System.out.println("----------------------------------------------------------------------");

        for (int i=1;i <=3;i++){
            Scanner cs = new Scanner(System.in);

            //打印
            System.out.print("***********************************账号：");
            String user1=cs.next();//输入账号
            //打印
            System.out.print("***********************************密码：");
            String password1 = cs.next();//输入密码
            //判断密码是否正确
            if (user.equals(user1) && Objects.equals(password, password1)){
                System.out.println("-----------------------------------------------------------------------");
                //打印
                System.out.println("------------------------------欢迎进入系统--------------------------------");
                //打印
                System.out.println("------------------------------------------------------------------------");
                Management_System.Interface();//进入系统---进入学生信息系统
                break;
            }
            else {
                if (a==0){
                    //打印
                    System.out.println("---------------------------密码错误，已退出系统--------------------------");
                    break;
                }
                //打印
                System.out.println("你还有"+a+"次机会登录系统");
                a--;
            }
        }
    }
}
