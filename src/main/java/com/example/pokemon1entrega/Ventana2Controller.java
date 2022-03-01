package com.example.pokemon1entrega;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Ventana2Controller {

    Pokemon pokemonSeleccionado;
    Pokemon2 oponente;

    ArrayList<Pokemon2> ListaPokemon = new ArrayList<>();

    Fondo f1 = new Fondo(new File("src\\main\\java\\com\\example\\Pokemon1Entrega\\Imagenes\\CampoBatalla.png"));

    Pokemon2 p21 = new Pokemon2("Alomomola", "Nv 45", 248, 248, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\Alomomola.gif"));
    Pokemon2 p22 = new Pokemon2("Blastoise", "Nv 34", 267, 267, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\Blastoise.gif"));
    Pokemon2 p23 = new Pokemon2("Glalie", "Nv 50", 300, 300, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\Glalie.gif"));
    Pokemon2 p24 = new Pokemon2("Rotom", "NV 24", 190, 190, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\Rotom.gif"));


    @FXML
    ImageView fondoInterfaz;

    @FXML
    AnchorPane btPrincipales;
    @FXML
    Button btCurar;
    @FXML
    Button btAtacar;

    @FXML
    AnchorPane btSecundarios;
    @FXML
    Button btAtaque1;
    @FXML
    Button btAtaque2;
    @FXML
    Button btAtaque3;
    @FXML
    Button btCancelar;

    @FXML
    ImageView miPokemon;
    @FXML
    Label nombreAliado;
    @FXML
    Label nivelAliado;
    @FXML
    ProgressBar vidaAliado;

    @FXML
    ImageView pokemonEnemigo;
    @FXML
    Label nombreEnemigo;
    @FXML
    Label nivelEnemigo;
    @FXML
    ProgressBar vidaEnemigo;


    public void Pkm(Pokemon pokemonSeleccionado) {

        Image fond1 = new Image(f1.fondo1.toURI().toString());
        fondoInterfaz.setImage(fond1);

        this.pokemonSeleccionado = pokemonSeleccionado;

        Image imagen1 = new Image(pokemonSeleccionado.foto_espalda.toURI().toString());
        miPokemon.setImage(imagen1);
        nombreAliado.setText(pokemonSeleccionado.nombre);
        nivelAliado.setText(pokemonSeleccionado.nivel);
        vidaAliado.setProgress(pokemonSeleccionado.vidaRestante / pokemonSeleccionado.vida);

        ListaPokemon.add(p21);
        ListaPokemon.add(p22);
        ListaPokemon.add(p23);
        ListaPokemon.add(p24);



        oponente = ListaPokemon.get((int) (Math.random() * ListaPokemon.size()));



        Image imagen2 = new Image(oponente.foto2.toURI().toString());
        pokemonEnemigo.setImage(imagen2);
        nombreEnemigo.setText(oponente.nombre2);
        vidaEnemigo.setProgress(oponente.vidaRestante2 / oponente.vida2);
        nivelEnemigo.setText(oponente.nivel2);

        btAtaque1.setVisible(false);
        btAtaque2.setVisible(false);
        btAtaque3.setVisible(false);
        btCancelar.setVisible(false);

    }


    @FXML
    protected void subirVida() {

        System.out.println("BotonVidaSeleccionado");
        Random r = new Random();

        int rdmVida = r.nextInt(50) + 25;
        pokemonSeleccionado.vidaRestante += rdmVida;
        vidaAliado.setProgress(pokemonSeleccionado.vidaRestante / pokemonSeleccionado.vida);
        System.out.println("Curacion de " + rdmVida);

        rdmVida = r.nextInt(50) + 25;
        oponente.vidaRestante2 += rdmVida;
        vidaEnemigo.setProgress(oponente.vidaRestante2 / oponente.vida2);
        System.out.println("Curacion de " + rdmVida);

    }

    @FXML
    protected void btAtaques() {

        System.out.println("BotonAtaqueSeleccionado");
        btAtacar.setVisible(false);
        btCurar.setVisible(false);
        btAtaque1.setVisible(true);
        btAtaque2.setVisible(true);
        btAtaque3.setVisible(true);
        btCancelar.setVisible(true);

    }

    @FXML
    protected void btSeguro() {

        int dañoSeguro = 20;

        System.out.println("BotonSeguroSeleccionado");

        pokemonSeleccionado.vidaRestante -= dañoSeguro;
        vidaAliado.setProgress(pokemonSeleccionado.vidaRestante / pokemonSeleccionado.vida);
        System.out.println("Daño seguro de " + dañoSeguro);

        oponente.vidaRestante2 -= dañoSeguro;
        vidaEnemigo.setProgress(oponente.vidaRestante2 / oponente.vida2);
        System.out.println("Curacion de " + dañoSeguro);
        controlarDeLaVidaAliado();
        controlarDeLaVidaEnemigo();

    }

    @FXML
    protected void btArriesgado() {

        System.out.println("BotonArriesgadoSeleccionado");
        Random r = new Random();

        int rdmArriesgado = r.nextInt(15) + 10;
        pokemonSeleccionado.vidaRestante -= rdmArriesgado;
        vidaAliado.setProgress(pokemonSeleccionado.vidaRestante / pokemonSeleccionado.vida);
        System.out.println("Daño seguro de " + rdmArriesgado);

        rdmArriesgado = r.nextInt(15) + 10;
        oponente.vidaRestante2 -= rdmArriesgado;
        vidaEnemigo.setProgress(oponente.vidaRestante2 / oponente.vida2);
        System.out.println("Curacion de " + rdmArriesgado);
        controlarDeLaVidaAliado();
        controlarDeLaVidaEnemigo();

    }

    @FXML
    protected void btMuyArriesgado() {

        System.out.println("BotonMuyArriesgadoSeleccionado");
        Random r = new Random();

        int rdmMuyArriesgado = r.nextInt(50);
        pokemonSeleccionado.vidaRestante -= rdmMuyArriesgado;
        vidaAliado.setProgress(pokemonSeleccionado.vidaRestante / pokemonSeleccionado.vida);
        System.out.println("Daño seguro de " + rdmMuyArriesgado);

        rdmMuyArriesgado = r.nextInt(50);
        oponente.vidaRestante2 -= rdmMuyArriesgado;
        vidaEnemigo.setProgress(oponente.vidaRestante2 / oponente.vida2);
        System.out.println("Curacion de " + rdmMuyArriesgado);
        controlarDeLaVidaAliado();
        controlarDeLaVidaEnemigo();

    }

    @FXML
    protected void btCancelar() {
        System.out.println("BotonCancelarSeleccionado");
        btAtacar.setVisible(true);
        btCurar.setVisible(true);
        btAtaque1.setVisible(false);
        btAtaque2.setVisible(false);
        btAtaque3.setVisible(false);
        btCancelar.setVisible(false);
    }

    private void showAlert1(Alert alert) {

        Optional<ButtonType> resultado = alert.showAndWait();

        if (resultado.get() == ButtonType.NO) {
            System.exit(0);
        }else{
            HelloController.stage2.close();
        }
    }

    private void showAlert2(Alert alert) {

        Optional<ButtonType> resultado = alert.showAndWait();

        if (resultado.get() == ButtonType.NO) {
            System.exit(0);
        }else{
            HelloController.stage2.close();
        }
    }

    public Alert alertaPokemonEnemigo(Pokemon pokemonSeleccionado) {

        Alert customAlert = new Alert(Alert.AlertType.NONE);

        customAlert.setTitle("Pokemon Ganador");
        customAlert.setContentText("El pokemon ganador es " +pokemonSeleccionado.nombre);
        customAlert.setGraphic(new ImageView(new Image(pokemonSeleccionado.foto.toURI().toString())));
        customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.NEXT, ButtonType.CLOSE);
        showAlert1(customAlert);

        return customAlert;

    }

    public Alert alertaPokemonAliado(Pokemon2 oponente) {

        Alert customAlert = new Alert(Alert.AlertType.NONE);

        customAlert.setTitle("Pokemon ha muerto");
        customAlert.setContentText("El pokemon perdedor es " +oponente.nombre2);
        customAlert.setGraphic(new ImageView(new Image(oponente.foto2.toURI().toString())));
        customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.NEXT, ButtonType.CANCEL);
        showAlert2(customAlert);

        return customAlert;

    }

    private void controlarDeLaVidaAliado () {

        if (pokemonSeleccionado.vidaRestante <= 0) {
            showAlert1(alertaPokemonAliado(oponente));
        }
    }

    private void controlarDeLaVidaEnemigo() {

        if (oponente.vidaRestante2 <= 0) {
            showAlert2(alertaPokemonEnemigo(pokemonSeleccionado));
        }

    }




}