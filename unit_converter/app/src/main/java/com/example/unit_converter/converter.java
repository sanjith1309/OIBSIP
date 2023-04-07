package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class converter extends AppCompatActivity {

    public void abcd(View view){
            String s1 = t1.getText().toString().strip();
            if (!s1.isEmpty()){
            Toast.makeText(converter.this,"pressed"+s1+"ser",Toast.LENGTH_SHORT);
            float n1=Float.parseFloat(s1);
            n1 = (float) (n1/10.0);
            t2.setText(String.valueOf(n1)+" cm");
            }
            else{
            Toast.makeText(converter.this,"enter a valid number",Toast.LENGTH_SHORT);
            }
    }
    public void asdf(View view){
        String s2 = t3.getText().toString().strip();
        if (!s2.isEmpty()){
            Toast.makeText(converter.this,"pressed"+s2+"ser",Toast.LENGTH_SHORT);
            float n2=Float.parseFloat(s2);
            n2 = (float) (n2*10.0);
            t4.setText(String.valueOf(n2)+"mm");
        }
        else{
            Toast.makeText(converter.this,"enter a valid number",Toast.LENGTH_SHORT);
        }
    }
    public void asdfg(View view){
        String s3 = t5.getText().toString().strip();
        if (!s3.isEmpty()){
            Toast.makeText(converter.this,"pressed"+s3+"ser",Toast.LENGTH_SHORT);
            float n3=Float.parseFloat(s3);
            n3 = (float) (n3/1000.0);
            t6.setText(String.valueOf(n3)+" kg");
        }
        else{
            Toast.makeText(converter.this,"enter a valid number",Toast.LENGTH_SHORT);
        }
    }
    public void asdfgh(View view){
        String s4 = t7.getText().toString().strip();
        if (!s4.isEmpty()){
            Toast.makeText(converter.this,"pressed"+s4+"ser",Toast.LENGTH_SHORT);
            float n4=Float.parseFloat(s4);
            n4 = (float) (n4 * 1000.0);
            t8.setText(String.valueOf(n4)+" g");
        }
        else{
            Toast.makeText(converter.this,"enter a valid number",Toast.LENGTH_SHORT);
        }
    }
    Button b1,b2,b3,b4;
    TextView t2,t4,t6,t8;
    EditText t1,t3,t5,t7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        b1=(Button)findViewById(R.id.button6);
        b2=(Button) findViewById(R.id.button8);
        b3=(Button) findViewById(R.id.button7);
        b4=(Button) findViewById(R.id.button9);
        t1=(EditText) findViewById(R.id.editTextNumber1);
        t2=(TextView) findViewById(R.id.editTextNumber2);
        t3=(EditText) findViewById(R.id.editTextNumber3);
        t4=(TextView) findViewById(R.id.editTextNumber4);
        t5=(EditText) findViewById(R.id.editTextNumber5);
        t6=(TextView) findViewById(R.id.editTextNumber6);
        t7=(EditText) findViewById(R.id.editTextNumber7);
        t8=(TextView) findViewById(R.id.editTextNumber8);

    }
}