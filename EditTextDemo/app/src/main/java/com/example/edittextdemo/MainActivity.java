package com.example.edittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnSend_Click(View view){
        EditText edtname = (EditText) findViewById(R.id.edtName);
        TextView lblOutput = (TextView) findViewById(R.id.lblOutput);
        String name = edtname.getText().toString();
        lblOutput.setText("你的名字是: " + name);

    }
}