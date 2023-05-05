/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamento;

/**
 *
 * @author Vítor
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Proprio p1 = new Proprio("ABC123", "2021", "Golf",50000, "20/04/2023");
        
        p1.imprimirDados();
        p1.venderCarro("Zeca",51000);
        System.out.println("");
        
        p1.imprimirDados();
        System.out.println("");
        
        p1.venderCarro("Jonas",70000);
        p1.imprimirDados();
    }
    
}
