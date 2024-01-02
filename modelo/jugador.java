package modelo;
public class jugador{

    private String nombre;
    private int salud;
    private int defensa;
    private int ataque;

    public jugador(String name){
        this.nombre = name;
    }

    public void setSalud(int salud){
        this.salud = salud;
    }

    public void setDefensa(int defensa){
        this.defensa = defensa;
    }

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public int getSalud(){
        return this.salud;
    }

    public int getDefensa(){
        return this.defensa;
    }

    public int getAtaque(){
        return this.ataque;
    }

    public void getNombre(){
        System.out.println(this.nombre);
    }

}