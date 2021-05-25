package com.example.proyecto_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.ImageView;
//Integrantes:
//Maria Pitti  4-804-1193
//Gustavo Polanco  8-943-943
//Jhonathan Vidal 20-14-4198
//Juan Torres 8-924-1897
//Emir Chacin 8-927-896

public class MainActivity extends AppCompatActivity {

    private Button bnt1,bnt2,bnt3,bnt4;
    private ConstraintLayout cnst;
    private AnimationDrawable animationDrawable;
    private ImageView img1, img2, img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnt1 = (Button)findViewById(R.id.bnt1);
        bnt2 = (Button)findViewById(R.id.btn2);
        bnt3 = (Button)findViewById(R.id.btn3);
        bnt4 = (Button)findViewById(R.id.btn4);

        cnst = (ConstraintLayout)findViewById(R.id.cnt);

        img1 = (ImageView)findViewById(R.id.imagen1);
        img2 = (ImageView)findViewById(R.id.imagen2);
        img3 = (ImageView)findViewById(R.id.imagen3);


        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                activar_animaciones(bnt1,cnst,1);
            }
        });
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                activar_animaciones(bnt2,cnst,2);
            }
        });
        bnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activar_animaciones(bnt3,cnst,3);
            }
        });
        bnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagar_animaciones();
            }
        });
    }

    private void activar_animaciones(Button btn,ConstraintLayout cnst, int boton){
        apagar_animaciones();
        activar_gradiente(cnst, boton);
        activar_parpadeo_btn(btn);
        try {
            escalar_engranajes();
            Thread.sleep(500);
            //activar_engranajes();
        }catch (Exception e){

        }

    }

    private void apagar_animaciones(){
        bnt1.clearAnimation();
        bnt2.clearAnimation();
        bnt3.clearAnimation();
        img1.clearAnimation();
        img2.clearAnimation();
        img3.clearAnimation();
        try {
            animationDrawable.stop();
            cnst.setBackgroundColor(0);
        }catch (Exception e){

        }
    }

    private void activar_parpadeo_btn(Button btn){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_button);
        btn.startAnimation(animation);
    }
    private void escalar_engranajes(){
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        animation1.setFillAfter(true);
        animation2.setFillAfter(true);
        animation3.setFillAfter(true);
        img1.startAnimation(animation1);
        img2.startAnimation(animation2);
        img3.startAnimation(animation3);
    }
    private void activar_engranajes(){
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.counterclock);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock);
        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock);
        img1.startAnimation(animation1);
        img2.startAnimation(animation2);
        img3.startAnimation(animation3);

    }


    private void mover_engranajes_down(){

    }

    private void re_escalar_engranajes(){

    }

    private void activar_gradiente(ConstraintLayout cnst, int boton){
        if(boton == 1){
            cnst.setBackgroundResource(R.drawable.gradient_list);
        }
        if(boton == 2){
            cnst.setBackgroundResource(R.drawable.gradient_list1);
        }
        if(boton == 3){
            cnst.setBackgroundResource(R.drawable.gradient_list2);
        }
        ConstraintLayout constraintLayout = findViewById(R.id.cnt);
        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

    }

}