package com.handeg.dev1sifreyapma;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Clicked (View view) {

        String uretilen="";

        int adet = 0;
        while (adet < 8) {
            int indeks= rnd.nextInt(2);
            if  (indeks==0)
            {  indeks = rnd.nextInt(25)+65;
             uretilen += (char)indeks;
             adet++;}
            else if (indeks==1){
                indeks= rnd.nextInt(25)+97;
                uretilen+=(char)indeks;
                adet++;

            }

        }
        TextView tv = findViewById(R.id.textView4);

        tv.setText(uretilen);
    }
    public void button2_Clicked(View view){

       String s="";

       int a=0;
       while (a<8){
           int i= rnd.nextInt(10)+48;
           s+= (char)i;
           a++;

       }
        TextView tv = findViewById(R.id.textView4);
       tv.setText(s);
    }
    public void button3_Clicked (View view){

        String sifre="";
        int s =0;
        while (s<8) {
            int h= rnd.nextInt(3);
            if  (h==0)
            {  h = rnd.nextInt(25)+65;
                    sifre+= (char)h;
                    s++;}
            else if (h==1){
                    h = rnd.nextInt(25)+97;
                    sifre+=(char)h;
                    s++;
            }
            else if (h==2){
                h= rnd.nextInt(10)+48;
                sifre+=(char)h;
                s++;
            }

        }
        TextView tv = findViewById(R.id.textView4);
        tv.setText(sifre);
    }

}