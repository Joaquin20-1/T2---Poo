package Modelo;
public class TecnicoHardware extends Trabajador
{
  private int cantReparaciones;

    public TecnicoHardware(String cod, String nom, int dni, double sueldobase,int cantReparaciones) 
    {
        super(cod, nom, dni, sueldobase);
        this.cantReparaciones = cantReparaciones;
    }

    public int getCantReparaciones() {
        return cantReparaciones;
    }
    public void setCantReparaciones(int cantReparaciones) {
        this.cantReparaciones = cantReparaciones;
    }
    @Override
    public double calcularBonificacion ()
    {
        return cantReparaciones * 60;
    }
}
