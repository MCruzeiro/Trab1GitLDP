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
public class PortaContentores extends Navio {
    private int numMaxCont;
    
    public PortaContentores(int numMaxCont, String matricula, String nome, float comprimento) {
        super(matricula, nome, comprimento);
        this.numMaxCont = numMaxCont;
    }

    public int getNumMaxCont() {
        return numMaxCont;
    }

    public void setNumMaxCont(int numMaxCont) {
        this.numMaxCont = numMaxCont;
    }
    
}
