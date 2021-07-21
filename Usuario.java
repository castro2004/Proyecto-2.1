import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nombre;
    String password;
    String email;
    List<Pokemon> pokemones = new ArrayList<Pokemon>();


    public Usuario(String nombre, String password, String email){
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    public void addPokemon(Pokemon p){
        pokemones.add(p);
    }

    public int getPokemonQty(){
        return pokemones.size();
    }

    public void printAllPokemones(){
        for(Pokemon pokemon : pokemones){
            pokemon.printInfo();
        }
    }
}