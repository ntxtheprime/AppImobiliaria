package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

import appimobiliaria.abstratas.ImovelConstruido;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Apartamento extends ImovelConstruido {


    private Condominio condominio;
    private String bloco;
    private int numeroApartamento;


    public Apartamento(Condominio condominio, String bloco, int numeroApartamento,
                       int qtdQuartos, int qtdBanheiro, int qtdGaragem, int codigo,
                       String tipo, String rua, String bairro, String metrosQuadrado,
                       int numero, double precoVista, double precoPrazo) {
        super(qtdQuartos, qtdBanheiro, qtdGaragem, codigo, tipo, rua,
                bairro, metrosQuadrado, numero, precoVista, precoPrazo);
        this.condominio = condominio;
        this.bloco = bloco;
        this.numeroApartamento = numeroApartamento;
        this.taxaIptu = 2.0;
    }

    

    @Override
    public String toString() {

        return  "\nCondomínio: " + this.condominio + 
                "\nBloco: " + this.bloco +
                "\nApartamento: " + this.numeroApartamento +
                super.toString(); // super.toString() retorna o toString() da superclasse.
    }
}
