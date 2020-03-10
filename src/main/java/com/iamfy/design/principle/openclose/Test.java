package com.iamfy.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        IBookstore bookstore = new JavaDiscount(1, "java", 50d);
        JavaDiscount discount = (JavaDiscount) bookstore;
        System.out.println("书籍编号:" + bookstore.bookNo());
        System.out.println("书籍名称:" + bookstore.bookName());
        System.out.println("书籍原价格:" + bookstore.bookPrice());
        System.out.println("书籍优惠价格:" + discount.discountBookPrice());
    }
}
