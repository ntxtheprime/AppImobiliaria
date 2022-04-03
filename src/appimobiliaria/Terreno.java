package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Terreno extends Imovel {
    public static final DecimalFormat df = new DecimalFormat("0.0");
    
    private String aterro;
    private String status = "liberado";

    public Terreno(String aterro, int codigo, String tipo,
            String rua, String bairro, String metrosQuadrado, int numero,
            double precoVista, double precoPrazo) {
        super(codigo, tipo, rua, bairro, metrosQuadrado, numero, precoVista,
                precoPrazo);
        this.aterro = aterro;
    }

    public String getAterro() {
        return aterro;
    }

    public void setAterro(String aterro) {
        this.aterro = aterro;
    }
    
    public double valorIptu() {
        return 1.0 / 100.0 * this.getPrecoVista();
    }
    
    public boolean construcaoStatus(){
        if (status.equals("impedido")){
            return false; //Não está liberado para construção! 
        }
        
        return true;
    }
    
        public void imprimeConstrucaoStatus() {
        boolean sucesso = construcaoStatus();
        if(sucesso)System.out.println("Está liberado para construção!");
        else System.out.println("Não está liberado para construção!");
    }
        
    public String toString() {
        df.setRoundingMode(RoundingMode.DOWN);
        return "\nTipo: " + this.getTipo() + 
               "\nRua: " + this.getRua() +
               "\nBairro: " + this.getBairro() +
               "\nNúmero: " + this.getNumero() +
               "\nM²: " + this.getMetrosQuadrado() +
               "\nAterro: " + this.getAterro() +
               "\nPreço à vista: " + df.format(this.getPrecoVista()) +
               "\nPreço à prazo: " + df.format(this.getPrecoPrazo()) +
               "\nIPTU: " + df.format(valorIptu());
    }
}
