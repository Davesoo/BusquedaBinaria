package Views;
import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner;
    public ShowConsole(){
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner (){
        System.out.println("|--------------------------------- Método Binario --------------------------------|");        
    }

    public int inputAge(){
        System.out.print("Ingrese la edad de la persona que desea buscar: ");
        int age = scanner.nextInt();
        System.out.println();
        return age;
    }

    public String inputName(){
        System.out.print("Ingrese un nombre: ");
        System.out.println();
        String name = scanner.next();
        return name;
    }

    public void showMessage (String message){
        System.out.println(message);
    }
}
