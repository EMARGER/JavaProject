package com.mycompany.lalitidlisanchamaker;
public class Tray {
    private Circle tray; 
    public Tray(double trayRadius){
        tray = new Circle(trayRadius);
    }
    public double getAreaOfTray(){
        return tray.getarea();
    }
}
