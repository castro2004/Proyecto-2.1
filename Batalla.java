  public class Batalla { //Clase Batalla.

    public static void main(String[] args){ // Es el metodo para ejecutar un programa
      //=================ATAQUE================== 
      //System.out.println("Vamos a probar la clase ataque");
      Ataque prueba = new Ataque("Impact Trueno", 10); //creamos un objeto de tipo Ataque llamado prueba
      System.out.println("Nombre del ataque: " + prueba.nombre_golpe); // Esto imprime el nombre del ataque del pokemon
      System.out.println("Fuerza del ataque: " + prueba.damage); // Estoy imprime el la fuerza del ataque.
      //=================ATAQUE==================
      System.out.println("\n\n");
      //=================TIPO==================
      //System.out.println("Vamos a probar la clase tipo"); // Aqui comienza mi primer ataque
      Tipo MiTipo = new Tipo("agua", 5 , 0.75); // Creacion del objeto de ataque llamado MiTipo  que es tipo agua
      System.out.println("Nombre del tipo:" + MiTipo.nombre); //Nombre del tipo de pokemon 
      System.out.println("Cantidad de la defensa: " + MiTipo.defensa); // Esta es la cantidad que va tener la defensa
      System.out.println("La precision es: " + MiTipo.precision); // Esta es la precision
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice() = 0
      System.out.println("======================================================"); //Separacion 
      System.out.println("Vamos a crear un ataque para el tipo " + MiTipo.nombre); //  Aqui es la creacion de un ataque 
      MiTipo.agregarAtaque("Tail Whip", 10); //
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice() = 1
      System.out.println("Nombre del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.ataques[0].nombre_golpe);
      System.out.println("Fuerza del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.ataques[0].damage);
      System.out.println("======================================================");// Aqui comienza mi segundo "ataque".
      Tipo MiTipo2 = new Tipo("agua", 5 , 0.55);  // Creacion del objeto de ataque llamado MiTipo2  que es tipo agua
      System.out.println("Cantidad de la defensa: " + MiTipo2.defensa); // Esta es la cantidad que va tener la defensa
      System.out.println("La precision de mi segundo ataque es: " + MiTipo2.precision);  // Esta es la precision
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice = 0 
      System.out.println("======================================================");
      System.out.println("Vamos a crear un ataque para el tipo " + MiTipo.nombre); //  Aqui es la creacion de un ataque 
      MiTipo.agregarAtaque("Burbuja", 16);
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice() = 0
      System.out.println("Nombre del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.getAtaque(1).nombre_golpe); // Este es el nombe del ataque 
      System.out.println("Fuerza del ataque de tipo " + MiTipo.nombre + ": " + MiTipo.getAtaque(1).damage); // Este es la fuerza del ataque 
      System.out.println("======================================================"); // Seoaracion
      Tipo MiTipo3 = new Tipo("agua", 5 , 0.80);
      System.out.println("Cantidad de la defensa: " + MiTipo3.defensa); // Esta es la cantidad de la defensa
      System.out.println("La precision de mi primer ataque es de " +  MiTipo3.precision); //Esta es la precision del primer ataque
      System.out.println("La posicion para guardar ataques disponible es la " + MiTipo.indice()); //MiTipo.indice = 2     
      System.out.println("======================================================");
      //====================POKEMON====================
      System.out.println("Vamos a crear un nuevo pokemon"); //Esta es la creacion un nuevo pokemon
      Pokemon pikachu = new Pokemon("pikachu", "Electrico"); // La craeacion del objeto pokemon
      System.out.println("El nombre de mi pokemon es: " + pikachu.nombre); // Aqui esta el nombre de mi pokemon
      System.out.println("La vida de mi pokemon es: " + pikachu.vida); // Etste es la vida de mi pokemon 
      System.out.println("El tipo de mi pokemon " + pikachu.nombre + " es de :" + pikachu.claseTipo.nombre);  // Este es tipo de mi pokemon
      System.out.println("La defensa de mi pokemon " + pikachu.nombre + " es de :" + pikachu.claseTipo.defensa); // Esta es la defensa de mi pokemon
      System.out.println("La precision de mi pokemon " + pikachu.nombre + " es de :" + pikachu.claseTipo.precision);// Este es la precision de mi pokemon
      System.out.println("Los Ataques de mi pokemon son: "); // Esto imprime la lista de ataques de mi pokemon que esta en la clase Pokemon
      pikachu.claseTipo.printAllAtaques();
      //====================POKEMON 2====================
      System.out.println("======================================================");
      System.out.println("Vamos a crear un nuevo pokemon"); // Aqui es la creacion pokemon
      Pokemon Squirtle = new Pokemon("Squirtle", "Agua"); // Aqui esta la creacion de mi Pokemon
      System.out.println("El nombre de mi pokemon es: " + Squirtle.nombre); // Aqui esta el nombre de mi pokemon
      System.out.println("La vida de mi pokemon es: " + Squirtle.vida); // Aqui esta la vida de mi pokemon
      System.out.println("El tipo de mi pokemon " + Squirtle.nombre + " es de :" + Squirtle.claseTipo.nombre); // Aqui esta el tipo de mi pokemon 
      System.out.println("La defensa de mi pokemon " + Squirtle.nombre + " es de :" + Squirtle.claseTipo.defensa); // Aqui esta la fefensa e mi pokemon
      System.out.println("La presion de mi pokemon " + Squirtle.nombre + " es de :" + Squirtle.claseTipo.precision); // Aqui esta la precision de mi pokemon
      System.out.println("Los Ataques de mi pokemon son: "); // PARTE los taques de mi pokemon
      Squirtle.claseTipo.printAllAtaques(); //PARTE2 imprime la lsita de ataques de mi pokemon, que se encuentra en la clase Pokemon
      //====================POKEMON 3====================
      System.out.println("=========================================/=============");
      System.out.println("Vamos a crear un nuevo pokemon"); // Aqui es la creacion pokemon
      Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Planta");// Aqui esta la creacion de mi Pokemon
      System.out.println("El nombre de mi pokemon es: " + Bulbasaur.nombre);// Aqui esta el nombre de mi pokemon
      System.out.println("La vida de mi pokemon es: " + Bulbasaur.vida); // Aqui esta la vida de mi pokemon
      System.out.println("El tipo de mi pokemon " + Bulbasaur.nombre + " es de :" + Bulbasaur.claseTipo.nombre); // Aqui esta el tipo de mi pokemon 
      System.out.println("La defensa de mi pokemon " + Bulbasaur.nombre + " es de :" + Bulbasaur.claseTipo.defensa); // Aqui esta la fefensa e mi pokemon
      System.out.println("La precision de mi pokemon " + Bulbasaur.nombre + " es de :" + Bulbasaur.claseTipo.precision); // Aqui esta la precision de mi pokemon
      System.out.println("Los Ataques de mi pokemon son: "); // PARTE los taques de mi pokemon
      Bulbasaur.claseTipo.printAllAtaques(); //PARTE2 imprime la lsita de ataques de mi pokemon, que se encuentra en la clase Pokemon
      //====================POKEMON 4====================
      System.out.println("======================================================");
      System.out.println("Vamos a crear un nuevo pokemon"); // Aqui es la creacion pokemon
      Pokemon Charmander = new Pokemon("Charmander", "Fuego"); // Aqui esta la creacion de mi Pokemon
      System.out.println("El nombre de mi pokemon es: " + Charmander.nombre);
      System.out.println("La vida de mi pokemon es: " + Charmander.vida);
      System.out.println("El tipo de mi pokemon " + Charmander.nombre + " es de :" + Charmander.claseTipo.nombre);
      System.out.println("La defensa de mi pokemon " + Charmander.nombre + " es de :" + Charmander.claseTipo.defensa);
      System.out.println("La precision de mi pokemon " + Charmander.nombre + " es de :" + Charmander.claseTipo.precision);
      System.out.println("Los Ataques de mi pokemon son: ");  // PARTE los taques de mi pokemon
      Charmander.claseTipo.printAllAtaques(); //PARTE2 imprime la lsita de ataques de mi pokemon, que se encuentra en la clase Pokemon
      //====================POKEMON 5====================
      System.out.println("======================================================");
      System.out.println("Vamos a crear un nuevo pokemon"); // Aqui es la creacion pokemon
      Pokemon Swellow = new Pokemon("Swellow", "Volador");// Aqui esta la creacion de mi Pokemon
      System.out.println("El nombre de mi pokemon es: " + Swellow.nombre); ;// Aqui esta el nombre de mi pokemon
      System.out.println("La vida de mi pokemon es: " + Swellow.vida); // Aqui esta la vida de mi pokemon
      System.out.println("El tipo de mi pokemon " + Swellow.nombre + " es de :" + Swellow.claseTipo.nombre);// Aqui esta el tipo de mi pokemon 
      System.out.println("La defensa de mi pokemon " + Swellow.nombre + " es de :" + Swellow.claseTipo.defensa); // Aqui esta la fefensa e mi pokemon
      System.out.println("La precision de mi pokemon " + Swellow.nombre + " es de :" + Swellow.claseTipo.precision);// Aqui esta la precision de mi pokemon
      System.out.println("Los Ataques de mi pokemon son: ");  // PARTE los taques de mi pokemon
      Swellow.claseTipo.printAllAtaques(); //PARTE2 imprime la lsita de ataques de mi pokemon, que se encuentra en la clase Pokemonv


        while (pikachu.vida >0 && Bulbasaur.vida >0) { // Aqui esta estoy diciendo que mientras la vida de mis pokemones sea mayor de 0 que el conbate a a seguir.
          System.out.println("combatientes:"); // Aui estoy impriendo a los combatientes
          System.out.println("Mi pokemon 1 es: " + pikachu.nombre + " con una vida de  " + pikachu.vida ); // Estra impriendo mi primer pikachu, su nombre y su vida
          System.out.println("Mi pokemon 2 es: " + Bulbasaur.nombre + " con una vida de  " + Bulbasaur.vida ); // Esta imprimiendo en nombre y vida de mi segundo pokemon
          try{  // Aqui esta abriendo el tiempo
            Thread.sleep(5000); // El tiempo e pausa
          }
          catch(InterruptedException e){ // Esta encerrando el timepo de pausa
          }
          System.out.println("El turno de ataque es para: " + pikachu.nombre);// Aqui esta siguiente turno de ataque
          Bulbasaur.perdervida(pikachu.claseTipo.getAtaque(1).damage); // Aqui es ataque le esta retando vida al otro pokemon
          if(pikachu.vida <= 0){  // Mes esta diciendo que si la vida es igual a cero.(lee abajo) 
            System.out.println(Bulbasaur.nombre + " fue derrotado."); // Sera derrotado
          } else{                     //aqui comienza el turno del segundo pokemon.
                  System.out.println("combatientes:"); // Me esta impriendo los combatientes
                  System.out.println("Mi pokemon 1 es " + pikachu.nombre + " con una vida de: " + pikachu.vida ); // Nombre, vida de mi primer pokemon
                  System.out.println("Mi pokemon 2 es: " + Bulbasaur.nombre + " con una vida de  " + Bulbasaur.vida ); // Nombre y vida de mi segundo pokemon
                  try{  // Aqui esta abriendo el tiempo
                    Thread.sleep(5000); // El tiempo e pausa
                  }
                  catch(InterruptedException e){ // Esta encerrando el tiempo de pausa

                  }
                  if(pikachu.vida <= 0); // Que si la vida  de mi pokemon  es menos o igual a 0 a sidop derrotado
                  System.out.println(Bulbasaur .nombre + " a sido derrotado");
          }
  
        }

        

      // System.out.println("uso de arreglos");
      //probar con arreglo de strings
      // String[] listado = new String[6]; //arreglo de 6 strings
      //1 guardar por posicion
      // listado[0] = "Hola";
      // listado[1] = "Me";
      // listado[2] = "llamo";
      // listado[3] = "YON";

      //2 obtener objeto en un arreglo
      // int i = 4;
      // System.out.println("Objeto almacenado en la posicion " + i + ": " + listado[i]);

      //3recorrer todo el arreglo
      // for(int j=0;j<listado.length;j++){
      //   System.out.println("Objeto almacenado en la posicion " + j + ": " + listado[j]);
      // }

      //4 Si yo quiero saber que posicion esta disponible (sin datos)
      // int posicionLibre=0;
      // for(int j=0;j<listado.length;j++){
      //   if(listado[j] == null){
      //     posicionLibre = j;
      //     break;
      //   }
      // }
      // System.out.println("La posicion " + posicionLibre + " no tiene nada, ahi puede escribir");

    }

  }
