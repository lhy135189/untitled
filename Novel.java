package com.apple.chapter.six;

public class Novel extends Book {

//    public static String price;

    private String novelName;

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }

    public void Novel(){
        super.Book(120,34.0);
        novelName = "平凡的世界";
    }

//    public void test(){
//        super.pages = 120;
//        super.price = 34.0;
//    }



}
