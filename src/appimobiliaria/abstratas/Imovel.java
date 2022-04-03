package appimobiliaria.abstratas;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class Imovel {

    protected static final DecimalFormat df = new DecimalFormat("0.0");

    protected String tipo;
    protected String rua;
    protected String bairro;
    protected String metrosQuadrado;
    protected int codigo;
    protected int numero;
    protected double precoVista;
    protected double precoPrazo;

    protected double taxaIptu = 1.0;

    public double valorIptu() {
        return taxaIptu / 100.0 * this.precoVista;
    }

    public Imovel(int codigo, String tipo, String rua, String bairro, String metrosQuadrado,
           int numero, double precoVista, double precoPrazo) {
        this.tipo = tipo;
        this.rua = rua;
        this.bairro = bairro;
        this.metrosQuadrado = metrosQuadrado;
        this.codigo = codigo;
        this.numero = numero;
        this.precoVista = precoVista;
        this.precoPrazo = precoPrazo;
    }


    public String toString() {
        df.setRoundingMode(RoundingMode.DOWN);


        return "Código: " + this.codigo +
                "\nTipo: " + this.tipo +
                "\nRua: " + this.rua +
                "\nBairro: " + this.bairro +
                "\nNúmero: " + this.numero +
                "\nM²: " + this.metrosQuadrado +
                "\nPreço à vista: " + df.format(this.precoVista) +
                "\nPreço à prazo: " + df.format(this.precoPrazo) +
                "\nIPTU: " + df.format(valorIptu());
    }

}
