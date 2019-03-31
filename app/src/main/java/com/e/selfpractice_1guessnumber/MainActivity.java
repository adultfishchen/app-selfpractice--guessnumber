package com.e.selfpractice_1guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
int numberToGuess=0;
EditText e;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
numberToGuess=initNumberToGuess();
e=(EditText)findViewById(R.id.editText);
t=(TextView)findViewById(R.id.textView);
Button b=(Button)findViewById(R.id.button);
assert b!=null;
b.setOnClickListener(this);
       }
        @Override
        public void onClick(View v) {
            int number=Integer.parseInt(e.getText().toString());
            if(number==numberToGuess){
                t.setText(number+" is the right number!");
            }else if(number<numberToGuess){
                t.setText("Guess Higher!");
            }else{
                t.setText("Guess Lower!");
            }
            Log.i("Linda",numberToGuess+" ");

        }
    int initNumberToGuess(){
        Random r=new Random();
        numberToGuess=r.nextInt(100)+50;
        Log.i("Linda",numberToGuess+" ");
        return numberToGuess;
    }


}
