package modelo;

public abstract class Objeto {

    String tipo;
    String nombre;


    public String getTipo(){
       return this.tipo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}
