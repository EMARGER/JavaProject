package com.mycompany.lalitidlisanchamaker;
public class Operation {
    public static double getRadiusOfTray(String traySize ){
        
        if(traySize.equalsIgnoreCase("Small")){
            return Values.diameterSmallTray/2;
        }
        else if(traySize.equalsIgnoreCase("Medium")){
            return Values.diameterMediumTray/2;
        }
        else if(traySize.equalsIgnoreCase("Large")){
            return Values.diameterLargeTray/2;
        }
        return -1;
    }
    public static double getHeightOfTrayRack(double deepRadius){
        return 2*deepRadius*Values.maximumNumberTray;
    }
}
