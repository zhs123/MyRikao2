package com.bawei.myrikao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText ed1 = (EditText) findViewById(R.id.text1);
        EditText ed2 = (EditText) findViewById(R.id.text2);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username1");
        String userpwd = intent.getStringExtra("userpwd1");
        ed1.setText(username);
        ed2.setText(userpwd);
    }
}
