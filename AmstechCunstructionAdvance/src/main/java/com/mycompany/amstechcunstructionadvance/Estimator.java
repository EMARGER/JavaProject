package com.mycompany.amstechcunstructionadvance;

public class Estimator {

    public static void getEstimator(Plot p, User u, double discountRate) {

        double area = p.getArea();
        double totalAmount = Operation.getTotalAmount(p.getType(), area);
        double registryAmount = Operation.getRegistryAmount(u.getGender(), totalAmount);
        double greenTaxAmount = Operation.getGreenTaxAmount(totalAmount);
        double socityDevelopmentAmount = Operation.getSocityDevelopmentAmount(p.getType());
        double clubMemberShipAmount = Operation.getClubMemberShipAmount(p.getType());
        double sgstAmount = Operation.getSGST(totalAmount);
        double cgstAmount = Operation.getCGST(totalAmount);
        double grandTotal = totalAmount + registryAmount + greenTaxAmount + socityDevelopmentAmount + clubMemberShipAmount + sgstAmount + cgstAmount;
        double grandTotalAfterSubsidy = Operation.getSubsidy(grandTotal);
        double grandTotalAfterDiscount = grandTotal - Operation.getDiscountAmount(totalAmount, discountRate);

        System.out.println("you got Plot in Sector : " + p.getType());
        System.out.println("Length Of Plot : " + p.getLength());
        System.out.println("Width Of Plot : " + p.getWidth());
        System.out.println("Area of Plot : " + area);
        System.out.println("Total Amount of Plot : " + totalAmount);
        System.out.println("Green Tax Amount of Plot : " + greenTaxAmount);
        System.out.println("Socity Development Amount of Plot : " + socityDevelopmentAmount);
        System.out.println("Club Member Ship Amount of Plot : " + clubMemberShipAmount);
        System.out.println("SGST of Plot : " + sgstAmount);
        System.out.println("CGST of Plot : " + cgstAmount);
        System.out.println("Grand Total After Subsidy of Plot : " + grandTotalAfterSubsidy);
        System.out.println("Grand Total of Plot : " + grandTotal);
        System.out.println("Grand Total After Discount of Plot : " + grandTotalAfterDiscount);
    }
}
