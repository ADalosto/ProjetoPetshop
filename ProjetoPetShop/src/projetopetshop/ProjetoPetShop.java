package projetopetshop;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoPetShop {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
     ArrayList <Cliente> cliente = new ArrayList ();
     ArrayList <Funcionario> funcionario = new ArrayList();
     ArrayList <Produto> produto= new ArrayList ();
     boolean rodando = true;
     boolean erro;
     while(rodando){
        System.out.println("|1| Cadastrar Cliente");
        System.out.println("|2| Cadastrar Funcionário");
        System.out.println("|3| Listar Clientes Cadastrados");
        System.out.println("|4| Buscar Cliente Por Nome");
        System.out.println("|5| Listar Funcionários Cadastrados");
        System.out.println("|6| Buscar Funcionario Por Nome");
        System.out.println("|7| Cadastrar Produtos");   
        System.out.println("|8| Listar Produtos Cadastrados");
        System.out.println("|9| Buscar Produto Por Nome");
        System.out.println("|10| Sair");
        System.out.println("Digite a Opção: ");
        String opcao=scan.nextLine();  
        
      switch(opcao){
       
       case "1": 
       {
           System.out.println("=============Cadastro De Clientes=============");
          Cliente c =new Cliente(); 
          do{
            try
         {
        System.out.println("Digite Seu Nome: ");
            String nome = scan.nextLine();
            c.setNome(nome);
            erro=false;
         }
            catch(StringVazioException e)
                 {
                 System.out.println(e.getMessage());
                 erro=true;
                 }
        }while(erro);
        do{
            try
            {
        System.out.println("Digite Seu Email: ");
        String email = scan.nextLine();
        c.setEmail(email);
        erro=false;
            }
        catch(StringVazioException e)
        {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
       do{
       try{
       System.out.println("Digite Seu Cpf: ");
       String cpf = scan.nextLine();
       c.setCpf(cpf);
       erro=false;}
            
       catch(StringVazioException e)
                 {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
              do{
            try{
            System.out.println("Digite Seu Telefone: ");
            String tel = scan.nextLine();
            c.setTelefone(tel);
            erro=false;
            }
              
         catch(StringVazioException e)
         {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);  
         do{
         try
         {    
            System.out.println("Digite Sua Idade: ");
            int idade = scan.nextInt();
            c.setIdade(idade);
            erro=false;
         }  
         catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            erro=true;
        }
           }while(erro);
         
           cliente.add(c);
           scan.nextLine();
           break;
       }
        case "2": 
       {
           System.out.println("=============Cadastro De Funcionários=============");
           Funcionario f=new Funcionario();
           do{
            try
         {
        System.out.println("Digite Seu Nome: ");
            String nome = scan.nextLine();
            f.setNome(nome);
            erro=false;
         }
            catch(StringVazioException e)
                 {
                 System.out.println(e.getMessage());
                 erro=true;
                 }
        }while(erro);
        do{
            try
            {
        System.out.println("Digite Seu Cargo: ");
           String cargo = scan.nextLine();
        f.setCargo(cargo);  
        erro=false;
            }
        catch(StringVazioException e)
        {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
       do{
       try{
        System.out.println("Digite Seu Rg: ");
           String rg = scan.nextLine();
       f.setRg(rg);
       erro=false;}
            
       catch(StringVazioException e)
                 {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
              do{
            try{
            System.out.println("Digite Seu Telefone: ");
            String tel = scan.nextLine();
                       f.setTelefone(tel);
            erro=false;
            }
              
         catch(StringVazioException e)
         {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);  
         do{
         try
         {    
            System.out.println("Digite Sua Idade: ");
            int idade = scan.nextInt();
            f.setIdade(idade);
            erro=false;
         }  
         catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            erro=true;
        }
           }while(erro);
        
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
          System.out.println("=============Buscar Funcionários=============");
           System.out.println("Digite o nome: ");
           String nome = scan.nextLine();
           
           //for (int i = 0 ; i <cliente.size(); i++){
           //Cliente cTemp= cliente.get(i);
           for(Funcionario fTemp:funcionario){
           if(fTemp.getNome().startsWith(nome)){
               System.out.println("Funcionário Encontrados");   
               System.out.println("\tFuncionário: " + fTemp.getNome());
           }else{
               System.out.println("Funcionário Não Encontrado");   
           }     
       }
       }
        case "7": 
        {
           System.out.println("=============Cadastro De Produtos=============");
              Produto p = new Produto();
           do{
            try
         {
        System.out.println("Nome do Produto: ");
        String nomeProd = scan.nextLine();
        p.setNomeProd(nomeProd);
        erro=false;
         }
            catch(StringVazioException e)
                 {
                 System.out.println(e.getMessage());
                 erro=true;
                 }
        }while(erro);
        do{
            try
            {
        System.out.println("Digite a Descrição do Produto: ");
        String desc = scan.nextLine();
        p.setDesc(desc);  
        erro=false;
            }
        catch(StringVazioException e)
        {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
       do{
       try{
       System.out.println("Digite o Porte Indicado do Produto: ");
       String porte = scan.nextLine();
       p.setPorte(porte);
       erro=false;
       }
            
       catch(StringVazioException e)
                 {
       System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);
              do{
            try{
            System.out.println("Digite o preço do Produto: ");
            double preco = scan.nextDouble();
                       p.setPreco(preco);
            erro=false;
            }
              
         catch(IllegalArgumentException e)
         {
        System.out.println(e.getMessage());
        erro=true;
                 }
            }while(erro);  
         do{
         try
         {    
            System.out.println("Digite a quantidade: ");
            int qntd = scan.nextInt();
           p.setQntd(qntd);
            erro=false;
         }  
         catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            erro=true;
        }
           }while(erro);
             
           produto.add(p);
           scan.nextLine();
           break;
        }
         case "8": 
        {
           System.out.println("=============Lista De Produtos=============");
           for(int i = 0; i <produto.size(); i++){
          
               System.out.println("Produto " + i);
               System.out.println("\tNome: " + produto.get(i).getNomeProd());
               System.out.println("\tDescrição: " + produto.get(i).getDesc());
               System.out.println("\tPorte: " + produto.get(i).getPorte());
               System.out.println("\tPreço: " + produto.get(i).getPreco());
               System.out.println("\tQuantidade: " + produto.get(i).getQntd());
           }
      
           break;
        }
         case "9": 
        {
           System.out.println("=============Buscar Produtos=============");
           System.out.println("Digite o nome: ");
           String nome = scan.nextLine();
           
           //for (int i = 0 ; i <cliente.size(); i++){
           //Cliente cTemp= cliente.get(i);
           for(Produto pTemp:produto){
           if(pTemp.getNomeProd().startsWith(nome)){
               System.out.println("Produtos Encontrados");   
               System.out.println("\tProduto: " + pTemp.getNomeProd());
           }else{
               System.out.println("Produto Não Encontrado");   
           }     
       }
        }
         case "10": 
        {
           rodando=false;
           break;
        }
   }
   
    }}}
    
   
    
 
 
