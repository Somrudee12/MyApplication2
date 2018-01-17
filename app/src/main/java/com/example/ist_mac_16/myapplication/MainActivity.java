package com.example.ist_mac_16.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv1);
        btn = (Button)findViewById(R.id.button);
        edt = (EditText)findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                tv.setText("Test");
                String txt = edt.getText().toString();
                tv.setText(txt);
            }
        });

    }
}
