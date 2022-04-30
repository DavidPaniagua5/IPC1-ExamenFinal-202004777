package Final;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int menu = 0;
    
    public static void main(String[] args) {
        
        System.out.println("***********************");
        System.out.println("* 1. Numero mayor     *");
        System.out.println("* 2. Piramide         *");
        System.out.println("* 3. Vacas            *");
        System.out.println("***********************");
        menu = scanner.nextInt();
        
        switch (menu){
            case 1:
                Mayor();
                break;
            case 2:
                Piramide();
                break;
            case 3:
                break;
        }
    }

    public static void Mayor() {
        int num1,num2 = 0;
        System.out.println("Ingrese un numero:");
        num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero :");
        num2 = scanner.nextInt();
        
        if(num1<num2){
            System.out.println("El numero mayor es: " + num2);
        }else{
            System.out.println("El numero mayor es: " + num1);
        }
    }

    public static void Piramide() {
        
    }
    
}
