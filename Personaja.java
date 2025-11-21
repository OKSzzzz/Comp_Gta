import java.util.Scanner;

public class Personaja {
 private String nom;
 private int dinero;
 public Personaja(String nom, int dinero) {
 this.nom = nom;
 this.dinero = dinero;
 }
 public void mostrarInfo() {
 System.out.println(nom + " tiene " + dinero + "$.");
 }
 public static void main(String[] args) {
 Personaja jugador = new Personaja("Franklin", 500);
jugador.mostrarInfo();
jugador.ganarDinero(null);
 }

 public void ganarDinero (String nom){
    nom = "Franklin";
    Scanner ganardinero = new Scanner(System.in);
    System.out.println("Dime cuantas misiones has completado hoy");
    int pregunta = ganardinero.nextInt();
    if (pregunta > 0 || pregunta <= 10) {
        int dineroganado = (int)(Math.random() * (10000 - 100 +1)) + 100;
        System.out.println("Buenas " +nom+ " hoy has ganado un total de: " +dineroganado+ "$");
        System.out.println("Espera hasta mañana para obtener mas misiones");

        
    }
    else {
        System.out.println("Si no has hecho ninguna muy mal o si me mientes con el dato tambien");
    }
 }
}
//¿Qué comando se usa para cambiar de rama? El comando branch

// ¿A que sirve de hacer la nueva funcionalidad en una nueva rama antes de fusionar? 
//Para no modificar ninguna rama importante como el main sin tener idea de si funciona nuestro apartado o no.

//¿Qué comando se usa para fusionar dos ramas?
//Usamos el comando merge dentro de la rama y despues ponemos el nombre de la rama que queremos traer

//¿Por qué podemos eliminar la rama después de la fusión?
//Porque ya no nos hace falta debido a que tenemos todo en el main

