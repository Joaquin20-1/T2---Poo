package Modelo;

public abstract class Trabajador {
   private String cod ;
   private String nom;
   private int  dni;
   private double sueldobase ;

    public Trabajador(String cod, String nom, int dni, double sueldobase) {
        this.cod = cod;
        this.nom = nom;
        this.dni = dni;
        this.sueldobase = sueldobase;
    }
   
   
 
   
}
