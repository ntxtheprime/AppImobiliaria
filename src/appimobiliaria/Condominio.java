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
   
    public String toString() {
        df.setRoundingMode(RoundingMode.DOWN);
        
        return "\nNome: " + this.nome +
               "\nTipo: " + this.tipo + 
               "\nRua: " + this.rua +
               "\nBairro: " + this.bairro +
               "\nNúmero: " + this.numero +
               "\nValor: " + this.valorCondominio;
    }
    
}
