import java.util.Scanner;
import java.util.ArrayList;

public class inicio {
static Scanner sc = new Scanner(System.in);
static ArrayList<session> session = new ArrayList();

public static void main(String args[]) {
	Scanner leer = new Scanner(System.in);
	
	int opciones = 0;
	do {
		System.out.println("\n");
		System.out.println("*************************************************************************************************");                    
      	System.out.println("**********                                  bienvenido al menu                         **********");
        System.out.println("**********                                 selecione una opcion                        **********");	
	    System.out.println("********** 1. acerca de los desarrolladores                                            **********");
		System.out.println("********** 2. ayuda                                                                    **********");
		System.out.println("********** 3. iniciar                                                                  **********");
		System.out.println("********** 4. salir                                                                    **********");
		System.out.println("**********                                                                             **********");
		System.out.println("*************************************************************************************************");
		opciones = leer.nextInt();
		
		switch(opciones){
			case 1:
					opciones = 1;
					System.out.println("-------------------------------------------------------------------------------------------------");
					System.out.println("este programa es el proyecto bimestrar, orientada en programacion de objeto de java, realizado por los tecnicos: ");
					System.out.println("                                                                                              ");
					System.out.println(" Jefferson  Tejaxun  2021399");
					System.out.println(" David Castro 2021416");
					System.out.println("                                                                                              ");
					System.out.println("-------------------------------------------------------------------------------------------------");
					
					break;
			case 2:
					opciones = 2;
					System.out.println("-------------------------------------------------------------------------------------------------");
					System.out.println("                                                                                              ");
					System.out.println(" este es un programa basado en pokemon el cual tiene como fin librar batallas pokemon");
					System.out.println(" cada entrenador tendra 6 pokemones de distintos tipos y se enfrentara en contra de otro demostras sus hablidades");
					System.out.println(" demuestra que eres el mejor entrador");
					System.out.println("                                                                                              ");
					System.out.println("-------------------------------------------------------------------------------------------------");
					break;
			case 3:
					opciones = 3;
					leerSession();
					System.out.println("\nEntrenadores :");
					mostrarSession();
                    break;
	
		}
		
    }while(opciones !=4);
    System.out.println("a finalizado la ejecucion");
}
 public static void leerSession(){
		String nombre;
		String password;
		
		session aux;
		int i, n;
		do {
			System.out.print("numero de entrenadores?");
			n = sc.nextInt();
		} while (n < 0);
		sc.nextLine();
		
		for (i = 1; i <= n; i++) {
			
			System.out.println("*************************************************************************************************");
			System.out.print("**********                   bienvenido a Pokemon                                        **********");
			System.out.print("**********              inicio de sesion del entrnador " + i +                          "**********");
			System.out.print("********** Ingrese su nombre entrenador:                                                 **********");
			nombre = sc.nextLine();
			System.out.print("********** Ingrese su pasword de entrenador:                                             **********");
			password = sc.nextLine();
			sc.nextLine();
			
			aux = new session();
			aux.setNombre(nombre);
			aux.setPassword(password);
			session.add(aux);
		}
 }
		public static void mostrarSession(){
			for (int i = 0;i< session.size(); i++){
				System.out.println(session.get(i));
			}
		}
 
}
	

 