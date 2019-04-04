package com.example.franciscocastillo.towersofhanoiapp;

public class Disk {
    private int size;
    private Disk nextDisk;


    public int getSize() {
        return size;
    }

    public Disk(int size){
        this.size= size;

    }

    public Disk getNextDisk() {
        return nextDisk;
    }

    public void setNextDisk(Disk nextDisk) {
        this.nextDisk = nextDisk;
    }
}
