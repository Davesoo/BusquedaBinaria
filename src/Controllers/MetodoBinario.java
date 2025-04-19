package Controllers;
import Models.Persona;
import Views.ShowConsole;

public class MetodoBinario {
    private ShowConsole mostrar; 
    private Persona [] people;


    public MetodoBinario(Persona[] people){
        mostrar = new ShowConsole();
        this.people = people;
    }

    private int findPersonByAge(int age){
        int bajo = 0;
        int alto = people.length-1;
        while (alto >= bajo) {
            int central = (alto+bajo)/2;
            if (people[central].getAge()==age){
                Array(people);
                System.out.print("Bajo = "+bajo);
                System.out.print("   Centro = "+central);
                System.out.println("   Alto = "+alto);
                System.out.print("   Valor Centro = "+people[central].getAge());
                System.out.println("   --> ENCONTRADO");
                System.out.println();
                return central;
            }
            if (people[central].getAge()>age){
                Array(people);
                System.out.print("Bajo = "+bajo);
                System.out.print("   Centro = "+central);
                System.out.println("   Alto = "+alto);
                System.out.print("   Valor Centro = "+people[central].getAge());
                System.out.println("   --> IZQUIERDA");
                alto = central - 1;
                System.out.println();
            }else{
                Array(people);
                System.out.print("Bajo = "+bajo);
                System.out.print("   Centro = "+central);
                System.out.println("   Alto = "+alto);
                System.out.print("   Valor Centro = "+people[central].getAge());
                System.out.println("   --> DERECHA");
                bajo = central +1;
                System.out.println();
            }
        }
        return -1;
    }

    public void showPersonByAge(){
        ordenamiento(people);
        System.out.println("Arreglo ordenado de forma ascendente por método de burbuja:");
        printArray(people);
        System.out.println("");
        int ageToFind = mostrar.inputAge();
        int indexPerson = findPersonByAge(ageToFind);
        if (indexPerson >= 0){
            mostrar.showMessage("Persona con edad de "+ageToFind+" y de nombre "+people[indexPerson].getName()+" encontrada en la posición "+indexPerson+ " -> "+people[indexPerson].toString());
        }else{
            mostrar.showMessage("Personsa no encontrada.");
        }
    }

    public static void ordenamiento(Persona [] people){
        for (int i = 0; i < people.length - 1; i++){
            for (int j = 0; j < people.length - 1; j++){
                if (people[j].getAge() > people[j + 1].getAge()) {
                    Persona temp = people[j];
                    people [j] = people [j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    public void showPersonByName(){
        String nametoFind = mostrar.inputName();
        int indexName = findPersonByName(nametoFind);
        if (indexName <= 0){
            mostrar.showMessage("Persona con nombre "+nametoFind+" encontrada en la posición "+indexName+ " -> "+people[indexName].toString());
        }else{
            mostrar.showMessage("Personsa no encontrada.");
        }
    }

    public void printArray (Persona[] people){
        for (int i = 0; i < people.length; i++){
            System.out.print(people[i] + " ");
        }
        System.out.println();
    }
    public void Array (Persona[] people){
        for (int i = 0; i < people.length; i++){
            System.out.print(people[i].getAge() + " ");
        }
        System.out.println();
    }

    private int findPersonByName(String name){
        ordenamiento(people);
        printArray(people);
        int bajo = 0;
        int alto = people.length-1;
        while (alto >= bajo) {
            int central = (alto+bajo)/2;
            if (people[central].getName().equalsIgnoreCase(name)){
                return central;
            }
            if (people[central].getName().compareTo(name)>0){
                alto = central - 1;
            }else{
                bajo = central +1;
            }
        }
        return -1;
    }
}
