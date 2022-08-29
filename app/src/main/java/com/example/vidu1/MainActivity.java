package com.example.vidu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button tinh;
    private TextView BMI,Noti;
    private EditText height,weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        BMI = (TextView) findViewById(R.id.BMI);
        Noti = (TextView) findViewById(R.id.Noti);
        tinh = (Button) findViewById(R.id.tinh);
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float average,calHeight,calWeight;

                calHeight = Integer.parseInt(weight.getText().toString());
                calWeight = Float.parseFloat(weight.getText().toString());
                String str = String.valueOf(calWeight/(calHeight * calHeight));
                BMI.setText(str);
                average = calWeight/(calHeight * calHeight);
                if(average >= 35) {
                    Noti.setText("Nguoi beo phi do III");
                } else if (average >= 30 && average < 35) {
                    Noti.setText("Nguoi beo phi do II");
                } else if (average >= 25 && average < 30) {
                    Noti.setText("Nguoi beo phi do I");
                } else if (average >= 18 && average < 25) {
                    Noti.setText("Nguoi binh thuong");
                } else if (average < 18) {
                    Noti.setText("Nguoi gay");
                } else Noti.setText("Bao loi");
            }
        });
    }


}
