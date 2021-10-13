import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Hospital {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("1. Menú de doctores.");
        System.out.println("2. Menú de pacientes");
        System.out.println("3. Menú de citas");
        System.out.println("4. Terminar ejecución.");
        System.out.println("");
        int opcion = escaner.nextInt();

        System.out.println();

        while (opcion != 4) {

            switch (opcion) {

                case 1:
                    System.out.println("MENÚ DE DOCTORES");
                    System.out.println();
                    new Doctor();
                    break;

                case 2:
                    System.out.println("MENÚ DE PACIENTES");
                    System.out.println();
                    new Paciente();
                    break;

                case 3:
                    System.out.println("MENÚ DE PACIENTES");
                    System.out.println();
                    new Citas();
                    break;

                case 4:

                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
