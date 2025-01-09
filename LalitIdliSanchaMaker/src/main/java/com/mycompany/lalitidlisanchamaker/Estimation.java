package com.mycompany.lalitidlisanchamaker;
public class Estimation {
    public static void getSatchaDetails(Satcha s){
        double volumeOfDeep = s.getVolumeOfDeep();
        double volumeOfAllTray = volumeOfDeep * s.getNumberOfDeep();
        double volumeOfTray = s.getVolumeOfTrayRack();
        double areaOfTray = s.getAreaOfTray();
        double volumeOfTrayRack = s.getVolumeOfTrayRack();
        double quantityOfIdlyMasalaInEachDeep = volumeOfDeep*Values.densityOfIdliMasala;
        double quantityOfIdlyMasalaInEachTray = quantityOfIdlyMasalaInEachDeep * s.getNumberOfDeep();
        double quanityOfIdlyMasalaInAllTray = quantityOfIdlyMasalaInEachTray * s.getAreaOfTray();
        
        System.out.println("Quantity Of Idly Masala In Individual Deep : "  + quantityOfIdlyMasalaInEachDeep);
        System.out.println("Quantity Of Idly Masala In Individual Tray : "  +  quantityOfIdlyMasalaInEachTray);
        System.out.println("Quantity Of Idly Masala In All Tray : " + quanityOfIdlyMasalaInAllTray);
        System.out.println("Volume Of Individual Deep : " + volumeOfDeep);
        System.out.println("Volume Of Individual Tray : " + volumeOfTray);
        System.out.println("Volume Of All Tray : " + volumeOfAllTray);
        System.out.println("Volume of TrayRack : " + volumeOfTrayRack );
        
    }
}
