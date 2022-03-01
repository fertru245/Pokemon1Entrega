package com.example.pokemon1entrega;


import java.io.File;

public class Pokemon {

    String nombre;
    String nivel;
    float vida;
    float vidaRestante;
    File foto;
    File foto_espalda;

    public Pokemon(String nombre, String nivel, float vida, float vidaRestante, File foto, File foto_espalda) {

        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.foto = foto;
        this.vidaRestante = vidaRestante;
        this.foto_espalda = foto_espalda;


    }


}
