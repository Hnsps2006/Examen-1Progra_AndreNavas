/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg1_andrenavas;
import java.util.Scanner;
/**
 *
 * @author eliza
 */
public class Examen1_AndreNavas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String registroMenu = ""; // Inicialmente, el registro está vacío.
        //inicializamos el registro
        int opcion =8;
        int contador1=0;
        int contador2=0;
        System.out.print("Bienvenido a mi programa");
        entrada.nextLine();
        // esto obliga al usuario a hacer enter para que el programa pueda seguir
        while (opcion==8){
            System.out.println("Elija una de las siguientes ocpiones: ");
            System.out.println("1. Ejercicios String");
            System.out.println("2. Respuestas a preguntas");
            System.out.println("3. Mostrar el historial del menú");
            System.out.println("4. Salir");
            int option = entrada.nextInt();
            entrada.nextLine(); //salto de linea para luego usar string
            // sirve para leer un entero y darle la option al usuario
            //de ingresar un numero

            switch (option) {
                case 1:
                contador1++;
                System.out.print("Ingrese una cadena (de al menos 3 caracteres): "); //opcion para el usuario para ingresar cadena
                registroMenu += "Ejercicios String - ";
                String cadena = entrada.nextLine(); //leo string

                if (cadena.length() < 3) { //condición que si se cumple le dira un mensaje de invalidad al usuario
                    System.out.println("La cadena debe tener al menos 3 caracteres."); 
                }

                if (cadena.length() % 2 != 0) {  //consigo el tamaño de la cadena y luego consigo el residuo dividiendolo por 2 y si no es igual a 0
                    System.out.print("Ingrese una nueva cadena: "); //se ingresara una nueva cadena 
                    String nuevaCadena = entrada.nextLine(); //leo la nuevacadena
 
                    String cadenaResultante = cadena + nuevaCadena; //esto ya va ser la cadena nueva

                    System.out.println("Cadena resultante: " + cadenaResultante); //concateno la nueva cadena resultante  y se imprimir la cadena que yo unie anteriormente
                    // que es la cadenaResultante
                    System.out.println("Tamaño de la nueva cadena: " + cadenaResultante.length()); //leo el tamaño de la nueva cadena 
                } else { //sino 
                    int mitad = cadena.length() / 2; //divido la cadena a la mitad, en otras palabras divido el tama;o a la mitad
                    String primeraMitad = cadena.substring(0, mitad).replace("", "-").substring(1); //En la primera cadena lo replaco por una substring osea la priemra parte la remplazo por -
                    String segundaMitad = cadena.substring(mitad).replace("", "/").substring(1); //en la segunda mitad le pido remplazar a la mitad  o que en la mitad de cada palabra le remplace por un /
                    //es decir que en la primera substring va ser remplazado por - y en la segunda por /
                    System.out.println("Primera mitad de la cadena: " + primeraMitad); //aquí solo concateno la primera mitad
                    System.out.println("Segunda mitad de la cadena: " + segundaMitad); //aquí la segunda mitad 
                    System.out.println("Cadena resultante: " + primeraMitad + segundaMitad); //aqui ambas
                }
                    opcion=8; //siempre pongo opcio le asigno 8 para que se repita el ciclo.Por ejemplo,cuando quiero terminar el ciclo lo declaro como 0 de esta forma no se declar porque en el while lo pogno 
                    //como while(opcion=0).
                    break;
                case 2:
                    System.out.println("Usted ha elegido la opción número 2. Respuestas a preguntas");
                    contador2++;
                    System.out.println("1. Describa el funcionamiento y diferencias del if y del switch case");
                    System.out.println("R1. la principal diferencia radica en la flexibilidad y el tipo de comparaciones que se pueden realizar. "
                            + "El if es más adecuado para condiciones complejas, mientras que el switch es útil cuando se necesita comparar una "
                            + "variable con un conjunto de valores específicos.Además puedes usar a tu conveniencia el switch case porque el switch usa break si no lo utilizas hay una posibilidad en la que no termine el case y valla "
                            + "automáticamente al siguiente case sin terminar");
                    System.out.println("2. Describa el funcionamiento de .substring(), equalsIgNoreCase() y .equals() (3%).");
                    System.out.println("R2. substring(): El método substring() se utiliza en cadenas de texto en Java para extraer una porción "
                            + "de la cadena original. Sirve para escribir oraciones sin declararlas sino como método de string en el cual lo podemos leer y cambiar a char o int"
                            + "equalsIgnoreCase(): El método equalsIgnoreCase() se utiliza para comparar dos cadenas de texto, ignorando las diferencias de mayúsculas y minúsculas. "
                            + "Devuelve true si las cadenas son iguales en contenido, sin importar la capitalización de las letras.  "
                            + "equals() se utiliza para comparar dos cadenas de texto y determinar si son idénticas en contenido y capitalización. Devuelve true si las cadenas son iguales tanto en contenido como en capitalización.");
                    System.out.println("3. Defina a que se refiere la concatenación");
                    System.out.println("Concatenar es como brindar el resultado o el registro o resultado donde esta guardo el resultado de un texto,numero o valor acumulado en el,es muy útil ya que podemos concatenar varias veces en la mismo print y incluso unir oraciones "
                            + "o brindar espacios al texto del print y resultados de formulas o resultados");
                    opcion=8;
                    break;
                case 3:
                    System.out.println("Usted ha elegido la opción número 3. Mostrar el historial del menú");
                    System.out.println("El historial es: ");
                    for (int i = 0; i < contador1; i++) {
                        System.out.println("Ejercicio String");
                    }
                    for (int i = 0; i < contador2; i++) {
                        System.out.println("Respuestas a la pregunta");
                    }
                    opcion=8;
                    break;
                case 4:
                    System.out.println("Usted ha elegido la opción número 4. Salir");
                    System.out.println("Saliendo");
                    opcion=0;
                    break;
                default:
                    System.out.println("Deje de estar inventando y eliga la ocpion correcta,porfavor recuerde que las opciones correctas estan entre (1-4)");
                    break; //para terminar los ciclos o los cases
            } 
//* Esto es como un ciclo donde uno tiene diferentes caminos a tomar,
//que son los case, la funcion del swicth es poner la condición como si
//fuera un if, el break sirve para terminar el ciclo (en otras palabras 
//terminar con el caso y no seguir adelante.La condición se pone adentro
// de los parentesis. //*
          }
     }
}

