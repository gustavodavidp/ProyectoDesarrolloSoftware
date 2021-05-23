package com.example.proyecto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button bnt1,bnt2,bnt3,bnt4;
    private ImageView img1, img2, img3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnt1 = (Button)findViewById(R.id.bnt1);
        bnt2 = (Button)findViewById(R.id.btn2);
        bnt3 = (Button)findViewById(R.id.btn3);
        bnt4 = (Button)findViewById(R.id.btn4);
        img1 = (ImageView)findViewById(R.id.imagen1);
        img2 = (ImageView)findViewById(R.id.imagen2);
        img3 = (ImageView)findViewById(R.id.imagen3);


        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagar();
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_button);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock);
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.counterclock);
                img1.startAnimation(animation2);
                img2.startAnimation(animation1);
                img3.startAnimation(animation1);
                bnt1.startAnimation(animation);
            }
        });
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagar();
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_button);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock);
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.counterclock);
                img1.startAnimation(animation2);
                img2.startAnimation(animation1);
                img3.startAnimation(animation1);
                bnt2.startAnimation(animation);
            }
        });
        bnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagar();
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_button);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock);
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.counterclock);
                img1.startAnimation(animation2);
                img2.startAnimation(animation1);
                img3.startAnimation(animation1);
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
        img1.clearAnimation();
        img2.clearAnimation();
        img3.clearAnimation();
    }
}