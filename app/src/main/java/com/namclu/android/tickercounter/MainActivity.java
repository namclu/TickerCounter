package com.namclu.android.tickercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private Button addOneButton;
        private Button resetCountButton;

        addOneButton = findViewById(R.id.button_add_one_count);
        addOneButton.setOnClickListener(this);

        resetCountButton = findViewById(R.id.button_reset_count);
        resetCountButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }
}
