package com.boot.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.boot.api.StudentService;
import dubbo.boot.bean.Student;
import org.springframework.stereotype.Component;

/**
 * Created by yeguo on 2018/6/10.
 */
@Component
public class StudentConsumer  {
    @Reference(version = "1.0.0")
    StudentService studentService;
    public Student printStudentInfo(){
        return studentService.getStudentByName("userName");
    }
}
