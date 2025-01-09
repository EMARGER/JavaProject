package com.mycompany.lalitidlisanchamaker;
public class TrayRack {
    private Cylinder trayRack;

    public TrayRack(double trayRackRadius ,double taryRackHeight) {
        trayRack = new Cylinder(trayRackRadius, taryRackHeight);
    }
    public double getVolumeOfTrayRack(){
        return trayRack.getCylinderVolume();
    }
    
}
