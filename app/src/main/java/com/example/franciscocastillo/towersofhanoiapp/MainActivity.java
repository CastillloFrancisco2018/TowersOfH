package com.example.franciscocastillo.towersofhanoiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView disk0TV, disk1TV, disk2TV;
    private ViewGroup tower0VG, tower1VG, tower2VG, placeholderVG;
    private Disk disk0,disk1,disk2;
    private Tower tower0,tower1,tower2;
    private Disk placeHolder = null;
    private boolean  selection = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.disk0TV = this.findViewById(R.id.disk0);
        this.disk1TV = this.findViewById(R.id.disk1);
        this.disk2TV = this.findViewById(R.id.disk2);

        this.tower0VG = this.findViewById(R.id.tower0VG);
        this.tower1VG = this.findViewById(R.id.tower1VG);
        this.tower2VG = this.findViewById(R.id.tower2VG);
        this.placeholderVG = this.findViewById(R.id.placeHolderVG);

        this.disk0 = new Disk(1);
        this.disk1 = new Disk(2);
        this.disk2 = new Disk(3);

        this.tower0 = new Tower();
        this.tower1 = new Tower();
        this.tower2 = new Tower();

        this.tower0.push(this.disk2);
        this.tower0.push(this.disk1);
        this.tower0.push(this.disk0);


        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(7);
        s.push(5);
        s.display();
        s.pop();
        s.pop();
        s.pop();
        s.display();
        System.out.println("****this is using peek function: " + s.peek());

    }


    private void source(Tower tower,ViewGroup towerVG){
        if(tower.peek() != null){
            this.placeHolder =tower.pop();
            TextView temp = (TextView)towerVG.getChildAt(0);
            towerVG.removeViewAt(0);
            this.placeholderVG.addView(temp);
            this.selection = false;
        }

    }
    private void destination(Tower tower,ViewGroup towerVG){
        if(tower.push(this.placeHolder)){
            this.placeHolder = null;
            TextView temp = (TextView)this.placeholderVG.getChildAt(0);
            this.placeholderVG.removeViewAt(0);
            towerVG.addView(temp,0);

        }
    }

    public void button1pressed(View v) {
        if(this.selection){
            this.source(this.tower0, tower0VG);

        }
        else{
            this.destination(this.tower0,this.tower0VG);
            tower0.count++;
            System.out.print("******tower0.count");
        }

    }
    /*
    if( this.tower0.count==3){
        System.out.print("you Win");
    }
     if( this.tower1.count==3){
        System.out.print("you Win");
    }
     if( this.tower2.count==3){
        System.out.print("you Win");
    }
    */
    public void button2pressed(View v) {
        if(this.selection){
            this.source(this.tower1, tower1VG);

        }
        else{
            this.destination(this.tower1,this.tower1VG);
            tower1.count++;
            System.out.print("******tower1.count");
        }
    }

    public void button3pressed(View v) {
        if(this.selection){
            this.source(this.tower2, tower2VG);
        }
        else{
            this.destination(this.tower2,this.tower2VG);
            tower2.count++;
            System.out.print("******tower2.count");
        }
    }

}
