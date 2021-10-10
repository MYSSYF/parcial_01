package com.example.p1_grupo_color_cliente;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.usage.UsageEvents;
import android.os.Bundle;

import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {

    private EditText varname;
    private EditText varnumparti;
    private EditText varposx;
    private EditText varposy;
    private ImageButton varc1;
    private ImageButton varc2;
    private ImageButton varc3;
    private Button varcrear;
    private Button vardestuir;

    private String Fiji;
    private int r;
    private int g;
    private int b;

    int permiso;

    comis cum;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        varname = findViewById(R.id.name);
        varnumparti = findViewById(R.id.numparti);
        varposx = findViewById(R.id.x);
        varposy = findViewById(R.id.y);
        varc1 = findViewById(R.id.c1);
        varc2 = findViewById(R.id.c2);
        varc3 = findViewById(R.id.c3);
        varcrear = findViewById(R.id.crea);
        vardestuir = findViewById(R.id.destruye);

        cum = new comis();
        cum.start();
        varc1.setOnTouchListener(
                (view, event) -> {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        r = 255;
                        g = 0;
                        b = 0;
                    }

                    return true;
                });
        varc2.setOnTouchListener(
                (view, event) -> {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        r = 0;
                        g = 255;
                        b = 0;
                    }

                    return true;
                });
        varc3.setOnTouchListener(
                (view, event) -> {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        r = 0;
                        g = 0;
                        b = 255;
                    }

                    return true;
                });
        varcrear.setOnTouchListener(
                (view, event) -> {
                    permiso = 1;
                    int posx = (int) Integer.parseInt(String.valueOf(varposx.getText()));
                    int posy = (int) Integer.parseInt(String.valueOf(varposy.getText()));
                    int num = (int) Integer.parseInt(String.valueOf(varnumparti.getText()));
                    String nom = String.valueOf(varname.getText());


                    if (event.getAction() == MotionEvent.ACTION_DOWN) {

                        String paste = nom + ":" + num + ":" + posx + ":" + posy + ":" + r + ":" + g + ":" + b + ":" + permiso + ":" + "\n";


                        cum.dar(paste);
                        System.out.printf(paste + "\n");
                    }


                    return true;
                });
        vardestuir.setOnTouchListener((view, event) -> {
            permiso = 2;
            int posx = (int) Integer.parseInt(String.valueOf(varposx.getText()));
            int posy = (int) Integer.parseInt(String.valueOf(varposy.getText()));
            int num = (int) Integer.parseInt(String.valueOf(varnumparti.getText()));
            String nom = String.valueOf(varname.getText());
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                String paste = nom + ":" + num + ":" + posx + ":" + posy + ":" + r + ":" + g + ":" + b + ":" + permiso + ":" + "\n";


                cum.dar(paste);
                System.out.printf(paste + "\n");
            }
            return true;
        });

    }


}

