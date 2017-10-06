package com.example.adnangujjar.pocketpharmatheme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsignin = (Button) findViewById(R.id.btnsingin);

        final Intent intent = new Intent(this, MenuActivity.class);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                startActivity(intent);
            }
        });
    }
}
