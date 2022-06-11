package projetopetshop;

public abstract class Pessoa implements IPessoa {

    
    @Override
    public void exibir(){
    
    }

    private String nome;
    private int idade;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public int getIdade() {
        
        return idade;
    }

    public void setIdade(int idade) {
           if(idade<0)
        {
            throw new IllegalArgumentException("Idade Negativa.Tente Novamente: ");
        }
           else{
        this.idade = idade;
    }
}
}