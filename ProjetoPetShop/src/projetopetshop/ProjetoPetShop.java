package projetopetshop;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoPetShop {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
     ArrayList <Cliente> cliente = new ArrayList ();
     ArrayList <Funcionario> funcionario = new ArrayList();
     boolean rodando = true;
     
     while(rodando){  
        
        System.out.println("|1| Cadastrar Cliente");
        System.out.println("|2| Cadastrar Funcionário");
        System.out.println("|3| Listar Clientes Cadastrados");
        System.out.println("|4| Buscar Cliente Por Nome");
        System.out.println("|5| Listar Funcionários Cadastrados");
        System.out.println("|6| Sair");
        System.out.println("Digite a Opção: ");
        String opcao=scan.nextLine();  
        
      switch(opcao){
       
       case "1": 
       {
           System.out.println("=============Cadastro De Clientes=============");
           System.out.println("Digite Seu Nome: ");
           String nome = scan.nextLine();
           System.out.println("Digite Seu Email: ");
            String email = scan.nextLine();
            System.out.println("Digite Seu Cpf: ");
            String cpf = scan.nextLine();
            System.out.println("Digite Seu Telefone: ");
            String tel = scan.nextLine();
            System.out.println("Digite Sua Idade: ");
            int idade = scan.nextInt();
                   
           Cliente c =new Cliente();
           c.setNome(nome);
           c.setEmail(email);
           c.setCpf(cpf);
           c.setTelefone(tel);
         try
         {    
         c.setIdade(-1);
         }
         catch(IllegalArgumentException e)
         {
            System.out.println(e.getMessage());
        }
           idade = scan.nextInt();
           c.setIdade(idade);
           cliente.add(c);
           scan.nextLine();
           break;
       }
        case "2": 
       {
           System.out.println("=============Cadastro De Funcionários=============");
           System.out.println("Digite Seu Nome: ");
           String nome = scan.nextLine();
            System.out.println("Digite Seu Cargo: ");
           String cargo = scan.nextLine();
           System.out.println("Digite Sua Idade: ");
           int idade = scan.nextInt();
           System.out.println("Digite Seu Telefone: ");
           long tel = scan.nextInt();
           System.out.println("Digite Seu Rg: ");
           int rg = scan.nextInt();
           Funcionario f=new Funcionario();
           f.setNome(nome);
           f.setCargo(cargo);
           f.setIdade(idade);
           f.setTelefone(tel);
           f.setRg(rg);
          
           
           funcionario.add(f);
           scan.nextLine();
           break;
       }
         case "3": 
       {
           System.out.println("=============Lista De Clientes=============");
           for(int i = 0; i <cliente.size(); i++){
          
               System.out.println("Cliente " + i);
               System.out.println("\tNome: " + cliente.get(i).getNome());
               System.out.println("\tEmail: " + cliente.get(i).getEmail());
               System.out.println("\tCpf: " + cliente.get(i).getCpf());
               System.out.println("\tIdade: " + cliente.get(i).getIdade() );
                System.out.println("\tTelefone: " + cliente.get(i).getTelefone());
           }
           break;
       }
         case "4": 
       {
           System.out.println("=============Buscar Clientes=============");
           System.out.println("Digite o nome: ");
           String nome = scan.nextLine();
           
           //for (int i = 0 ; i <cliente.size(); i++){
           //Cliente cTemp= cliente.get(i);
           for(Cliente cTemp:cliente){
           if(cTemp.getNome().startsWith(nome)){
               System.out.println("Clientes Encontrados");   
               System.out.println("\tCliente: " + cTemp.getNome());
              
           }else{
               System.out.println("Cliente Não Encontrado");   
           }     
               }
           
           break;
       }
         case "5":
         {
             System.out.println("=============Lista De Funcionários=============");
           for(int i = 0; i <funcionario.size(); i++){
               System.out.println("Funcionário " + i);
               System.out.println("\tNome: " + funcionario.get(i).getNome());
               System.out.println("\tCargo: " + funcionario.get(i).getCargo());
               System.out.println("\tIdade: " + funcionario.get(i).getIdade());
               System.out.println("\tTelefone: " + funcionario.get(i).getTelefone() );
               System.out.println("\tRegistro Geral: " + funcionario.get(i).getRg());
           }
          break;   
         }
         case "6": 
       {
           rodando=false;
           break;
       }
   }
   
    }}}
    
   
    
 
 
