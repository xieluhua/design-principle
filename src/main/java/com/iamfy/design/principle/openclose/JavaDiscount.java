package com.iamfy.design.principle.openclose;

public class JavaDiscount extends JavaBook {
    public JavaDiscount(Integer bookNo, String bookName, Double bookPrice) {
        super(bookNo, bookName, bookPrice);
    }

    public Double discountBookPrice() {
        return super.bookPrice() * 0.5;
    }
}
