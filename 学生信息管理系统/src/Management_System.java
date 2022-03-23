import java.util.HashMap;
import java.util.Scanner;

/**
 * @Auther:黎奉时
 * @Date：2021/12/21-12-21-22:36
 * @Description:IntelliJ IDEA
 * @version:2.0
 **/
public class Management_System {
        //登录界面
    public static void Interface() {
        //打印
        System.out.println("1.添加信息     2.查询信息    3.修改信息    4.删除信息    5.显示信息   6.退出系统");
        //打印
        System.out.println();
        //打印
        System.out.println("---------------------------------请选择操作------------------------------");
        Scanner cs = new Scanner(System.in);
        int i = cs.nextInt();
        switch (i) {
            //添加信息
            case 1:
                addInformation();
                break;

            //查询学生信息
            case 2:
                searchInformation();
                break;

            //修改学生信息
            case 3:
                ModifyInformation();
                break;

            //删除学生信息
            case 4:
                DeleteInformation();
                break;

            //显示学生信息
            case 5:
                showInterface();
                break;

            //退出学生管理系统
            case 6:
                //打印
                System.out.println("---------------------欢迎您使用本系统，你已成功退出系统-----------------------");
                System.exit(0);
                break;

            default:
                //打印
                System.out.println("--------------------------输入有误,请重新选择------------------------------");
                //打印
                System.out.println();
                Management_System.Interface();
        }
    }
    //存储学生信息---HashMap
    static HashMap<Integer,Student> message = new HashMap<>();
    //添加学生信息
    public static void addInformation(){
        Scanner zs = new Scanner(System.in);
        //打印
        System.out.print("                  请输入要录入学生的人数：");//要录入的学生人数
        int number = zs.nextInt();
        //利用循环来输入每一个学生的信息
        for (int i = 1;i<=number;i++){
            System.out.println("                        录入第" +i+ "个学生信息");

            System.out.print("                                 姓名：");
            String name= zs.next();

            System.out.print("                                身份证：");
            String ID = zs.next();
            //打印
            System.out.print("                                  学号：");
            int id= zs.nextInt();
            message.put(id,new Student(name,ID));
            //打印
            System.out.println("---------------------------------录入成功！------------------------------");
            //打印
            System.out.println();
        }
        //打印
        System.out.println("-------------------------是否继续录入学生信息，y/n--------------------------");//判断你是否要继续录入学生信息
        String anows = zs.next();
        //对你的选择左判断
        if (anows.equalsIgnoreCase("y")||anows.equalsIgnoreCase("Y")){     //是
            addInformation();
        }else if(anows.equals("n")||anows.equals("N")) {   //否，返回主界面
            //打印
            System.out.println();
            //打印
            System.out.println("------------------------------已回到主界面---------------------------------");
            //打印
            System.out.println();
            //打印
            System.out.println("-----------------------------------------------------------------------");
            Interface();//返回主界面
        }else {
            //打印
            System.out.println();
            //打印
            System.out.println("----------------------------输入错误，返回主界面---------------------------");
            //打印
            System.out.println("-----------------------------------------------------------------------");
            Interface();
        }
    }
    //查询个人学生信息
    public static void searchInformation() {

        Scanner zc = new Scanner(System.in);
        if (message.size() == 0) {
            //打印
            System.out.println();
            //打印
            System.out.println("------------------------无学生信息，请先添加学生信息------------------------");
            //打印
            System.out.println();
            //打印
            System.out.println("-----------------------------------------------------------------------");
            Interface();
        }
        else {
            message.size();
            //打印
            System.out.print("                 请输入你要查询学生的学号：");
            int id = zc.nextInt();
            //对要查询的学生是否在系统中做判断
            if (message.containsKey(id)) {  //是
                //打印
                System.out.println();
                //打印
                System.out.println(message.get(id) + " , 学号：" + id);
                } else {   //否
                    //打印
                    System.out.println();
                    //打印
                    System.out.println("---------------------------查无此人，已返回主界面--------------------------");
                    //打印
                    System.out.println();
                    //打印
                    System.out.println("-----------------------------------------------------------------------");
                    Interface();
                }
            //是否继续查询
            boolean flag2 = true;
            //打印
            System.out.println();
            //打印
            System.out.println("------------------------是否继续查询学生信息，y/n--------------------------");
            while (flag2) {
                String answer1 = zc.next();
                if (answer1.equals("y") || answer1.equals("Y")) {
                    searchInformation();
                    flag2 = false;
                } else if (answer1.equals("n") || answer1.equals("N")) {
                    ExitSystem.exit_system();
                    flag2 = false;
                } else {
                    //打印
                    System.out.println("-----------------------------请重新输入！---------------------------------");
                }
            }
        }
    }
    //修改学生信息
    public static void ModifyInformation(){
        boolean flag = true;
        Scanner za= new Scanner(System.in);
        //判断是否有学生信息
        if (message.size()==0){
            //打印

            System.out.println();
            //打印
            System.out.println("------------------------无学生信息，请先添加学生信息------------------------");
            //打印
            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
            Interface();
        }
        else {
//            message.size();
            //打印
            System.out.print("                       输入你要修改学生的学号：");
            while (flag) {
                int id = za.nextInt();
                //先查到有此学生
                if (message.containsKey(id)) {
                    Student student = message.get(id);
                    boolean f = true;
                    //打印
                    System.out.println("1.名字                          2.身份证                        3.返回主界面");
                    //判断
                    while (f) {
                        //打印
                        System.out.print("                   请输入你要修改信息序号：");//具体修改哪一个信息
                        int a = za.nextInt();
                        switch (a) {
                            case 1:
                                //打印
                                System.out.print("                            名字：");
                                String name = za.next();
                                student.setName(name);
                                f = false;
                                break;
                            case 2:
                                //打印
                                System.out.print("                           身份证：");
                                String ID = za.next();
                                student.setID(ID);
                                f = false;
                                break;
                            case 3:
                                //打印
                                System.out.println("--------------------------------------------------------------------");
                                Interface();
                                f = false;
                                break;
                            default:
                                //打印
                                System.out.println("----------------------------输入有误,请重新输入！--------------------------");
                                //打印
                                System.out.println();
                        }
                    }
                    boolean flag1 = true;//控制外层循环
                    //打印
                    System.out.println("-------------------------是否继续修改学生信息，y/n--------------------------");
                    while (flag1) {
                        String answer1 = za.next();//做出回答
                        if (answer1.equals("y") || answer1.equals("Y")) {
                            flag1 = false;//外层不再循环
                            boolean f1 = true;//控制内存循环
                            //打印
                            System.out.println("1.名字                           2.身份证                          3.返回主界面");
                            while (f1) {
                                //打印
                                System.out.print("                    请输入你要修改信息序号：");
                                int b = za.nextInt();//输入选择序号
                                switch (b) {
                                    case 1:
                                        //打印
                                        System.out.print("                            名字：");
                                        String name = za.next();
                                        student.setName(name);
                                        f1 = false;
                                        break;
                                    case 2:
                                        //打印
                                        System.out.print("                           身份证：");
                                        String ID = za.next();
                                        student.setID(ID);
                                        f1 = false;
                                        break;
                                    case 3:
                                        //打印
                                        System.out.println("----------------------------------------------------------------------");
                                        Interface();
                                        f1 = false;
                                        break;
                                    default:
                                        //打印
                                        System.out.println("---------------------------输入有误,请重新输入！--------------------------");
                                        //打印
                                        System.out.println();
                                }
                            }
                            //打印
                            System.out.println("----------------------------修改成功，返回主界面---------------------------");
                            //打印
                            System.out.println();
                            System.out.println("------------------------------------------------------------------------");
                            Interface();
                        } else if (answer1.equals("n") || answer1.equals("N")) {
                            //打印
                            System.out.println();
                            //打印
                            System.out.println("---------------------------修改成功，已返回主界面--------------------------");
                            //打印
                            System.out.println();
                            System.out.println("-----------------------------------------------------------------------");
                            Interface();//不继续就回到主界面
                            flag1 = false;
                        } else {
                            //打印
                            System.out.println();
                            //打印
                            System.out.println("--------------------------输入有误，已返回主界面---------------------------");
                            //打印
                            System.out.println();
                            System.out.println("-----------------------------------------------------------------------");
                            Interface();

                        }
                    }
                } else {
                    flag = false;
                    //打印
                    System.out.println();
                    //打印
                    System.out.println("----------------------输入有误或者无此学生，已返回主界面----------------------");
                    //打印
                    System.out.println();
                    //打印
                    System.out.println("------------------------------------------------------------------------");
                    Interface();
                }
            }
        }
    }
    //删除学生信息
    public static void  DeleteInformation(){

        Scanner zw = new Scanner(System.in);
        if (message.size()==0){
            //打印
            System.out.println();
            //打印
            System.out.println("------------------------无学生信息，请先添加学生信息------------------------");
            //打印
            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
            Interface();
        }
        else {
            message.size();
            //打印
            System.out.print("               请输入你要删除学生的学号：");
            int id = zw.nextInt();
            //对输入的学号做判断
            if (message.containsKey(id)) { //是
                message.remove(id);
                //打印
                System.out.println();
                //打印
                System.out.println("----------------------------删除成功！-----------------------------------");
                //打印
                System.out.println();
                //打印
                System.out.println("----------------------是否继续删除学生信息，y/n----------------------------");
                String an = zw.next();
                if (an.equals("y") || an.equals("Y")) {   //是，继续删除
                    DeleteInformation();
                } else {   //不是，返回主界面
                    Interface();
                }
            } else {   //否
                //打印
                System.out.println();
                //打印
                System.out.println("————------------------------------—查无此人，已返回主界面——-------------——-");
                //打印
                System.out.println();
                System.out.println("------------------------------------------------------------------------");
                Interface();
            }
        }
    }
    //查看所有信息
    public static void showInterface() {
//        Scanner zq = new Scanner(System.in);

        if (message.size() == 0) {
            //打印
            System.out.println();
            //打印
            System.out.println("------------------------无学生信息，请先添加学生信息------------------------");
            //打印
            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
            Interface();
        } else {
            //打印
            System.out.println();
            //使用keySet对HashMap集合继续遍历
            for (Object p : message.keySet()) {
                //打印
                System.out.print(message.get(p));
                //打印
                System.out.println(", 学号：" + p);
                //打印
                System.out.println();
            }
            if (message.isEmpty()) {
                //打印
                System.out.println("************************************************************************");
                //打印
                System.out.println();
                System.out.println("--------------------------------无学生信息-------------------------------");
            }
            ExitSystem.exit_system();
        }
    }
}
