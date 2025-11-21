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
 Personaja jugador = new Personaja("Trevor", 500);
 jugador.mostrarInfo();
 jugador.ganarDinero(null);
 }

 public void ganarDinero (String nom){
    nom = "Trevor";
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

