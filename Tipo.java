public class Tipo {
    String nombre; // Este es el nombre del tipo de la defensa
    int defensa;  // Esta variable defensa del pokemon
    Ataque[] ataques=new Ataque[4]; //son 4 ataques los que debe tener. No se crean en el constructor
    double precision; //precision es un porcentaje del ataque. Por ejemplo, ataque de 50 y una precision del 50% = ataque de 25
    String debilidad; // La debilidad del pokemon

    public Tipo(String nombreTipo, int defensaTipo, double precisionTipo){  // Constructor de la clase tipo 
        nombre = nombreTipo;
        defensa = defensaTipo;
        precision = precisionTipo;
    }

    //este metodo devuelve la primera posicion del arreglo de ataques que esta libre
    //para guardar un ataque.
    //public dato_que_devuelve nombre_metodo(parametros que recibe)
    public int indice(){
        int posicionLibre=0;
        for(int j=0;j<ataques.length;j++){
            if (ataques[j] == null){
                posicionLibre = j;
                break;
            }
        }
        return posicionLibre; // Osea que me va a devolver la posicion libre.
    }

    //metodo void no devuelve nada
    //public dato_que_devuelve nombre_metodo(parametros que recibe)
    //este metodo agrega ataques al listado de ataques
    public void agregarAtaque(String nombre, int golpe){
        int posicionLibre = indice(); //me va a dar la posicion que tengo disponible
        ataques[posicionLibre] = new Ataque(nombre, (int) (golpe * precision));
        System.out.println("Se guardo el ataque en el listado de ataques en la posicion " + posicionLibre);
    }
//metodo que devuelva un ataque si se da un index (ejemplo 1 => ataques[1])
    public Ataque getAtaque(int posicion){
        return ataques[posicion];
    }

    //metodo que imprima todos los ataques
    public void printAllAtaques(){
        for(int j=0;j<ataques.length;j++){
            System.out.println((j+1) + ". Ataque: " + ataques[j].nombre_golpe + ", poder del ataque: " + ataques[j].damage);
        }
    }


    }

    
