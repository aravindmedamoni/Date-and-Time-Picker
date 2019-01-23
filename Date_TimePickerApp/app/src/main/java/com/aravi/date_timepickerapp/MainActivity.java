package com.aravi.date_timepickerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker=findViewById(R.id.tmpicker);
        textView=findViewById(R.id.textview);
        button=findViewById(R.id.button);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textView.setText("The Time Now:-" +hourOfDay+ "Hour " +minute+ "Minuates:");
            }
        });
    }

    public void gotodateactivity(View view) {

        startActivity(new Intent(this,DateActivity.class));
    }
}
