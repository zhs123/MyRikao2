package com.bawei.myrikao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ed1 = (EditText) findViewById(R.id.ed1);
         ed2 = (EditText) findViewById(R.id.ed2);
         button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=ed1.toString().trim();
                String userpwd=ed2.toString().trim();
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("username1",username);
                intent.putExtra("userpwd1",userpwd);
                startActivity(intent);
            }
        });
    }
}
