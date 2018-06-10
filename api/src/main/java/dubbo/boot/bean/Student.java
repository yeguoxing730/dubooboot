package dubbo.boot.bean;

import java.io.Serializable;

/**
 * Created by yeguo on 2018/6/10.
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -1L;
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
