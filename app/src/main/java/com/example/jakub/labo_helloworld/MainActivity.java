package com.example.jakub.labo_helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTextView = (TextView) findViewById(R.id.dateTextView);
    }

    public void popupPickDate(View view){

        startActivityForResult(new Intent(MainActivity.this, PopUpDatePicker1.class), 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1){

            if (resultCode == RESULT_OK){

                dateTextView.setText(data.getStringExtra("DataString"));
            }
        }
    }
}
