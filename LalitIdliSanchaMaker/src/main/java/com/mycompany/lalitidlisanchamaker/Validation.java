package com.mycompany.lalitidlisanchamaker;

public class Validation {

    public static boolean getValidateDataOfSatcha(String traySize, int numberOfTray, double deepRadius, int numberOfDeep) {
        if (numberOfTray >= Values.minimumNumberTray && numberOfTray <= Values.maximumNumberTray) {
            if (traySize.equalsIgnoreCase("Small")) {
                if (numberOfDeep >= Values.minimumNumberDeepSmallTray && numberOfDeep <= Values.maximumNumberDeepSmallTray) {
                    if (deepRadius < Values.diameterSmallTray / (2 * Values.minimumNumberDeepSmallTray) && deepRadius > Values.diameterSmallTray / (2 * Values.maximumNumberDeepSmallTray)) {
                        return true;
                    } 
                    else {
                        return false;
                    }
                } 
                else {
                    return false;
                }
            } else if (traySize.equalsIgnoreCase("Medium")) {
                if (numberOfDeep >= Values.minimumNumberDeepMediumTray && numberOfDeep <= Values.maximumNumberDeepMediumTray) {
                    if (deepRadius > Values.diameterMediumTray / (2 * Values.minimumNumberDeepMediumTray) && deepRadius < Values.diameterMediumTray / (2 * Values.maximumNumberDeepSmallTray)) {
                        return true;
                    } 
                    else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (traySize.equalsIgnoreCase("Large")) {
                if (numberOfDeep == Values.numberDeepLargeTray) {
                    if(deepRadius == Values.diameterLargeTray/(2*Values.numberDeepLargeTray)){
                        return true;
                    }
                    else{
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

}
