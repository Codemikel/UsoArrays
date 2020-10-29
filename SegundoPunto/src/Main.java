import java.util.*;


public class Main {

    private static final ArrayList<Owner> owners = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String... args) {
        readPetOwners();
        if (owners.size() > 0) {
            //se muestran todas las personas introducidas
            System.out.println("\nPersonas introducidas: ");
            mostrar();
        }
    }

    private static void mostrar() {
        for (int i = 0; i < owners.size(); i++) {
            System.out.println(Main.owners.get(i));
        }
    }

    private static void readPetOwners() {
        int petListSize;

        do {
            System.out.println("Número de Dueños de mascotas ");
            petListSize = sc.nextInt();
        } while (petListSize < 0);

        sc.nextLine();

        for (int i = 0; i < petListSize; i++) {
            System.out.print("Nombre del dueño: ");
            String personName = sc.nextLine();
            System.out.println("Dirección");
            String address = sc.nextLine();
            System.out.println("Día de nacimiento");
            int day = sc.nextInt();
            System.out.println("Mes de nacimiento");
            int month = sc.nextInt();
            System.out.println("Año de nacimiento");
            int year = sc.nextInt();
            Date date = new GregorianCalendar(year, month - 1, day).getTime();
            System.out.println("Ciudad: ");
            sc.nextLine();
            String city = sc.nextLine();
            System.out.println("Teléfono: ");
            long phone = sc.nextLong();
            System.out.println("Email: ");
            sc.nextLine();
            String email = sc.nextLine();
            System.out.println("Cédula: ");
            long DNI = sc.nextLong();

            sc.nextLine();
            System.out.print("Nombre de la mascota: ");
            String petName = sc.nextLine();
            System.out.print("Edad de la mascota: ");
            int petAge = sc.nextInt();
            System.out.print("Sexo de la mascota: ");
            sc.nextLine();
            String petSex = sc.nextLine();
            System.out.print("Tipo de animal: ");
            String petType = sc.nextLine();
            System.out.print("Tamaño de la mascota: ");
            String petSize = sc.nextLine();
            System.out.print("Raza de la mascota: ");
            String petBreed = sc.nextLine();
            System.out.print("Está vacunada la mascota: ");
            Boolean petVaccines = sc.nextBoolean();
            System.out.print("Está discapacitada la mascota: ");
            Boolean petDisability = sc.nextBoolean();

            Pet pet = new Pet(i, petName, petAge, petSex, petType, petSize, petBreed, petVaccines, petDisability);

            owners.add(new Owner(personName, address, city, date, phone, email, DNI, pet));
        }
    }
}
