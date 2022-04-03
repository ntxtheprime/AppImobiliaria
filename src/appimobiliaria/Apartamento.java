package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Apartamento extends ImovelConstruido {
    public static final DecimalFormat df = new DecimalFormat("0.0");
    
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
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }
    
    public double valorIptu() {
        return 2.0 / 100.0 * this.getPrecoVista();
    }
      
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean residirStatus(){
        if (status.equals("impedido")){
            return false; //Não é possível residir no imóvel!
        }
        
        return true;
    }
        
    public void imprimeResidirStatus() {
        boolean sucesso = residirStatus();
        if(sucesso)System.out.println("Status: Já é possível residir no imóvel!");
        else System.out.println("Status: Não é possível residir no imóvel!");
    }    
    
    public String toString() {
        df.setRoundingMode(RoundingMode.DOWN);
        return "Código: " + this.getCodigo() +
               "\nCondomínio: " + this.getCondominio() +
               "\nBloco: " + this.getBloco() +
               "\nApartamento: " + this.getNumeroApartamento() +
               "\nTipo: " + this.getTipo() +
               "\nRua: " + this.getRua() +
               "\nBairro: " + this.getBairro() +
               "\nNúmero: " + this.getNumero() +
               "\nQuantidades de quartos: " + this.getQtdQuartos() +
               "\nQuantidades de banheiros: " + this.getQtdBanheiro() +
               "\nQuantidades de garagens: " + this.getQtdGaragem() +
               "\nM²: " + this.getMetrosQuadrado() +
               "\nPreço à vista: " + df.format(this.getPrecoVista()) +
               "\nPreço à prazo: " + df.format(this.getPrecoPrazo()) +
               "\nIPTU: " + df.format(valorIptu());
    }
}
