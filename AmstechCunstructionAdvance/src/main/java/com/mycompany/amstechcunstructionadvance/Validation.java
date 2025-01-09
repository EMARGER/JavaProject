package com.mycompany.amstechcunstructionadvance;

public class Validation {

    public static boolean getValidateLength(String type, double length) {
        if (type.equalsIgnoreCase("B")) {
            if (length >= Limitation.minimumLengthSectorB && length <= Limitation.maximumLengthSectorB) {
                return true;
            } else {
                return false;
            }
        } else if (type.equalsIgnoreCase("C")) {
            if (length >= Limitation.minimumLengthSectorC && length <= Limitation.maximumLengthSectorC) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean getValidateWidth(String type, double width) {
        if (type.equalsIgnoreCase("C")) {
            if (width >= Limitation.minimumWidthSectorC && width <= Limitation.maximumWidthSectorC) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
