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

    public Casa(String qtdOutros, int qtdQuintal, int qtdQuartos, int qtdBanheiro,
            int qtdGaragem, int codigo, String tipo, String rua, String bairro,
            String metrosQuadrado, int numero, double precoVista, double precoPrazo) {
        super(qtdQuartos, qtdBanheiro, qtdGaragem, codigo, tipo, rua, bairro,
                metrosQuadrado, numero, precoVista, precoPrazo);
        this.qtdOutros = qtdOutros;
        this.qtdQuintal = qtdQuintal;
        this.taxaIptu = 2.0;
    }

    
    @Override
    public String toString() {
        
        return super.toString() + // super.toString() retorna o toString() da superclasse.
               "\nQuantidades de quintais: " + this.qtdQuintal +
               "\nQuantidades outros: " + this.qtdOutros;
    }
}
