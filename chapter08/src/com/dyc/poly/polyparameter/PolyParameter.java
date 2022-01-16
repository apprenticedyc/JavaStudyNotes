package com.dyc.poly.polyparameter;

import java.lang.management.MemoryManagerMXBean;

public class PolyParameter {
    public static void main(String[] args) {
        Worker smith = new Worker("smith", 1000);
        Mannger mialan = new Mannger("mialan", 10000, 20000);
        PolyParameter polyParameter = new PolyParameter();
        System.out.println(polyParameter.showEmpAnnual(smith));
        System.out.println(polyParameter.showEmpAnnual(mialan));
polyParameter.testwork(smith);
polyParameter.testwork(mialan);
    }

    public double showEmpAnnual(Employee e) {
        return e.getAnnual();
    }

    public void testwork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();//向下转型
        } else if (e instanceof Mannger) {
            ((Mannger) e).manage();
        }
    }


}
