
package com.day1_cw5.day1_cw5.model;




public class student {
    private String studentName;
    private String msg;
    
    public student(String studentName, String msg) {
        this.studentName = studentName;
        this.msg = msg;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    
}