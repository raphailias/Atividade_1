public class Cartoes {
    private double taxaConversaoDolar;
    private int idCartao;
    private String label;
    private String emissorCartao;
    private int tipo;
    private int dataEmissao;
    private int validade;
    private int cvv;
    private int senha;
    private int numeroCartao;
    private int numeroConta;
    private Carteiras carteiras;

public Cartoes(double taxaConversaoDolar,int idCartao,String label,String emissorCartao,int tipo,int dataEmissao,
               int validade,int cvv,int senha, int numeroCartao,int numeroConta){
    this.cvv = cvv;
    this.dataEmissao = dataEmissao;
    this.emissorCartao = emissorCartao;
    this.idCartao = idCartao;
    this.senha = senha;
    this.label = label;
    this.taxaConversaoDolar = taxaConversaoDolar;
    this.numeroCartao = numeroCartao;
    this.tipo = tipo;
    this.validade = validade;
    this.numeroConta = numeroConta;

}
    public boolean donaCartao(Carteiras carteiras) {
        if (carteiras.getCartoes().equals(this)) {
            return true;

        } else
            return false;
    }


    public double getTaxaConversaoDolar() {
        return taxaConversaoDolar;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public String getLabel() {
        return label;
    }

    public String getEmissorCartao() {
        return emissorCartao;
    }

    public int getTipo() {
        return tipo;
    }

    public int getDataEmissao() {
        return dataEmissao;
    }

    public int getValidade() {
        return validade;
    }

    public int getCvv() {
        return cvv;
    }

    public int getSenha() {
        return senha;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Carteiras getCarteiras() {
        return carteiras;
    }

}
