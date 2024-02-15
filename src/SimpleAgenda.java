import java.util.Scanner;

public class SimpleAgenda {
    public static void main(String[] args) {

    }

    public static void agregarContacto(){
        String contacto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un contacto a agregar");
        contacto = sc.next();

        if (contacto.length() >= 8 && contacto.length() <= 30 ){
            System.out.println("Contacto agregado con éxito.");
        }
        else {
            System.out.println("El nombre es muy largo.");
        }

    }

    public static void removerContacto (int id){
        if (id >= 1000 && id <= 9999){
            System.out.println("Verificando contacto a eliminar...");
        }
        else {
            System.out.println("ID inválido.");
        }

    }

    public static String actualizarContacto (int posicion){
        return "Posicion de contacto es";

    }

    public void mostrarContactos(){
        System.out.println("Mostrando contactos...");

    }
}


