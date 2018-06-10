package dubbo.boot.api;

import dubbo.boot.bean.Student;

/**
 * Created by yeguo on 2018/6/10.
 */
public interface StudentService {
    Student getStudentByName(String userName);
}
