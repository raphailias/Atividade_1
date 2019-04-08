public class Vendas {
    private Usuarios usuarios;
    private Cartoes cartoes;
    private Carteiras carteiras;
    private double preco;
    private int senha;

public Vendas(Usuarios usuarios,Carteiras carteiras, Cartoes cartoes,double preco){
    this.usuarios = usuarios;
    this.carteiras = carteiras;
    this.cartoes = cartoes;
    this.preco = preco;
}
public boolean senhacerta(){
        if(cartoes.getSenha()==cartoes.getSenha()){
            return true;
        }else
            return false;
    }



public String vendas(){
    return "Nome: " +usuarios.getNome()+"\n"+"Carteira: "+carteiras.getNomeCarteira()+"\n"+"Cartao: "+cartoes.getNumeroCartao()+"\n"+"senha aprovada: "+senhacerta()+"\n"+ "preco: "+ preco+"\n";






}




}
