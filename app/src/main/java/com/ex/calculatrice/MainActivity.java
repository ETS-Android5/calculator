package com.ex.calculatrice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button un ;
    Button deux ;
    Button trois;
    Button quatre ;
    Button cinq ;
    Button six ;
    Button sept;
    Button huit ;
    Button exposant;
    Button neuf ;
    Button zero ;
    Button devide;
    Button egal ;
    Button moins ;
    Button plus ;
    Button par ;
    Button mult;
    Button clear ;
    EditText editText ;
    ImageButton delete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         un = findViewById(R.id.b_1);
         deux = findViewById(R.id.b_2);
        trois = findViewById(R.id.b_3);
         quatre = findViewById(R.id.b_4);
       cinq = findViewById(R.id.b_5);
         six = findViewById(R.id.b_6);
         sept = findViewById(R.id.b_7);
        huit = findViewById(R.id.b_8);
         exposant = findViewById(R.id.b_exp);
         neuf = findViewById(R.id.b_9);
         zero = findViewById(R.id.b_0);
         devide = findViewById(R.id.b_devide);
         egal = findViewById(R.id.b_egal);
         moins = findViewById(R.id.b_moins);
        plus = findViewById(R.id.b_plus);
         par = findViewById(R.id.b_par);
       mult = findViewById(R.id.b_mult);
         clear = findViewById(R.id.b_c);
         editText = findViewById(R.id.text);
         delete = findViewById(R.id.delete);


    }

    public void zeroBTN(View view) {

    }
    public void unBTN(View view) {

    }
    public void deuxBTN(View view) {

    }
    public void troisBTN(View view) {

    }
    public void quatreBTN(View view) {

    }
    public void cinqBTN(View view) {

    }
    public void sixBTN(View view) {

    }
    public void septBTN(View view) {

    }
    public void huitBTN(View view) {

    }
    public void neufBTN(View view) {

    }
    public void plusBTN(View view) {

    }
    public void moinBTN(View view) {

    }
    public void multBTN(View view) {

    }
    public void devideBTN(View view) {

    }
    public void egalBTN(View view) {

    }
    public void expBTN(View view) {

    }
    public void parBTN(View view) {

    }
    public void clearBTN(View view) {

    }
    public void deleteBTN(View view) {

    }

}