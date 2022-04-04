package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

import appimobiliaria.abstratas.Imovel;

import java.text.DecimalFormat;

public class Terreno extends Imovel {
    public static final DecimalFormat df = new DecimalFormat("0.0");

    private String aterro;

    public Terreno(String aterro, int codigo, String tipo,
                   String rua, String bairro, String metrosQuadrado, int numero,
                   double precoVista, double precoPrazo) {
        super(codigo, tipo, rua, bairro, metrosQuadrado, numero, precoVista,
                precoPrazo);
        this.aterro = aterro;
        this.taxaIptu = 1.0;
    }


    @Override
    public String toString() {

        return super.toString() + // super.toString() retorna o toString() da superclasse.
                "\nAterro: " + this.aterro;
    }
}
