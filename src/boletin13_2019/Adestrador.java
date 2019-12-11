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
public class Adestrador extends Seleccion{
    
    
    
    
   private String idFederacion;

    public Adestrador(String idFederacion, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.idFederacion = idFederacion;
    }

    
    
    
     public void viaxar(){
        
        System.out.println("Viaxa os xogadores ");
        
    }
    
   
    
   
    
    
     public void dirixirPartidos(){
         
     }
     
      public void dirixirAdestamento(){
          
          
      }

  

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Id: " + super.getId() + "\nNombre: " + super.getNome() + "\nApellido: " + super.getApelido() + "\nEdad: " + super.getEdade() +"idFederacion=" + idFederacion ;
    }

      
      
      
      
      
      
}
