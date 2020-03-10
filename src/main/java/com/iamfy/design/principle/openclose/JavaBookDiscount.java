package com.iamfy.design.principle.openclose;

public class JavaBookDiscount extends JavaBook {
    public JavaBookDiscount(Integer bookNo, String bookName, Double bookPrice) {
        super(bookNo, bookName, bookPrice);
    }

    public Double javaBookDiscountPrice() {
        return super.bookPrice() * 0.5;
    }
}
