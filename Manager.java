package com.apple.chapter.six;

public class Manager {
    public static void main(String[] args){

        BookServiceImpl bookService = new BookServiceImpl();
        bookService.makebooks();
        bookService.showbooks();
    }


}
