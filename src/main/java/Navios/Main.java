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
public class Main {
    public static void main(String[] args) {
        Porto porto = new Porto(5);
        
        Petroleiro p1 = new Petroleiro(10, "XXX", "Ketchup", 20);
        porto.adicionar(p1);
        
        PortaContentores pc1 = new PortaContentores(8, "YYY", "Mostarda", 13);
        PortaContentores pc2 = new PortaContentores(5, "KKK", "Mayonesse", 10);        
        porto.adicionar(pc1);
        porto.adicionar(pc2);
        
        System.out.println("A capacidade total de carga dos navios no porto é de " + porto.capacidadeTotalCarga());
    }
     
}
