//package com.example.demo.Application;
//
//import lombok.extern.slf4j.Slf4j;
//
//import java.util.function.Supplier;
//
//@Slf4j
//
//public class StudentTeacherMapping {
//
//    Teacher teacher = new Teacher();
//    public Teacher setTeacherDeteails(Student student){
//        teacher.setTeacherName(nullSafeGetter(() -> student.getTeacherName()));
//        teacher.setAddress(nullSafeGetter(() -> student.getAddress()));
//        return teacher;
//    }
//
//    public <T> T nullSafeGetter(Supplier<T> supplier){  // ye method string ko check krega ki null to nhi h
//        try {
//            return supplier.get();
//        } catch (Exception exception){
//            return null;
//        }
//    }
//}
