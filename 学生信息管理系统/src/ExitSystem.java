import java.util.Scanner;

/**
 * @Auther:黎奉时
 * @Date：2021/12/22-12-22-9:32
 * @Description:IntelliJ IDEA
 * @version:2.0
 **/
//退出系统
public class ExitSystem {
    public static void exit_system(){
        boolean flag= true;
        Scanner za= new Scanner(System.in);

        while (flag) {
            //打印
//            System.out.println();
            System.out.println("------------------------是否退出系统，y/n---------------------------------");
            //打印
            System.out.println();
            String answer = za.next();
            if (answer.equals("n") || answer.equals("N")) {
                Management_System.Interface();
                flag = false;
            } else if (answer.equals("y") || answer.equals("Y")) {
                System.exit(0);
                flag = false;
            } else {
                //打印
                System.out.println("---------------------输入有误，请重新输入-----------------------------------");
            }
        }
    }
}
