package com.boot;

import com.boot.consumer.StudentConsumer;
import dubbo.boot.api.StudentService;
import dubbo.boot.bean.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by yeguo on 2018/6/10.
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
        StudentConsumer studentConsumer = run.getBean(StudentConsumer.class);
        Student student = studentConsumer.printStudentInfo();
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
