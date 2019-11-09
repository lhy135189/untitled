package com.apple.chapter.six;

public class Weekly extends Book {

    private String publicationCycle;

    public String getPublicationCycle() {
        return publicationCycle;
    }

    public void setPublicationCycle(String publicationCycle) {
        this.publicationCycle = publicationCycle;
    }

    public void Weekly(){
        super.Book(33,12);
        publicationCycle = "2019.11.06";
    }

//    public void test(){
//        super.pages = 33;
//        super.price = 12.0;
//    }
}
