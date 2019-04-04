package com.example.franciscocastillo.app10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //code that runs as app is called
        TextView TitleTV = this.findViewById(R.id.TitleTV);
        TitleTV.setText("Changed Title");
    }
    //code for the buttons
    public void button1Push(View v){

        TextView OutputTV = this.findViewById(R.id.OutputTV);
        OutputTV.setText("Button1 Output");
    }
    public void button2Push(View v){

        TextView OutputTV = this.findViewById(R.id.OutputTV);
        OutputTV.setText("Button2 Output");
    }
    public void button3Push(View v){

        TextView OutputTV = this.findViewById(R.id.OutputTV);
        OutputTV.setText("Button3 Output");
    }
    //more advanced Button code
    public void aButtonPushed(View v){
        Button b = (Button)v;
        TextView Output2TV = this.findViewById(R.id.Output2TV);
        Output2TV.setText(b.getText().toString());
    }
    }
