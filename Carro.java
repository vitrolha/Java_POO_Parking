/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author Vítor
 */
public class Carro {
    
    private String placa, ano, modelo, vendedor;
    private boolean disp;
            
    public Carro(String placa, String ano, String modelo)
    {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        disp = true;
        vendedor = "";
    }
    
    //getters

    public String getPlaca() {
        return placa;
    }

    public String getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isDisp() {
        return disp;
    }
    
    
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //setters
    public void setDisp(boolean disp) {
        this.disp = disp;
    }

    public boolean disponivel()
    {
        return disp;
    }
    
    public boolean oferta(double valor)
    {
        return false;
    }
    
    public boolean venderCarro(String vendedor, double valorVenda)
    {
        if(!disp)return false;
        if(!oferta(valorVenda))return false;
        disp = false;
        this.vendedor = vendedor;
        return true;
    }
        
    public void imprimirDados()
    {
        System.out.println("Placa: " + placa + "\nAno: " + ano + "\nModelo: " + modelo 
        + "\nDisponivel?: " + (disp?"Sim":"Nao"));
        if(!disp)System.out.println("Vendedor: " + vendedor);
    }
    
}
