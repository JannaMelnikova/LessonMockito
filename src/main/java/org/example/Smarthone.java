package org.example;

public class Smarthone {
    private String model;
    private Calcilator calcilator;

    public Smarthone(Calcilator calcilator) {
        this.calcilator = calcilator;
    }

    public int plus(int a1, int a2) {
        return calcilator.add(a1,a2);
    }


}
