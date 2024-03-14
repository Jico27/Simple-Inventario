import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class SimpleAgenda {
    public static String[] contactos = new String [10];
    public static File archivoAgenda = new File("contactos.txt");

    public static void main(String[] args) throws IOException {
        contactos[0] = "Pepe";
        contactos[1] = "Juan";
        contactos[2] = "Pablo";

        mostrarContactos();

    }

    public static void agregarContacto(){
        String contacto;
        boolean existe = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un contacto a agregar.");
        contacto = sc.nextLine();

        for (String s : contactos) {
            if (s != null && s.equals(contacto)) {
                existe = true;
                break;
            }
        }

        if(!existe){
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null){
                    contactos[i] = contacto;
                    System.out.println("Contacto de " + contacto + " agregado satisfactoriamente");
                    break;
                }
            }
        }
        else System.out.println("Este contacto ya existe.");
    }

    public static void removerContacto (){
        String contacto;
        boolean existe = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qué contacto desea eliminar?");
        contacto = sc.nextLine();

        for (String s : contactos) {
            if (s != null && s.equals(contacto)) {
                existe = true;
                break;
            }
        }
        if (existe) {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null && contactos[i].equals(contacto)){
                    contactos[i] = null;
                    System.out.println("El contacto " + contacto + " fue removido exitosamente!");
                    break;
                }
            }
        }
        else System.out.println("No existe tal contacto");
    }

    public static String actualizarContacto (int posicion){
        return "Posicion de contacto es";

    }

    public static void mostrarContactos() throws FileNotFoundException {
        Scanner sc = new Scanner(archivoAgenda);
        System.out.println("Mostrando contactos...");
        while (sc.hasNextLine()){
            String linea = sc.nextLine();
            if (!linea.startsWith("contacto")) System.out.println(linea);
        }

    }

    public static void mostrarContacto() throws FileNotFoundException {
        String contacto;
        boolean existe = false;
        Scanner scArchivo = new Scanner(archivoAgenda);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre a consultar");
        contacto = sc.nextLine();

        while (scArchivo.hasNextLine()){
            String linea = scArchivo.nextLine();
            if (linea.startsWith(contacto)){
                existe = true;
                break;
            }
        }
        if (existe){
            System.out.println("El contacto " + contacto + " existe");
        }
        else System.out.println("No existen registros de este contacto");

    }
    public static void generarArchivo () throws IOException {

        archivoAgenda.createNewFile();
        FileWriter writer = new FileWriter(archivoAgenda);
        writer.write("contacto,telefono\n" +

                "Adan,8098551212\n" +

                "Enmanuel,8294118787\n" +

                "Raider,8097410032\n" +

                "Roger,8095554141\n" );
        writer.close();
    }
}


