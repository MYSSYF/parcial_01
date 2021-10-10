package com.example.p1_grupo_color_cliente;

import androidx.annotation.NonNull;

public class particul {
    private String name;
    private int cuant;

    private int x;
    private int y;

    private int r;
    private int g;
    private int b;

    public particul() {
        this.name = "default";
        this.cuant = 0;

        this.x = 0;
        this.y = 0;
        this.r = 0;
        this.g = 0;
        this.b = 0;
    }

    public particul(String name, int cuant, int x, int y, int r, int g, int b) {
        this.name = name;
        this.cuant = cuant;
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCuant() {
        return cuant;
    }

    public void setCuant(int cuant) {
        this.cuant = cuant;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String toString() {
        return this.name + ":" + this.cuant + ":" + this.x + ":" + this.y + ":" + this.r + ":" + this.g + ":" + this.b;
    }
}
