package com.dyc.poly.polyparameter;

public class Mannger extends Employee {
    private double bonnus;

    public double getBonnus() {
        return bonnus;
    }

    public void setBonnus(double bonnus) {
        this.bonnus = bonnus;
    }

    public Mannger(String name, double salary, double bonnus) {
        super(name, salary);
        this.bonnus = bonnus;

    }

    public void manage() {

        System.out.println("The manager "+getName()+" is managing");

    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonnus;
    }
}