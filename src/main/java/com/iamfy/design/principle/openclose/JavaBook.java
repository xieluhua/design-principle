package com.iamfy.design.principle.openclose;

public class JavaBook implements IBookstore {
    private Integer bookNo;
    private String bookName;
    private Double bookPrice;

    public JavaBook(Integer bookNo, String bookName, Double bookPrice) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Integer bookNo() {
        return this.bookNo;
    }

    public String bookName() {
        return this.bookName;
    }

    public Double bookPrice() {
        return this.bookPrice;
    }
}
