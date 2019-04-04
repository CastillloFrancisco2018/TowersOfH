package com.example.franciscocastillo.rot13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class  MainActivity extends AppCompatActivity
{

    private EditText inputText;
    private EditText outputText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputText = (EditText)this.findViewById(R.id.inputText);
        this.outputText = (EditText)this.findViewById(R.id.outputText);

    }
    public void  convertButton(View v)
    {
        String input = this.inputText.getText().toString();
        String answer = "";
        for(int i = 0; i < input.length(); i++)
        {
            answer = answer + rot13(input.charAt(i));
        }
        this.outputText.setText(answer);
    }
    public static char rot13(char c)
    {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";

        if(upper.indexOf(c) != -1)
        {// its an uppercase
            return upper.charAt((upper.indexOf(c)+13)%26);
        }
        else if(lower.indexOf(c) != -1)
        {
            return lower.charAt((lower.indexOf(c)+13)%26);
        }
        else
        {
            return c;
        }

    }

}




