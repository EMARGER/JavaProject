package com.mycompany.amstechcunstructionadvance;
public class Plot {
    private double length;
    private double width;
    private String type;

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public String getType() {
        return type;
    }
    public Plot() {
        type = "A";
        length = 50;
        width = 20;
    }
    public Plot( double length) {
        type = "B";
        width = 50;
    }
    public Plot( double length, double width) {
        type = "C";
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}
