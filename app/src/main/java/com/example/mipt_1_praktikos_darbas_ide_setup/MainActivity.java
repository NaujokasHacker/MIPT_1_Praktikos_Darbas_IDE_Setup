package com.example.mipt_1_praktikos_darbas_ide_setup;

import static android.R.color.holo_red_dark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView twMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twMain = (TextView)findViewById(R.id.twMain);

    }
    public void onBtnChangeTextClick(View view){

        twMain.setText("Hello New");
    }

    public void onBtnChangeColorClick(View view){
        twMain.setTextColor(getResources().getColor(R.color.purple_700));
    }
}