import java.util.Scanner;

public class SimpleAgenda {
    public static String[] contactos = new String [10];

    public static void main(String[] args) {
        contactos[0] = "Pepe";
        contactos[1] = "Juan";
        contactos[2] = "Pablo";

        agregarContacto();

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

    public static void mostrarContactos(){
        System.out.println("Mostrando contactos...");
        for (String contacto : contactos) {
            if (contacto != null) {
                System.out.println(contacto);
            }
        }
    }

    public static void mostrarContacto(){
        String contacto;
        boolean existe = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir el contacto a mostrar");
        contacto = sc.nextLine();

        for (String s : contactos) {
            if (s != null && s.equals(contacto)) {
                existe = true;
                break;
            }
        }

        if (existe){
            System.out.println("El contacto " + contacto + " existe");
        }
        else System.out.println("No existen registros del contacto " + contacto);

    }
}


