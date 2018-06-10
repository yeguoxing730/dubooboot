package com.boot.service;

import dubbo.boot.api.StudentService;
import dubbo.boot.bean.Student;
import com.alibaba.dubbo.config.annotation.Service;
/**
 * Created by yeguo on 2018/6/10.
 */
@Service(version = "1.0.0")
public class StudentImpl implements StudentService {
    @Override
    public Student getStudentByName(String userName) {
        return new Student("hh","23");
    }
}
