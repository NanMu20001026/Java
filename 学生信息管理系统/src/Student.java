/**
 * @Auther:黎奉时
 * @Date：2021/12/21-12-21-22:28
 * @Description:IntelliJ IDEA
 * @version:2.0
 **/
//学生类
public class Student {
    private String name;
    private  String ID;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
//得到名字
    public String getName() {
        return name;
    }
//设置名字
    public void setName(String name) {
        this.name = name;
    }
//得到ID
    public String getID() {
        return ID;
    }
//设置ID
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "名字：'" + name + '\'' + ", 身份证：" + ID ;
    }
}