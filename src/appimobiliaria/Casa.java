package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

import appimobiliaria.abstratas.ImovelConstruido;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Casa extends ImovelConstruido {
    public static final DecimalFormat df = new DecimalFormat("0.0");
        
    private String qtdOutros;
    private int qtdQuintal;
    private String status = "liberado";

    public Casa(String qtdOutros, int qtdQuintal, int qtdQuartos, int qtdBanheiro,
            int qtdGaragem, int codigo, String tipo, String rua, String bairro,
            String metrosQuadrado, int numero, double precoVista, double precoPrazo) {
        super(qtdQuartos, qtdBanheiro, qtdGaragem, codigo, tipo, rua, bairro,
                metrosQuadrado, numero, precoVista, precoPrazo);
        this.qtdOutros = qtdOutros;
        this.qtdQuintal = qtdQuintal;
    }

    public String getQtdOutros() {
        return qtdOutros;
    }

    public void setQtdOutros(String qtdOutros) {
        this.qtdOutros = qtdOutros;
    }

    public int getQtdQuintal() {
        return qtdQuintal;
    }

    public void setQtdQuintal(int qtdQuintal) {
        this.qtdQuintal = qtdQuintal;
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
               "\nTipo: " + this.getTipo() +
               "\nRua: " + this.getRua() +
               "\nBairro: " + this.getBairro() +
               "\nNúmero: " + this.getNumero() +
               "\nQuantidades de quartos: " + this.getQtdQuartos() +
               "\nQuantidades de banheiros: " + this.getQtdBanheiro() +
               "\nQuantidades de garagens: " + this.getQtdGaragem() +
               "\nQuantidades de quintais: " + this.getQtdQuintal() +
               "\nQuantidades outros: " + this.getQtdOutros() +
               "\nM²: " + this.getMetrosQuadrado() +
               "\nPreço à vista: " + df.format(this.getPrecoVista()) +
               "\nPreço à prazo: " + df.format(this.getPrecoPrazo()) +
               "\nIPTU: " + df.format(valorIptu());
    }
}
