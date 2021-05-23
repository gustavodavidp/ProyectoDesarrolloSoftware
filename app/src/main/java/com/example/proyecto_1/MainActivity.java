package com.example.proyecto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bnt1,bnt2,bnt3,bnt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnt1 = (Button)findViewById(R.id.bnt1);
        bnt2 = (Button)findViewById(R.id.btn2);
        bnt3 = (Button)findViewById(R.id.btn3);
        bnt4 = (Button)findViewById(R.id.btn4);


        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagar();
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_button);
                bnt1.startAnimation(animation);
            }
        });
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagar();
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_button);
                bnt2.startAnimation(animation);
            }
        });
        bnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagar();
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_button);
                bnt3.startAnimation(animation);
            }
        });
        bnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagar();
            }
        });
    }
    private void apagar(){
        bnt1.clearAnimation();
        bnt2.clearAnimation();
        bnt3.clearAnimation();
    }
}