import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Empleado e1 = null;
        int indice = 0;
        Scanner sc = new Scanner(System.in);
        double salario;
        int opc;
        do {
            System.out.println("1.- Ingresar Empleado");
            System.out.println("2.- Cambiar salario");
            System.out.println("3.- Calcular edad");
            System.out.println("4.- Calcular antiguedad");
            System.out.println("5.- Calcular prestaciones");
            System.out.println("6.- Mostrar empleado");
            System.out.println("7.- Auxilio educativo");
            System.out.println("8.- Porcentaje");
            System.out.println("9.- Diferencia Salarial");
            System.out.println("10.- Bonificaciones");
            System.out.println("11.- Salir");
            System.out.print("\nIngrese una opción: ");
            opc = Integer.parseInt(sc.next());

            switch (opc) {
                case 1:
                    System.out.println("Ingreso del empleado " + indice + "1");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = sc.next();
                    System.out.print("Ingrese el genero 1 Masculino, 0 Femenino: ");
                    boolean genero;
                    if (Integer.parseInt(sc.next()) == 1) {
                        genero = true;
                    } else {
                        genero = false;
                    }

                    System.out.print("Ingrese el dia de nacimiento: ");
                    int dia = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el mes de nacimiento: ");
                    int mes = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el anio de nacimiento: ");
                    int anio = Integer.parseInt(sc.next());
                    Fecha fn = new Fecha(dia, mes, anio);
                    System.out.print("Ingrese el dia de ingreso: ");
                    dia = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el mes de ingreso: ");
                    mes = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el anio de ingreso: ");
                    anio = Integer.parseInt(sc.next());
                    Fecha fi = new Fecha(dia, mes, anio);
                    System.out.print("Ingrese el salario: ");
                    salario = Double.parseDouble(sc.next());
                    System.out.print("Ingrese el numero de hijos: ");
                    int numHijos = sc.nextInt();
                    System.out.print("Ingrese el numero de las personas a cargo: ");
                    int personasCargo = sc.nextInt();
                    e1 = new Empleado(nombre, apellido, genero, fn, fi, salario, numHijos, personasCargo);
                    break;
                case 2:
                    System.out.print("Ingrese el salario: ");
                    salario = Double.parseDouble(sc.next());
                    e1.cambiarSalario(salario);
                    break;
                case 3:

                    System.out.println("La edad de " + e1.darNombre() + " " + e1.darApellido() + " es " + e1.calcularEdad());
                    break;
                case 4:

                    System.out.println("La antiguedad de " + e1.darNombre() + " " + e1.darApellido() + " es " + e1.calcularAntiguedad());
                    break;
                case 5:

                    System.out.println("Las prestaciones de " + e1.darNombre() + " " + e1.darApellido() + " es " + e1.calcularPrestaciones());
                    break;
                case 6:
                    System.out.println(e1);
                    break;
                case 7:

                    System.out.println("El auxilio educativo de " + e1.darNombre() +"_"+ e1.darApellido() + "  teniendo " + e1.darNumhijos() + " hijos es de: " + e1.calcularAuxilio());
                    break;
                case 8:
                    System.out.println("Exprese el porcentaje de auxilio educativo ");
                    double porcentaje = (double)sc.nextInt();

                    System.out.println("El porcentaje de auxilio educativo de " + e1.darNombre() +"_"+ e1.darApellido() + " teniendo " + e1.darNumhijos() + " hijos es de: " + e1.auxilioEmpleado(porcentaje));
                    break;
                case 9:
                    Empleado e2 = new Empleado(" Anthonny ", " Mosquera ", true, new Fecha(31, 3, 2004), new Fecha(10, 6, 2014), 508.0, 2, 20);

                    System.out.println("La diferencia salarial entre: " + e1.darNombre() +"_"+ e1.darApellido() + "  y  " + e2.darNombre() + e2.darApellido() + "  es de  " + e1.calcularDiferenciaSalarial(e2));
                    break;
                case 10:

                    System.out.println("La bonificacion de  " + e1.darNombre() +"_"+ e1.darApellido() + "  es  " + e1.calcularBonificacion());
                    break;
                case 11:
                    System.out.println("Gracias!");
                    break;
                default:
                    System.out.println("opción no válida");
            }
        } while(opc != 11);

    }
}
