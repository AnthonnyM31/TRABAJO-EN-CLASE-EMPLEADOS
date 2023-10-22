import java.util.GregorianCalendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int pDia, int pMes, int pAnio) {
        this.dia = pDia;
        this.mes = pMes;
        this.anio = pAnio;
    }

    public int darDia() {
        return this.dia;
    }

    public int darMes() {
        return this.mes;
    }

    public int darAnio() {
        return this.anio;
    }

    public int darDiferenciaEnMeses(Fecha pFecha) {
        boolean diferenciaa = false;
        int otroAnho = pFecha.darAnio();
        int otroMes = pFecha.darMes();
        int otroDia = pFecha.darDia();
        int diferencia = 12 * (otroAnho - this.anio) + (otroMes - this.mes);
        if (otroDia < this.dia) {
            --diferencia;
        }

        return diferencia;
    }

    public void darFechaActual() {
        GregorianCalendar gc = new GregorianCalendar();
        this.dia = gc.get(5);
        this.mes = gc.get(2) + 1;
        this.anio = gc.get(1);
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }
}
