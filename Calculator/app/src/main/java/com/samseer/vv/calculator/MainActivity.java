package com.samseer.vv.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    Button btnadd,btnsub,btnmulti,btndiv;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt1=(EditText)findViewById(R.id.etxt1);
        txt2=(EditText)findViewById(R.id.etxt2);
        btnadd=(Button)findViewById(R.id.btn1);
        btnsub=(Button)findViewById(R.id.btn2);
        btnmulti=(Button)findViewById(R.id.btn3);
        btndiv=(Button)findViewById(R.id.btn4);
        result=(TextView)findViewById(R.id.txt);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String add = txt1.getText().toString();
                String add2 = txt2.getText().toString();
                int converted=Integer.parseInt(add);
                int converted2=Integer.parseInt(add2);
                int i = converted + converted2;
                String.valueOf(i);
                String abc = String.valueOf(i);
                result.setText(abc);

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String multi = txt1.getText().toString();
                String multi2 = txt2.getText().toString();
                int convert=Integer.parseInt(multi);
                int convert2=Integer.parseInt(multi2);
                int a = convert*convert2;
                String.valueOf(a);
                String ab = String.valueOf(a);
                result.setText(ab);

         btndiv.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String div = txt1.getText().toString();
                 String div2 =txt2.getText().toString();
                 int cn=Integer.parseInt(div);
                 int cn2=Integer.parseInt(div2);
                 int b = cn/cn2;
                 String.valueOf(b);
                 String s = String.valueOf(b);
                 result.setText(s);


         btnsub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String sub = txt1.getText().toString();
                 String sub2 = txt2.getText().toString();
                 int cnv=Integer.parseInt(sub);
                 int cnv2=Integer.parseInt(sub2);
                 int bc = cnv-cnv2;
                 String.valueOf(bc);
                 String e = String.valueOf(bc);
                 result.setText(e);

             }
         });
             }
         });

            }
        });

            }
        });

    }
}
