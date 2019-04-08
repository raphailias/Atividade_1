public class Usuarios {
    private String nome;
    private String email;
    private int cpf;
    private String nascimento;
    private Carteiras carteiras;
    private Cartoes cartaoDebito;
    private Cartoes cartaoCredito;
    private Cartoes cartoes;



    public Usuarios(String nome,String email,int cpf, String  nascimento,Cartoes cartaoDebito,Cartoes cartaoCredito,Carteiras carteiras){
        this.setNome(nome);
        this.setEmail(email);
        this.setCpf(cpf);
        this.setNascimento(nascimento);
        this.carteiras = carteiras;
        this.cartaoCredito = cartaoCredito;
        this.cartaoDebito = cartaoDebito;


    }

    public Carteiras getCarteiras() {
        return carteiras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setCarteiras(Carteiras carteiras) {
        this.carteiras = carteiras;
    }
    public String nullPointer(){
        if(cartaoDebito==null){
            return "Nao tem cartao";
        }else
            return "CartaoDebito: "+cartaoDebito.getNumeroCartao();



    }
    public String nullPointer2(){
        if(cartaoCredito==null){
            return "Nao tem cartao";
        }else
            return "CartaoCredito: "+cartaoCredito.getNumeroCartao();



    }
    public String pegarDados(){
        return "Nome: "+ nome + "\n" +  "email: "+ email +"\n"+ "cpf: " + cpf +"\n"+ "Nascimento: " + nascimento+"\n"+"Carteira: "+carteiras.getNomeCarteira()+"\n"+""+nullPointer()+"\n"+""+nullPointer2();
    }

}
