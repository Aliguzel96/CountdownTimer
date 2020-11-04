package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textview);
        new CountDownTimer(10000,500){

            @Override
            public void onTick(long millisUntilFinished) {
                //her saniyede yapılacak işlem (1000ms)
                textView.setText("Kalan Süre:"+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {

                Toast.makeText(getApplicationContext(),"Tamamlandı!",Toast.LENGTH_LONG).show();

                textView.setText("Tebrikler!");
            }
        }.start();
    }
}