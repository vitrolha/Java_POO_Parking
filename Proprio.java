/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author Vítor
 */
public class Proprio extends Carro{
    
    private double valor_compra;
    private String data_compra;
    
    public Proprio(String placa, String ano, String modelo, double valor_compra, String data_compra)
    {
        super(placa, ano, modelo);
        this.valor_compra = valor_compra;
        this.data_compra = data_compra;
    }
    
    //getters

    public double getValor_compra() {
        return valor_compra;
    }

    public String getData_compra() {
        return data_compra;
    }
    
    //setters

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }
    
    @Override
    public boolean oferta(double valor)
    {
        return valor >= valor_compra * 1.1;
    }
    
    @Override
    public void imprimirDados()
    {
        super.imprimirDados();
        System.out.println("Valor Compra: " + valor_compra + "\nData Compra: " + data_compra);
    }
}
