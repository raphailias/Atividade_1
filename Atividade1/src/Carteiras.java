public class Carteiras {
    private int idCarteira;
    private String nomeCarteira;
    private int senhaAcesso;
    private Cartoes cartaoDebito;
    private Cartoes cartaoCredito;
    private Cartoes cartoes;

public Carteiras(int idCarteira,String nomeCarteira,int senhaAcesso,Cartoes cartaoCredito, Cartoes cartaoDebito){
    if(cartaoCredito != null) {
        this.cartaoCredito = cartaoCredito;
    }
    if(cartaoDebito!= null) {
        this.cartaoDebito = cartaoDebito;
    }

    this.idCarteira = idCarteira;
    this.setSenhaAcesso(senhaAcesso);
    this.setNomeCarteira(nomeCarteira);

}



public boolean donaCarteira(Usuarios usuarios){
if(usuarios.getCarteiras().equals(this)){
    return true;

}else{
    return  false;
    }



}


    public String getNomeCarteira() {
        return nomeCarteira;
    }

    public void setNomeCarteira(String nomeCarteira) {
        this.nomeCarteira = nomeCarteira;
    }

    public int getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(int senhaAcesso) {
        this.senhaAcesso = senhaAcesso;
    }

    public Cartoes getCartaoDebito() {
        return cartaoDebito;
    }

    public void setCartaoDebito(Cartoes cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }

    public Cartoes getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(Cartoes cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Cartoes getCartoes() {
        return cartoes;
    }

    public void setCartoes(Cartoes cartoes) {
        this.cartoes = cartoes;
    }
    public String pegarDados(){
        return "IDCarteira "+ idCarteira + "\n" +  "NomeCarteira"+ nomeCarteira +"\n"+ "senha" + senhaAcesso +"\n"+ "CartaoDebito"+ cartaoDebito.getNumeroCartao() +"\n"+"cartaoCredito"+cartaoCredito.getNumeroCartao();

    }



}

