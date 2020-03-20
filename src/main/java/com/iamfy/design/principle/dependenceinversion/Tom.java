package com.iamfy.design.principle.dependenceinversion;

public class Tom {
    private ICourse iCourse;

    public Tom() {
    }

    public Tom(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(ICourse iCourse){
        iCourse.study();
    }

    public void study(){
        iCourse.study();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
