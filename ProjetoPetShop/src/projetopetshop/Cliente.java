
package projetopetshop;
public class Cliente extends Pessoa implements IPessoa{
    private String cpf;
    private String telefone;
    private String email;

    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
         if(cpf.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.cpf = cpf;
    }
    }
   

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
     if(telefone.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.telefone = telefone;
    }
    }
   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
     if(email.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.email = email;
    }
    }
}
