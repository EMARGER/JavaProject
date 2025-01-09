package com.mycompany.amstechcunstructionadvance;

public class Operation {

    public static double getTotalAmount(String type, double area) {
        if (type.equalsIgnoreCase("A")) {
            return area * Rate.plotRateSectorA;
        } else if (type.equalsIgnoreCase("B")) {
            return area * Rate.plotRateSectorB;
        } else if (type.equalsIgnoreCase("C")) {
            return area * Rate.plotRateSectorC;
        }
        return -1;
    }

    public static double getRegistryAmount(String gender, double totalAmount) {
        if (gender.equalsIgnoreCase("Male")) {
            return totalAmount * Rate.registryChargesMale / 100;
        } else if (gender.equalsIgnoreCase("Female")) {
            return totalAmount * Rate.registryChargesFemale / 100;
        }
        return -1;
    }

    public static double getClubMemberShipAmount(String type) {
        if (type.equalsIgnoreCase("A")) {
            return Rate.clubMembershipSectorA * Rate.minimumClubMembershipYear;
        } else if (type.equalsIgnoreCase("B")) {
            return Rate.clubMembershipSectorB * Rate.minimumClubMembershipYear;
        } else if (type.equalsIgnoreCase("C")) {
            return Rate.clubMembershipSectorC * Rate.minimumClubMembershipYear;
        }
        return -1;
    }

    public static double getSocityDevelopmentAmount(String type) {
        if (type.equalsIgnoreCase("A")) {
            return Rate.SocityDevlopmentSectorA;
        } else if (type.equalsIgnoreCase("B")) {
            return Rate.SocityDevlopmentSectorB;
        } else if (type.equalsIgnoreCase("C")) {
            return Rate.SocityDevlopmentSectorC;
        }
        return -1;
    }

    public static double getGreenTaxAmount(double totalAmount) {
        return totalAmount * Rate.greenTax / 100;
    }

    public static double getSGST(double totalAmount) {
        return totalAmount * Rate.SGST / 100;
    }

    public static double getCGST(double totalAmount) {
        return totalAmount * Rate.CGST / 100;
    }

    public static double getSubsidy(double grandTotal) {
        if (grandTotal >= Rate.govermentSubsidyCutOFF) {
            return grandTotal - Rate.govermentSubsidy;
        }
        return grandTotal;
    }

    public static double getDiscountAmount(double totalAmount, double discountRate) {
        return totalAmount * discountRate / 100;
    }
}
