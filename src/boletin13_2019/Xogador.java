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
public class Xogador extends Seleccion {

   private int dorsal;
    private String demarcacion;

    public Xogador(int dorsal, String demarcacion, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void viaxar() {

        System.out.println("Viaxa os xogadores ");

    }

    public void xogarPartidos() {

    }

    public void entrenar() {

    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {

        return "Id: " + super.getId() + "\nNombre: " + super.getNome() + "\nApellido: " + super.getApelido() + "\nEdad: " + super.getEdade() + "\n Dorsal: " + dorsal + "\nDemarcacion: " + demarcacion;
    }

}
