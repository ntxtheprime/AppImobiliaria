package appimobiliaria.abstratas;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

public abstract class ImovelConstruido extends Imovel {
    protected int qtdQuartos;
    protected int qtdBanheiro;
    protected int qtdGaragem;

    public ImovelConstruido(int qtdQuartos, int qtdBanheiro, int qtdGaragem,
           int codigo, String tipo, String rua, String bairro, String metrosQuadrado,
           int numero, double precoVista, double precoPrazo) {
        super(codigo, tipo, rua, bairro, metrosQuadrado, numero, precoVista, precoPrazo);
        this.qtdQuartos = qtdQuartos;
        this.qtdBanheiro = qtdBanheiro;
        this.qtdGaragem = qtdGaragem;
    }

    @Override
    public String toString() {
        
        return super.toString() + // super.toString() retorna o toString() da superclasse.
               "\nQuantidades de quartos: " + this.qtdQuartos +
               "\nQuantidades de banheiros: " + this.qtdBanheiro +
               "\nQuantidades de garagens: " + this.qtdGaragem;
    }
}
