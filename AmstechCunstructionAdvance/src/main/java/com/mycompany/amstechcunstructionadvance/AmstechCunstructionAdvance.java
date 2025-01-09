package com.mycompany.amstechcunstructionadvance;
public class AmstechCunstructionAdvance {

    public static void main(String[] args) {
        double length;
        double width;
        String type;
        User atul = new User("Atul Patel", "Male");
        Plot plot1 = new Plot();
        Estimator.getEstimator(plot1, atul, 0);
        System.out.println("===========================================");
        User goutam = new User("Goutam Dogayan","Male");
        type = "C";
        length =150;
        width = 100;
        if(Validation.getValidateLength(type, length) == true && Validation.getValidateWidth(type, width)== true){
            Plot plot2 = new Plot(length, width);
            Estimator.getEstimator(plot2, goutam, 0);
        }
        else {
            System.out.println("Plot is not Avaliable");
        }
        System.out.println("===========================================");
        User ashika = new User("Ashika Patel","Female");
        type = "B";
        length = 70;
        if(Validation.getValidateLength(type, length) == true){
            Plot plot3 = new Plot(length);
            Estimator.getEstimator(plot3, ashika, 0);
        }
        else {
            System.out.println("Plot is not Avaliable");
        }
    }   
}
