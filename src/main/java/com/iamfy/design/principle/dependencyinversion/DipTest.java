package com.iamfy.design.principle.dependencyinversion;

public class DipTest {
    public static void main(String[] args) {
        // v1
//        Tom tom = new Tom();
//        tom.study(new StudyJava());

        // v2
//        Tom tom = new Tom();
//        tom.setiCourse(new StudyPhp());
//        tom.study();

        Tom tom = new Tom(new StudyPhp());
        tom.study();
    }
}
