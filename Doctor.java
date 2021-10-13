import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Doctor {

    private int IDu;
    private String nombre;
    private String especialidad;

    public Doctor() {
        Scanner ingresar = new Scanner(System.in);
        LinkedHashMap<String, String> datosDoc = new LinkedHashMap<>();
        HashMap<Integer, LinkedHashMap> todoDoc = new HashMap<>();

        System.out.print("Ingresa el nombre del doctor: " );
        nombre = ingresar.nextLine();

        System.out.print("Ingresa la especialidad del doctor: ");
        especialidad = ingresar.nextLine();

        datosDoc.put(nombre, especialidad);

        System.out.print("Ingresa el ID del doctor: " );
        IDu = ingresar.nextInt();
        todoDoc.put(IDu, datosDoc);

        System.out.println();
        System.out.print("Datos del doctor registrado: ");
        System.out.println();
        System.out.println();
        System.out.println(" ID del doctor = { Nombre del doctor = Especialidad }");
        System.out.println(todoDoc);
    }
}
