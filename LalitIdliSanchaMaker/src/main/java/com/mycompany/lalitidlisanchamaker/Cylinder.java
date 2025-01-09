package com.mycompany.lalitidlisanchamaker;
public class Cylinder {
     private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getCylinderLateralSurfaceArea() {
        return 2 * 3.14 * radius * height;
    }

    public double getCylinderSurfaceArea() {
        return 2 * 3.14 * radius + (radius + height);
    }

    public double getCylinderVolume() {
        return 3.14 * radius * radius * height;
    }
}
