public class Empleado {
    private String nombre;
    private String apellido;
    private boolean genero;
    private Fecha fechaNacimiento;
    private Fecha fechaIngreso;
    private double salario;
    private int numhijos;
    private double porcentauxilio;
    private int personasCargo;

    public Empleado() {
        this.nombre = "Juan";
        this.apellido = "Piguave";
        this.genero = true;
        this.fechaNacimiento = new Fecha(16, 6, 1982);
        this.fechaIngreso = new Fecha(5, 4, 2000);
        this.salario = 2500.0;
        this.numhijos = 5;
        this.personasCargo = 3;
    }

    public Empleado(String nombre, String apellido, boolean genero, Fecha fechaNacimiento, Fecha fechaIngreso, double salario, int numhijos, int personasCargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numhijos = numhijos;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.personasCargo = personasCargo;
    }

    public String darNombre() {
        return this.nombre;
    }

    public boolean darGenero() {
        return this.genero;
    }

    public String darFechaNacimiento() {
        String strFecha = this.fechaNacimiento.toString();
        return strFecha;
    }

    public String darFechaIngreso() {
        String strFecha = this.fechaIngreso.toString();
        return strFecha;
    }

    public double darSalario() {
        return this.salario;
    }

    public String darApellido() {
        return this.apellido;
    }

    public int darNumhijos() {
        return this.numhijos;
    }

    public void establecerpersonasCargo(int personasCargo) {
        this.personasCargo = personasCargo;
    }

    public int darpersonasCargo() {
        return this.personasCargo;
    }

    public double calcularAuxilio() {
        double auxilio = this.salario * 0.05 * (double)this.numhijos;
        return auxilio;
    }

    public double auxilioEmpleado(double porcentaje) {
        double auxilioEmpleado = this.salario * porcentaje * (double)this.numhijos;
        return auxilioEmpleado;
    }

    public double calcularBonificacion() {
        double bonificacion = this.salario * 0.7 * (double)this.personasCargo;
        return bonificacion;
    }

    public double calcularDiferenciaSalarial(Empleado otroEmpleado) {
        return this.salario - otroEmpleado.salario;
    }

    public int calcularEdad() {
        Fecha hoy = new Fecha(0, 0, 0);
        hoy.darFechaActual();
        int edad = this.fechaNacimiento.darDiferenciaEnMeses(hoy) / 12;
        return edad;
    }

    public int calcularAntiguedad() {
        Fecha hoy = new Fecha(0, 0, 0);
        hoy.darFechaActual();
        int antiguedad = this.fechaIngreso.darDiferenciaEnMeses(hoy) / 12;
        return antiguedad;
    }

    public double calcularPrestaciones() {
        int antiguedad = this.calcularAntiguedad();
        double bonificacion = this.calcularBonificacion();
        double prestaciones = (double)antiguedad * this.salario / 12.0 + bonificacion;
        return prestaciones;
    }




    public void cambiarSalario(double pSalario) {
        this.salario = pSalario;
    }



    public String toString() {

        String s = "Nombre completo: " + this.nombre + " " + this.apellido + "\nGenero: " + (this.darGenero() ? "masculino" : "femenino") + "\nFecha de Nacimiento: " + String.valueOf(this.fechaNacimiento) + "\nFecha de Ingreso: " + String.valueOf(this.fechaIngreso) + "\nSalario: " + this.salario + "\nNumero de hijos: " + this.numhijos + "\npersonas a cargo: " + this.personasCargo;
        return s;
    }
}
