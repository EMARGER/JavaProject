/*  small size tray -----deep = 4to6------radiusDeep----min = 1.5 and max = 2.2---------tray = 1to5. 
    medium size tray ----deep = 6to8------radiusDeep----min = 1.2 and max = 1.5---------tray = 1to5
    large size tray -----deep = 10--------radiusDeep--- fix = 1.125---------------------tray = 1to5
*/
package com.mycompany.lalitidlisanchamaker;

public class LalitIdliSanchaMaker {

    public static void main(String[] args) {
        String traySize = "Medium";
        int numberOfTray = 3; 
        double deepRadius = 1.6;
        int numberOfDeep = 8;
        boolean validate = Validation.getValidateDataOfSatcha(traySize, numberOfTray, deepRadius, numberOfDeep);
        if(validate == true){
            Satcha satcha = new Satcha(traySize, numberOfTray, deepRadius, numberOfDeep);
            Estimation.getSatchaDetails(satcha);
        }
        else{
            System.out.println("Invalid Data");
        }
     }
}
