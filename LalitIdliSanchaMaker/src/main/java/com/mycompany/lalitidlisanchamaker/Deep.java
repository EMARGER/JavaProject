package com.mycompany.lalitidlisanchamaker;

public class Deep {

    private HemiSphere deep;

    public Deep(double deepRadius) {
        deep = new HemiSphere(deepRadius);
    }

    public double getVolumeOfDeep() {
        return deep.getHemiSphereVolume();
    }

    public double getDeepRadius() {
        return deep.getRadius();
    }

}
