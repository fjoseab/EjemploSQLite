package com.example.ejemplosqlite;

public class Comentario {
    //Campos correspondientes a la base de datos
    int id;
    String nombre;
    String comentario;

    //Constructor
    public Comentario(int id,String nombre,String comentario){
        this.id=id;
        this.nombre=nombre;
        this.comentario=comentario;
    }

    //Metodos de acceso a cada atribito de la clase
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getComentario(){
        return comentario;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
