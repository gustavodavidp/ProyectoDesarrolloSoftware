package com.example.proyecto_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button bnt1,bnt2,bnt3,bnt4;
    private ConstraintLayout cnst;
    private ImageView img1, img2, img3 ;

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
                activar_animaciones(bnt1);
                cnst.setBackgroundResource(R.drawable.gradiente1);
            }
        });
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activar_animaciones(bnt2);
                cnst.setBackgroundResource(R.drawable.gradiente2);
            }
        });
        bnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activar_animaciones(bnt3);
                cnst.setBackgroundResource(R.drawable.gradiente3);
            }
        });
        bnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apagar_animaciones();
            }
        });
    }

    private void activar_animaciones(Button btn){
        apagar_animaciones();
        activar_parpadeo_btn(btn);
        activar_engranajes();
    }

    private void apagar_animaciones(){
        bnt1.clearAnimation();
        bnt2.clearAnimation();
        bnt3.clearAnimation();
        img1.clearAnimation();
        img2.clearAnimation();
        img3.clearAnimation();
    }

    private void activar_parpadeo_btn(Button btn){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_button);
        btn.startAnimation(animation);
    }
    private void activar_engranajes(){
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.counterclock);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock);
        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock);
        img1.startAnimation(animation1);
        img2.startAnimation(animation2);
        img3.startAnimation(animation3);

    }

}