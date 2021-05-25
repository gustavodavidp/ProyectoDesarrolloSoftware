package com.example.proyecto_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
    private ImageView img1, img2, img3,Im_fondo, Im_P;

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
        Im_fondo =(ImageView)findViewById(R.id.Im_fondo);
        Im_P =(ImageView)findViewById(R.id.Im_p);
        Im_fondo.setVisibility(View.INVISIBLE);
        Im_P.setVisibility(View.INVISIBLE);


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
        activar_engranajes();
        aparecer_fondo(boton);
    }

    private void apagar_animaciones(){
        bnt1.clearAnimation();
        bnt2.clearAnimation();
        bnt3.clearAnimation();
        img1.clearAnimation();
        img2.clearAnimation();
        img3.clearAnimation();
        Im_fondo.clearAnimation();
        Im_P.clearAnimation();
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
    private void activar_engranajes(){
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation1);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation2);
        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation3);
        animation1.setFillAfter(true);
        animation2.setFillAfter(true);
        animation3.setFillAfter(true);
        img1.startAnimation(animation1);
        img2.startAnimation(animation2);
        img3.startAnimation(animation3);
    }

    private void aparecer_fondo(int boton){
        if(boton == 1){
            Im_fondo.setImageResource(R.drawable.playa);
            Im_P.setImageResource(R.drawable.loro_fotograma1);
        }
        if(boton == 2){
            Im_fondo.setImageResource(R.drawable.desierto);
            Im_P.setImageResource(R.drawable.dodo_fotograma1);
        }
        if(boton == 3){
            Im_fondo.setImageResource(R.drawable.comic);
            Im_P.setImageResource(R.drawable.puma_fotograma1);
        }
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.aparecer);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.aparecer);
        animation1.setFillAfter(true);
        animation2.setFillAfter(true);
        Im_fondo.startAnimation(animation1);
        Im_P.startAnimation(animation2);
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