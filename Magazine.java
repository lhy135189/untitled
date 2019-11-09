package com.apple.chapter.six;

public class Magazine extends Book{

    private String publicationCycle;


    public String getPublicationCycle() {
        return publicationCycle;
    }

    public void setPublicationCycle(String publicationCycle) {
        this.publicationCycle = publicationCycle;
    }

    public void Magazine(){
        super.Book(40,28.0);
        publicationCycle = "2019.11.06";
    }

//    public void test(){
//        super.pages = 40;
//        super.price = 28.0;
//    }
//    public void showMagaInfo(){
//        System.out.println("该书的页数和价格分别为：" + super.Pages;);
//    }


}
