package Modelo;
public abstract class Trabajador {
   private String cod ,nom ;
   private int  dni;
   private double sueldobase ;
    public Trabajador(String cod, String nom, int dni, double sueldobase) {
        this.cod = cod;
        this.nom = nom;
        this.dni = dni;
        this.sueldobase = sueldobase;
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public double getSueldobase() {
        return sueldobase;
    }
    public void setSueldobase(double sueldobase) {
        this.sueldobase = sueldobase;
    }
   public abstract double calcularBonificacion();
   public double calcularSueldoTotal()
   {
       return sueldobase + calcularBonificacion();
   }
}
