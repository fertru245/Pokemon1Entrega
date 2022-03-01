package com.example.pokemon1entrega;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;

public class HelloController {

    Pokemon pokemonSeleccionado;
    private Ventana2Controller v = null;
    private Stage stage = null;

    Pokemon p1 = new Pokemon("Regigigas", "Nv 63", 355, 355, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\regi1.gif"), new File ("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\RegigigasEspalda.gif"));
    Pokemon p2 = new Pokemon("Charizard", "Nv 49", 180, 180, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\charizard.gif"), new File ("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\CharizardEspalda.gif"));
    Pokemon p3 = new Pokemon("Pikachu", "Nv 68", 235, 235, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\pikachu.gif"), new File ("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\PikachuEspalda.gif"));
    Pokemon p4 = new Pokemon("Rayquaza", "Nv 54", 259, 259, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\Rayquaza1.gif"), new File ("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\RayquazaEspalda.gif"));
    Pokemon p5 = new Pokemon("Snorlax", "Nv 45", 220, 220, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\snorlax1.gif"), new File ("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\SnorlaxEspalda.gif"));
    Pokemon p6 = new Pokemon("Tyranitar", "Nv 54", 280, 280, new File("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\tyra.gif"), new File ("src\\main\\java\\com\\example\\pokemon1entrega\\Imagenes\\TyranitarEspalda.gif"));

    @FXML
    ImageView pokemonUno;
    @FXML
    AnchorPane bordePokemon1;
    @FXML
    Label nombre1;
    @FXML
    Label nivel1;
    @FXML
    Label vida1;
    @FXML
    ProgressBar progress1;

    @FXML
    ImageView pokemonDos;
    @FXML
    AnchorPane bordePokemon2;
    @FXML
    Label nombre2;
    @FXML
    Label nivel2;
    @FXML
    Label vida2;
    @FXML
    ProgressBar progress2;

    @FXML
    ImageView pokemonTres;
    @FXML
    AnchorPane bordePokemon3;
    @FXML
    Label nombre3;
    @FXML
    Label nivel3;
    @FXML
    Label vida3;
    @FXML
    ProgressBar progress3;

    @FXML
    ImageView pokemonCuatro;
    @FXML
    AnchorPane bordePokemon4;
    @FXML
    Label nombre4;
    @FXML
    Label nivel4;
    @FXML
    Label vida4;
    @FXML
    ProgressBar progress4;

    @FXML
    ImageView pokemonCinco;
    @FXML
    AnchorPane bordePokemon5;
    @FXML
    Label nombre5;
    @FXML
    Label nivel5;
    @FXML
    Label vida5;
    @FXML
    ProgressBar progress5;

    @FXML
    ImageView pokemonSeis;
    @FXML
    AnchorPane bordePokemon6;
    @FXML
    Label nombre6;
    @FXML
    Label nivel6;
    @FXML
    Label vida6;
    @FXML
    ProgressBar progress6;

    @FXML
    Button bt1;
    @FXML
    Text txt1;

    @FXML
    public void initialize() {

        Image imagen1 = new Image(p1.foto.toURI().toString());
        pokemonUno.setImage(imagen1);
        nombre1.setText(p1.nombre);
        nivel1.setText(p1.nivel);
        vida1.setText(String.valueOf(p1.vida));
        progress1.setProgress(calcularVida(p1));

        Image imagen2 = new Image(p2.foto.toURI().toString());
        pokemonDos.setImage(imagen2);
        nombre2.setText(p2.nombre);
        nivel2.setText(p2.nivel);
        vida2.setText(String.valueOf(p2.vida));
        progress2.setProgress(calcularVida(p2));

        Image imagen3 = new Image(p3.foto.toURI().toString());
        pokemonTres.setImage(imagen3);
        nombre3.setText(p3.nombre);
        nivel3.setText(p3.nivel);
        vida3.setText(String.valueOf(p3.vida));
        progress3.setProgress(calcularVida(p3));

        Image imagen4 = new Image(p4.foto.toURI().toString());
        pokemonCuatro.setImage(imagen4);
        nombre4.setText(p4.nombre);
        nivel4.setText(p4.nivel);
        vida4.setText(String.valueOf(p4.vida));
        progress4.setProgress(calcularVida(p4));

        Image imagen5 = new Image(p5.foto.toURI().toString());
        pokemonCinco.setImage(imagen5);
        nombre5.setText(p5.nombre);
        nivel5.setText(p5.nivel);
        vida5.setText(String.valueOf(p5.vida));
        progress5.setProgress(calcularVida(p5));

        Image imagen6 = new Image(p6.foto.toURI().toString());
        pokemonSeis.setImage(imagen6);
        nombre6.setText(p6.nombre);
        nivel6.setText(p6.nivel);
        vida6.setText(String.valueOf(p6.vida));
        progress6.setProgress(calcularVida(p6));

    }

    @FXML
    protected void selectPokemon1() {
        System.out.println("ImagenSeleccionada");
        bordePokemon1.setStyle("-fx-background-color:#c76fed");
        bordePokemon2.setStyle("-fx-background-color:#675073");
        bordePokemon3.setStyle("-fx-background-color:#675073");
        bordePokemon4.setStyle("-fx-background-color:#675073");
        bordePokemon5.setStyle("-fx-background-color:#675073");
        bordePokemon6.setStyle("-fx-background-color: ");
        bt1.setText("SIGUIENTE");
        txt1.setText("Pokemon seleccionado");
        pokemonSeleccionado = p1;
    }

    @FXML
    protected void selectPokemon2() {
        System.out.println("ImagenSeleccionada");
        bordePokemon1.setStyle("-fx-background-color:#675073");
        bordePokemon2.setStyle("-fx-background-color:#c76fed");
        bordePokemon3.setStyle("-fx-background-color:#675073");
        bordePokemon4.setStyle("-fx-background-color:#675073");
        bordePokemon5.setStyle("-fx-background-color:#675073");
        bordePokemon6.setStyle("-fx-background-color:#675073");
        bt1.setText("SIGUIENTE");
        txt1.setText("Pokemon seleccionado");
        pokemonSeleccionado = p2;
    }

    @FXML
    protected void selectPokemon3() {
        System.out.println("ImagenSeleccionada");
        bordePokemon1.setStyle("-fx-background-color:#675073");
        bordePokemon2.setStyle("-fx-background-color:#675073");
        bordePokemon3.setStyle("-fx-background-color:#c76fed");
        bordePokemon4.setStyle("-fx-background-color:#675073");
        bordePokemon5.setStyle("-fx-background-color:#675073");
        bordePokemon6.setStyle("-fx-background-color:#675073");
        bt1.setText("SIGUIENTE");
        txt1.setText("Pokemon seleccionado");
        pokemonSeleccionado = p3;
    }

    @FXML
    protected void selectPokemon4() {
        System.out.println("ImagenSeleccionada");
        bordePokemon1.setStyle("-fx-background-color:#675073");
        bordePokemon2.setStyle("-fx-background-color:#675073");
        bordePokemon3.setStyle("-fx-background-color:#675073");
        bordePokemon4.setStyle("-fx-background-color:#c76fed");
        bordePokemon5.setStyle("-fx-background-color:#675073");
        bordePokemon6.setStyle("-fx-background-color:#675073");
        bt1.setText("SIGUIENTE");
        txt1.setText("Pokemon seleccionado");
        pokemonSeleccionado = p4;
    }

    @FXML
    protected void selectPokemon5() {
        System.out.println("ImagenSeleccionada");
        bordePokemon1.setStyle("-fx-background-color:#675073");
        bordePokemon2.setStyle("-fx-background-color:#675073");
        bordePokemon3.setStyle("-fx-background-color:#675073");
        bordePokemon4.setStyle("-fx-background-color:#675073");
        bordePokemon5.setStyle("-fx-background-color:#c76fed");
        bordePokemon6.setStyle("-fx-background-color:#675073");
        bt1.setText("SIGUIENTE");
        txt1.setText("Pokemon seleccionado");
        pokemonSeleccionado = p5;
    }

    @FXML
    protected void selectPokemon6() {
        System.out.println("ImagenSeleccionada");
        bordePokemon1.setStyle("-fx-background-color:#675073");
        bordePokemon2.setStyle("-fx-background-color:#675073");
        bordePokemon3.setStyle("-fx-background-color:#675073");
        bordePokemon4.setStyle("-fx-background-color:#675073");
        bordePokemon5.setStyle("-fx-background-color:#675073");
        bordePokemon6.setStyle("-fx-background-color:#c76fed");
        bt1.setText("SIGUIENTE");
        txt1.setText("Pokemon seleccionado");
        pokemonSeleccionado = p6;
    }

    static Stage stage2;

    @FXML
    protected void siguientePagina() {

        System.out.println("Boton pulsado pasamos al siguiente escenario");

        try {

            Stage stage2 = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("interfaz2.fxml"));

            AnchorPane root = loader.load();
            Scene scene = new Scene(root, 960, 727);

            stage2.setScene(scene);
            stage2.show();

            Ventana2Controller v = loader.getController();
            v.Pkm(pokemonSeleccionado);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public Float calcularVida(Pokemon pokemon) {

        return Float.parseFloat(String.valueOf(pokemon.vidaRestante / pokemon.vida));


    }
}