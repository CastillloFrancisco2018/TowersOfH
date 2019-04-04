package com.example.franciscocastillo.towersofhanoiapp;

public class Tower {
    private Disk top;

    public int count;

    public Tower(){
        this.top= null;
        this.count = 0;

    }

    public Disk peek(){
        return this.top;
    }

    public Disk pop(){
        Disk diskToReturn = this.top;
        if (this.top != null){
            this.top = this.top.getNextDisk();
            diskToReturn.setNextDisk(null);
        }
        return diskToReturn;
    }

    public boolean push(Disk d){
        if(this.top== null){
            this.top = d;
            return true;
        }
        else if( d.getSize() < this.top.getSize()){
             d.setNextDisk(this.top);
             this.top = d;
             return true;
        }
        else{
            return false;
        }

    }
}
