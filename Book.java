package com.apple.chapter.six;

public class Book {

    int pages;

    double price;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public void Book(int pages, double price) {
        this.pages = pages;
        this.price = price;
    }

//    public Book(){
//        System.out.println("该书的页数和价格分别为：" + pages + " " + price);
//    }

}
