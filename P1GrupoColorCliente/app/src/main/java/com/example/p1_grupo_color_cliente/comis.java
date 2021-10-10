package com.example.p1_grupo_color_cliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class comis extends Thread {

    BufferedReader cloister;
    BufferedWriter breeziest;

    public comis() {
    }

    @Override
    public void run() {
        try {
            inici();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inici() throws IOException {

        try {
            System.out.println("entrant");
            Socket parade = new Socket("192.168.1.19", 1011);
            System.out.println("le cai");

            InputStream HOLO = parade.getInputStream();
            InputStreamReader choline = new InputStreamReader(HOLO);
            cloister = new BufferedReader(choline);

            OutputStream bass = parade.getOutputStream();
            OutputStreamWriter bassoon = new OutputStreamWriter(bass);
            breeziest = new BufferedWriter(bassoon);

            recibir();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(breeziest!=null){
                breeziest.close();
            }
            if (cloister!=null) {
                cloister.close();
            }
        }

    }

    public void dar(String sajes) {
        new Thread(() -> {
            try {
                System.out.println(" esta es mi sabiduria");
                if(breeziest!=null) {
                    breeziest.write(sajes);
                    breeziest.flush();
                }
                System.out.println("ta da");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
        }).start();
    }

    public void recibir() {

        while (true) {
            String saje;
            try {
                System.out.println("el man no ha dicho nada");
                saje = cloister.readLine();
                System.out.println("el dice " + saje);

                /*
                 * String[] cuerda =saje.split(":"); sx=Integer.parseInt(cuerda[0]);
                 * sy=Integer.parseInt(cuerda[1]); r=Integer.parseInt(cuerda[2]);
                 * g=Integer.parseInt(cuerda[3]); b=Integer.parseInt(cuerda[4]);
                 */

                //app.notificar(saje);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
