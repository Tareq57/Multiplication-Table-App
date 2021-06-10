package com.example.mulitiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    private Button submit_button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView13);
        t2=findViewById(R.id.textView14);
        t3=findViewById(R.id.textView15);
        t4=findViewById(R.id.textView16);
        t5=findViewById(R.id.textView17);
        t6=findViewById(R.id.textView18);
        t7=findViewById(R.id.textView19);
        t8=findViewById(R.id.textView20);
        t9=findViewById(R.id.textView21);
        t10=findViewById(R.id.textView22);
        editText=findViewById(R.id.editTextTextPersonName);
        submit_button=findViewById(R.id.button);

    }
    public void submit_action(View view){
        Toast.makeText(this, "Great Job!!", Toast.LENGTH_SHORT).show();
        String str=editText.getText().toString();
        int num=Integer.parseInt(str);
        int p=1;
        t1.setText(Integer.toString(num)+" * 1 ="+Integer.toString((num*p)));
        p++;

        t2.setText(Integer.toString(num)+" * 2 ="+Integer.toString((num*p)));
        p++;

        t3.setText(Integer.toString(num)+" * 3 ="+Integer.toString((num*p)));
        p++;

        t4.setText(Integer.toString(num)+" * 4 ="+Integer.toString((num*p)));
        p++;

        t5.setText(Integer.toString(num)+" * 5 ="+Integer.toString((num*p)));
        p++;

        t6.setText(Integer.toString(num)+" * 6 ="+Integer.toString((num*p)));
        p++;

        t7.setText(Integer.toString(num)+" * 7 ="+Integer.toString((num*p)));
        p++;

        t8.setText(Integer.toString(num)+" * 8 ="+Integer.toString((num*p)));
        p++;

        t9.setText(Integer.toString(num)+" * 9 ="+Integer.toString((num*p)));
        p++;

        t10.setText(Integer.toString(num)+" * 10 ="+Integer.toString((num*p)));
    }
}