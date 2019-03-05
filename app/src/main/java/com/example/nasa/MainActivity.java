package com.example.nasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // editText txtNumber;
   RadioButton RBMercury , RBMars,RBVenus,RBEarth,RBUranus,RBNeptune,RBSaturn;
    EditText txtNumber;
    RadioGroup radioGroup;
     Button button;
     double val=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        txtNumber=(EditText)findViewById(R.id.txtNumber);

    }
    public void Cal(View v)
    {
        int selectedId = radioGroup.getCheckedRadioButtonId();
         RBMercury = (RadioButton) findViewById(selectedId);

        //Toast.makeText(MainActivity.this,RBMercury.getText(), Toast.LENGTH_SHORT).show();

         //String RB=String.valueOf(RBMercury.getId());

        double txtNum = Double.parseDouble(txtNumber.getText().toString());
      //  Toast.makeText(MainActivity.this,"val= "+ String.valueOf(txtNum), Toast.LENGTH_SHORT).show();
     //  Toast.makeText(MainActivity.this,"RB= "+ String.valueOf(RB), Toast.LENGTH_SHORT).show();

       switch (RBMercury.getId())
       {
           //case R.id.RBMercury: val=8; Toast.makeText(MainActivity.this,"val= "+ String.valueOf(val), Toast.LENGTH_SHORT).show();break;
            case R.id.RBMercury: val=(txtNum*3.7)/9.8;break;

            case R.id.RBMars:val=(txtNum*3.711)/9.8;break;
            case R.id.RBEarth: val=(txtNum*9.807)/9.8;break;

            case R.id.RBUranus : val=(txtNum*8.87)/9.8;break;
            case R.id.RBNeptune : val=(txtNum*11.15)/9.8;break;
            case R.id. RBSaturn: val=(txtNum*10.44)/9.8;break;

        }
         Toast.makeText(MainActivity.this,"val= "+ String.valueOf(val), Toast.LENGTH_SHORT).show();

    }




}
