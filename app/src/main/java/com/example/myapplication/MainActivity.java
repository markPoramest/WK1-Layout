package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int prevx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.b1);
        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l1 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(l1);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x;

                TextView t1 = findViewById(R.id.t1);
                Random r = new Random();
                while(true) {
                    x = r.nextInt(3) + 1;
                    if (x==prevx){
                        x = r.nextInt(3) + 1;
                    }
                    else{
                        System.out.println(prevx +" "+ x);
                        prevx = x;
                        break;
                    }
                }
                if (x==1)
                {
                    t1.setText("จีจี้ยิ้มให้คุณ");
                }
                else if (x==2)
                {
                    String y = "จีจี้รักคุณนะ";
                    t1.setText(y);
                }
                else
                {
                    t1.setText("จีจี้กำลังคิดถึงคุณ");
                }
            }
        });




    }
}
