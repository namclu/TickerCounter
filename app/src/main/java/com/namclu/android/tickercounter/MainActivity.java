package com.namclu.android.tickercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private String COUNTER_KEY = "counter";
    private int mCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addOneButton;
        Button resetCountButton;

        addOneButton = findViewById(R.id.button_add_one_count);
        addOneButton.setOnClickListener(this);

        resetCountButton = findViewById(R.id.button_reset_count);
        resetCountButton.setOnClickListener(this);

        if (savedInstanceState != null) {
            mCounter = savedInstanceState.getInt(COUNTER_KEY);
            updateCounterView();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(COUNTER_KEY, mCounter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_add_one_count:
                mCounter++;
                updateCounterView();
                break;
            case R.id.button_reset_count:
                mCounter = 0;
                updateCounterView();
                break;
        }
    }

    private void updateCounterView() {
        TextView counterView = findViewById(R.id.text_counter);
        counterView.setText(String.valueOf(mCounter));
    }
}
