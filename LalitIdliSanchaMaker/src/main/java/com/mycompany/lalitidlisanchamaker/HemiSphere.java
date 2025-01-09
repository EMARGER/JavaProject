package com.mycompany.lalitidlisanchamaker;
public class HemiSphere {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public HemiSphere(double radius) {
        this.radius = radius;
    }
    public double getHemiSphereLateralSurfaceArea(){
        return 2*3.14*radius*radius;
    }
    public double getHemiSphereSurfaceArea(){
        return 3*3.14*radius*radius;
    }
    public double getHemiSphereVolume(){
        return 2*3.14*radius*radius*radius/3;
    }
           
}
