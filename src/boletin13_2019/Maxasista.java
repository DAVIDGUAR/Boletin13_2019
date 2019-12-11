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
public class Maxasista extends Seleccion{
    
   
    
   private String titulacion,anosExperiencia;

    public Maxasista(String titulacion, String anosExperiencia, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(String anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    
    
    
    
    

    public void viaxar(){
        
        System.out.println("Viaxa os xogadores ");
        
    }

    @Override
    public String toString() {
         return "Id: " + super.getId() + "\nNombre: " + super.getNome() + "\nApellido: " + super.getApelido() + "\nEdad: " + super.getEdade() +"titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia ;
    }
    
    
    
    
    
    
}
