/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Navios;

/**
 *
 * @author migue
 */
public class Petroleiro extends Navio {

    private float capCarga;

    public Petroleiro(float capCarga, String matricula, String nome, float comprimento) {
        super(matricula, nome, comprimento);
        this.capCarga = capCarga;
    }

    public float getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }

}
