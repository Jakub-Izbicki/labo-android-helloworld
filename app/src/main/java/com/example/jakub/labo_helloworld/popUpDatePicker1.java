package com.example.jakub.labo_helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.DatePicker;

public class PopUpDatePicker1 extends AppCompatActivity {

    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_date_picker1);

        datePicker = (DatePicker) findViewById(R.id.popUpDatePicker);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;

        getWindow().setLayout((int) (width * .9), (int) (height * .9));
    }

    public void sendDateBack(View view){

        String date = datePicker.getDayOfMonth() + "/" + (datePicker.getMonth() + 1) + "/" + datePicker.getYear();

        Intent intent = new Intent();
        intent.putExtra("DataString", date);
        setResult(RESULT_OK, intent);
        finish();
    }
}
