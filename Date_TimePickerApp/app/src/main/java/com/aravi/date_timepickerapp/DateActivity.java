package com.aravi.date_timepickerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DateActivity extends AppCompatActivity {

    DatePicker datePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        datePicker=findViewById(R.id.dtpicker);
        textView=findViewById(R.id.dttextView);

        Calendar calendar=Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        monthOfYear+=1;
                        textView.setText("You Select:-" +dayOfMonth+ "/ "+monthOfYear+ "/ "+year);
                    }
                });

    }
}
