package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

import appimobiliaria.abstratas.Imovel;

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
        this.taxaIptu = 1.0;
    }
    
    public boolean construcaoStatus(){
        if (status.equals("impedido")){
            return false; //Não está liberado para construção! 
        }
        
        return true;
    }
    
        public void imprimeConstrucaoStatus() {
        boolean sucesso = construcaoStatus();
        if(sucesso)System.out.println("Status: Está liberado para construção!");
        else System.out.println("Status: Não está liberado para construção!");
    }
        
    @Override
    public String toString() {
        
        return super.toString() + // super.toString() retorna o toString() da superclasse.
               "\nAterro: " + this.aterro;
    }
}
