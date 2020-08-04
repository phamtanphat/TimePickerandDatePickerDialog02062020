package com.example.timepickeranddatepickerdialog02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button mBtnTime,mBtnDate;
    TextView mTvTime,mTvDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvDate = findViewById(R.id.textviewDate);
        mTvTime = findViewById(R.id.textviewTime);
        mBtnTime = findViewById(R.id.buttonSetTime);
        mBtnDate = findViewById(R.id.buttonSetDate);

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        Log.d("BBB",simpleDateFormat.format(System.currentTimeMillis()) + "");
        Calendar calendar = Calendar.getInstance();
        int ngay = calendar.get(Calendar.DATE);
        int thang = calendar.get(Calendar.MONTH);
        int nam = calendar.get(Calendar.YEAR);
        Log.d("BBB",nam + "");
    }
}