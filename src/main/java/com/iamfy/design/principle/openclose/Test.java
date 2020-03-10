package com.iamfy.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        IBookstore bookstore = new JavaBookDiscount(1, "java", 50d);
        JavaBookDiscount discount = (JavaBookDiscount) bookstore;
        System.out.println("书籍编号:" + bookstore.bookNo());
        System.out.println("书籍名称:" + bookstore.bookName());
        System.out.println("书籍原价格:" + bookstore.bookPrice());
        System.out.println("书籍优惠价格:" + discount.javaBookDiscountPrice());
    }
}
