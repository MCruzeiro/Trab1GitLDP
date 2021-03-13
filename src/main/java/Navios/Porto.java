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
public class Porto {

    private int numMaxNavios;
    int numNavios = 0;
    Navio[] navios;

    public Porto(int numNavios) {
        this.numMaxNavios = numMaxNavios;
        this.navios = new Navio[numMaxNavios];
    }

    public boolean adicionar(Navio n) {
        if (numNavios == numMaxNavios) {
            return false;
        } else {
            for (int i = 0; i < numNavios; i++) {
                if (navios[i].getMatricula().equals(n.getMatricula())) {
                    return false;
                }
            }
            navios[numNavios] = n;
            numNavios = numNavios + 1;
            return true;
        }
    }

    public float capacidadeTotalCarga() {
        float resultado = 0;
        for (int i = 0; i < numNavios; i++) {
            if (navios[i].getClass() == PortaContentores.class) {
                PortaContentores n = (PortaContentores) navios[i];
                resultado = resultado + n.getNumMaxCont() * 10;
            } else if (navios[i].getClass() == Petroleiro.class) {
                Petroleiro n = (Petroleiro) navios[i];
                resultado = resultado + n.getCapCarga();
            }
        }
        return resultado;
    }

}

