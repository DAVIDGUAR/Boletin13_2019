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
public class Boletin13_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Xogador xogador1 = new Xogador(1, "Portero", 01, 25,"Pau", "Lopez");
        Adestrador adestrador1 = new Adestrador("E01", 91, 54, "Juan", "Aragones");
        Maxasista maxasista1 = new Maxasista("Carrera fisioterapeuta", "15",80, 38,"Pedro", "Vila");
        Seleccion xogador2 = new Xogador(2, "Defensa",05, 22, "Paco", "Lopez");
        Seleccion prueba1 = new Seleccion(00, 0, "a", "b");
        
        System.out.println("Chama ao método concentrarse a través de cada obxecto.");
        xogador1.concentrarse();
        adestrador1.concentrarse();
        maxasista1.concentrarse();
        xogador2.concentrarse();
        
        System.out.println("Invoca ao método viaxar a través de cada obxecto.");
        
        xogador1.viaxar();
        adestrador1.viaxar();
        maxasista1.viaxar();
        xogador2.viaxar();
        
        xogador1.prueba();
        
        
        System.out.println("NON, non podes invocar a un método da subclase con un obxecto do tipo da superclase");
        
    }
    
}
