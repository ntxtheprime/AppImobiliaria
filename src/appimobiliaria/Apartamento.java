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
    private String status = "liberado";


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


    public boolean residirStatus() {
        if (status.equals("impedido")) {
            return false; //Não é possível residir no imóvel!
        }

        return true;
    }


    public void imprimeResidirStatus() {
        boolean sucesso = residirStatus();
        if (sucesso) System.out.println("Status: Já é possível residir no imóvel!");
        else System.out.println("Status: Não é possível residir no imóvel!");
    }

    @Override
    public String toString() {

        return  "\nCondomínio: " + this.condominio + 
                "\nBloco: " + this.bloco +
                "\nApartamento: " + this.numeroApartamento +
                super.toString(); // super.toString() retorna o toString() da superclasse.
    }
}
