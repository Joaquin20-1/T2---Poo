package Modelo;
import java.util.HashSet;
import java.util.Set;
public class TecnicoSoftware extends Trabajador 
{
    private int cantinstalaciones ;

    public TecnicoSoftware(String cod, String nom, int dni, double sueldobase,int cantinstalaciones) 
    {
        super(cod, nom, dni, sueldobase);
        this.cantinstalaciones = cantinstalaciones;
    }

    public int getCantinstalaciones() {
        return cantinstalaciones;
    }
    public void setCantinstalaciones(int cantinstalaciones) {
        this.cantinstalaciones = cantinstalaciones;
    }
    @Override
    public double calcularBonificacion()
    {
        return cantinstalaciones * 45;
    }
}
