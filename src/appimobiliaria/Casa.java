package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

import appimobiliaria.abstratas.ImovelConstruido;

public class Casa extends ImovelConstruido {
        
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
        this.taxaIptu = 2.0;
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
    
    @Override
    public String toString() {
        
        return super.toString() + // super.toString() retorna o toString() da superclasse.
               "\nQuantidades de quintais: " + this.qtdQuintal +
               "\nQuantidades outros: " + this.qtdOutros;
    }
}
