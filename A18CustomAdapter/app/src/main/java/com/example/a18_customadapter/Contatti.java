package com.example.a18_customadapter;

public class Contatti {
    private int img;
    private String nome;
    private String cognome;
    private String numTel;

    public Contatti (int img, String nome, String cognome, String numTel) {
        this.img = img;
        this.nome = nome;
        this.cognome = cognome;
        this.numTel = numTel;
    }

    public int getImg() {
        return img;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " \n" + numTel;
    }
}
