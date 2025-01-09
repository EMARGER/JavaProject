package com.mycompany.lalitidlisanchamaker;

public class Satcha {

    private Deep deep;
    private Tray tray;
    private TrayRack trayRack;
    private int numberOfTray;
    private int numberOfDeep;

    public int getNumberOfTray() {
        return numberOfTray;
    }

    public void setNumberOfTray(int numberOfTray) {
        this.numberOfTray = numberOfTray;
    }

    public int getNumberOfDeep() {
        return numberOfDeep;
    }

    public void setNumberOfDeep(int numberOfDeep) {
        this.numberOfDeep = numberOfDeep;
    }

    public Satcha(String traySize, int numberOfTray,double deepRadius, int numberOfDeep) {
        
        deep = new Deep(deepRadius);
        double trayRadius = Operation.getRadiusOfTray(traySize);
        tray = new Tray(trayRadius);
        double trayRackRadius = trayRadius;
        double trayRackHeight = Operation.getHeightOfTrayRack(deepRadius);
        trayRack = new TrayRack(trayRackRadius, trayRackHeight);
        this.numberOfDeep = numberOfDeep;
        this.numberOfTray = numberOfTray;
    }
    public double getDeepRadius(){
        return deep.getDeepRadius();
    }
    public double getVolumeOfDeep(){
        return deep.getVolumeOfDeep();
    }
    public double getAreaOfTray(){
        return tray.getAreaOfTray();
    }
    public double getVolumeOfTrayRack(){
        return trayRack.getVolumeOfTrayRack();
    }

   
}
