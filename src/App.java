import Controllers.MetodoBinario;
import Models.Persona;
import java.util.Scanner;
 
public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("|------------------------------ Métodos de busqueda ------------------------------|");
        System.out.println("");
        System.out.print("Ingrese el tamaño del arreglo: ");
        int t = leer.nextInt();
        System.out.println("");
        while (t <= 0) {
            System.out.println("El tamaño del arreglo debe ser una cantidad positivo y mayor a 0.");
            System.out.println("Ingrese el tamaño del arreglo: ");
            t = leer.nextInt();
            System.out.println("");
        }
        Persona[] personas = new Persona[t];
        for(int i = 0; i <=personas.length - 1; i++){
            System.out.println("Ingrese Persona:");
            System.out.print("\tNombre: ");
            String name = leer.next();
            System.out.print("\tEdad: ");
            int age = leer.nextInt();
            System.out.println("");
            personas [i] = new Persona(age, name);
        }

        MetodoBinario mN = new MetodoBinario(personas);
        System.out.println("Arreglo original:");
        mN.printArray(personas);
        System.out.println("");
        mN.showPersonByAge();
    }
}