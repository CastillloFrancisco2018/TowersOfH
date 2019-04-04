package com.example.franciscocastillo.helloworldapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.content_hello_world);
        TextView MiddleTV = (TextView)this.findViewById(R.id.MiddleTV);
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(View, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void pressedButton(View v) {
        Button b = (Button) v;
        TextView MiddleTV = (TextView) this.findViewById(R.id.MiddleTV);
        MiddleTV.setText(b.getText().toString());
    }

    public void Button1(View v) {
        TextView MiddleTV = (TextView) this.findViewById(R.id.MiddleTV);
        MiddleTV.setText("1");
    }
    public void Button2(View v) {
        TextView MiddleTV = (TextView) this.findViewById(R.id.MiddleTV);
        MiddleTV.setText("2");
    }
    public void Button3(View v) {
        TextView MiddleTV = (TextView) this.findViewById(R.id.MiddleTV);
        MiddleTV.setText("3");
    }
    public void Button4(View v) {
        TextView MiddleTV = (TextView) this.findViewById(R.id.MiddleTV);
        MiddleTV.setText("4");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_world, menu);
        return true;
    }

    public void buttonOnClick(View v){

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
