import java.util.Random; // Aqui estoy importando el metodo para el numero random

public class Ataque{

    String nombre_golpe; // Este es el nomber que va a recibir el golpe
    int damage; // Este es daño de lo pokemones

    public Ataque(String nombre, int danio){ // Constructor de la clase Ataque
        nombre_golpe = nombre;                  //guardo el nombre de mi ataque
        Random numero = new Random();           //creo un objeto de tipo Random para generar numeros aleatorios
        int n = numero.nextInt(90-30+1) + 30;   //me da un numero random entre 30 y 90
        damage = danio + n;                     //el ataque sera el numero que recibo mas el numero random entre 30 y 90
    }
}

