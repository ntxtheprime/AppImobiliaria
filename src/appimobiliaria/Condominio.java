package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Condominio {
    public static final DecimalFormat df = new DecimalFormat("0.0");
    
    private String nome;
    private String tipo;
    private String rua;
    private String bairro;
    private int numero;
    private double valorCondominio;

    public Condominio(String nome, String tipo, String rua, String bairro,
            int numero, double valorCondominio) {
        this.nome = nome;
        this.tipo = tipo;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.valorCondominio = valorCondominio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
    
    public String toString() {
        df.setRoundingMode(RoundingMode.DOWN);
        return "\nNome: " + this.getNome() +
               "\nTipo: " + this.getTipo() + 
               "\nRua: " + this.getRua() +
               "\nBairro: " + this.getBairro() +
               "\nNúmero: " + this.getNumero() +
               "\nValor: " + this.getValorCondominio();
    }
    
}
