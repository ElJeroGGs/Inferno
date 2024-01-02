package modelo;

public class Enemigo {

    private int Defensa;
    private int Ataque;
    private String Nombre;

    public Enemigo(String name){
        this.Nombre = name;
    }

    public void setDefensa(int defensa){
        this.Defensa = defensa;
    }

    public void setAtaque(int ataque){
        this.Ataque = ataque;
    }

    public int getDefensa(){
        return this.Defensa;
    }

    public int getAtaque(){
        return this.Ataque;
    }

    public void getNombre(){
        System.out.println(this.Nombre);
    }

    


}
