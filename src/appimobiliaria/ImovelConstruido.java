package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

public abstract class ImovelConstruido extends Imovel {
    private int qtdQuartos;
    private int qtdBanheiro;
    private int qtdGaragem;

    public ImovelConstruido(int qtdQuartos, int qtdBanheiro, int qtdGaragem,
           int codigo, String tipo, String rua, String bairro, String metrosQuadrado,
           int numero, double precoVista, double precoPrazo) {
        super(codigo, tipo, rua, bairro, metrosQuadrado, numero, precoVista, precoPrazo);
        this.qtdQuartos = qtdQuartos;
        this.qtdBanheiro = qtdBanheiro;
        this.qtdGaragem = qtdGaragem;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public int getQtdBanheiro() {
        return qtdBanheiro;
    }

    public void setQtdBanheiro(int qtdBanheiro) {
        this.qtdBanheiro = qtdBanheiro;
    }

    public int getQtdGaragem() {
        return qtdGaragem;
    }

    public void setQtdGaragem(int qtdGaragem) {
        this.qtdGaragem = qtdGaragem;
    }


}
