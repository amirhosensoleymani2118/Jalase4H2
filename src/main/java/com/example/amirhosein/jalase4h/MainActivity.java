package com.example.amirhosein.jalase4h;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_click(View join) {
        Toast.makeText(MainActivity.this, "your welcome", Toast.LENGTH_SHORT).show();
    }
}
