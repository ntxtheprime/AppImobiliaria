package appimobiliaria;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

public abstract class Imovel {   
    
    private String tipo;
    private String rua;
    private String bairro;
    private String metrosQuadrado;
    private int codigo;
    private int numero;
    private double precoVista;
    private double precoPrazo;

    public Imovel(int codigo, String tipo, String rua, String bairro, String metrosQuadrado,
           int numero, double precoVista, double precoPrazo) {
        this.tipo = tipo;
        this.rua = rua;
        this.bairro = bairro;
        this.metrosQuadrado = metrosQuadrado;
        this.codigo = codigo;
        this.numero = numero;
        this.precoVista = precoVista;
        this.precoPrazo = precoPrazo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getMetrosQuadrado() {
        return metrosQuadrado;
    }

    public void setMetrosQuadrado(String metrosQuadrado) {
        this.metrosQuadrado = metrosQuadrado;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecoVista() {
        return precoVista;
    }

    public void setPrecoVista(double precoVista) {
        this.precoVista = precoVista;
    }

    public double getPrecoPrazo() {
        return precoPrazo;
    }

    public void setPrecoPrazo(double precoPrazo) {
        this.precoPrazo = precoPrazo;
    }

}
