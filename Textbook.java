package com.apple.chapter.six;

public class Textbook extends Book {

    private String Course;

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public void Textbook(){
        super.Book(90,34.0);
        Course = "抓我";
    }

//    public void test(){
//        super.pages = 90;
//        super.price = 34.0;
//    }
}
