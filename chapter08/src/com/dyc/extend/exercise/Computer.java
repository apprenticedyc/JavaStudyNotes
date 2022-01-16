package com.dyc.extend.exercise;

public class Computer {
    private String cpu;
    private int memory;
    private int disc;

    public String getdetails() {
        return "cpu=" + cpu + " memory=" + memory + " disc=" + disc;
    }

    public Computer(String CPU, int memory, int disc) {
        this.cpu = cpu;
        this.memory = memory;
        this.disc = disc;


    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }
}