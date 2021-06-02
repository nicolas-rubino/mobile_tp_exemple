package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DownloadTask task = new DownloadTask();

        task.execute("http://35.182.252.209:9091/countries/");

    }

    public void sendToMath(View view){
        Intent intent = new Intent(this, MathActivity.class );
        startActivity(intent);
    }

    public void sendToCapitals(View view){
        Intent intent = new Intent(this, CapitalsActivity.class );
        startActivity(intent);
    }
}