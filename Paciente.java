import java.util.HashMap;
import java.util.Scanner;

public class Paciente {

    private int IDu;
    private String nombre;

    public Paciente() {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> datosPac = new HashMap<>();

        System.out.print("Ingresa el nombre del paciente: ");
        nombre = sc.nextLine();

        System.out.print("Ingresa el ID único del paciente: " );
        IDu = sc.nextInt();

        datosPac.put(IDu, nombre);
        System.out.println();
        System.out.print("Datos del paciente registrado: ");
        System.out.println();
        System.out.println();
        System.out.println("{ ID del paciente = Nombre del paciente }");
        System.out.println(datosPac);
    }
}
