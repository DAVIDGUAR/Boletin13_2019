/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_2019;

/**
 *
 * @author david
 */
 public class Seleccion {
    
    int id,edade;
    String nome,apelido;

    public Seleccion(int id, int edade, String nome, String apelido) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apelido = apelido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Seleccion{" + "id=" + id + ", edade=" + edade + ", nome=" + nome + ", apelido=" + apelido + '}';
    }

  

  

  
    
    public void concentrarse(){
        
        System.out.println("Concentrase a seleccion ");  
        
    }
    
     public  void viaxar(){
         
         System.out.println("Viaxa a selección ");
        
    }
     
     public void prueba(){
         
         System.out.println("SI, Podes invocar a un método da superclase con un obxecto dunha subclase ");
         
     }
    
    
}
