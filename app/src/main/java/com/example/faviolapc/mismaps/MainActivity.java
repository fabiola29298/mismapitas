package com.example.faviolapc.mismaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ir_maps(View v){
        Intent i = new Intent(this,MapsActivity.class);
        startActivity(i);
    }
    public void ir_maps2(View v){
        Intent i = new Intent(this,Maps2Activity.class);
        startActivity(i);
    }
    public void ir_maps3(View v){
        Intent i = new Intent(this,Maps3Activity.class);
        startActivity(i);
    }
    public void ir_mpp(View v){
        Intent i = new Intent(this,AdmodActivity.class);
        startActivity(i);
    }
    public void ir_plus(View v){
        Intent i = new Intent(this,PlusActivity.class);
        startActivity(i);
    }
}
