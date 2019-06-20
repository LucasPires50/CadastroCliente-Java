
package CadastroCliente;

import Modelo.Cliente;


public class CadastroCliente {


    public static void main(String[] args) {
        // uma variável ter vários valores dentro 
        
        //criar um novo cliente
        // o cliente passa a ser a variável, onde contem varias varias diferentes int, string, boolean, double. (eu que determino classe secundária)
        Cliente cli = new Cliente();
        // o "cli" é uma variável do tipo cliente.
        
        cli.codigo = 101;
        cli.nome = "Lucas";
        cli.cpf = "800.560.900-63";
        cli.email = "lucas@gmail.com";
        cli.telefone = "(47) 9 8888-6000";
        cli.endereço = "Rua Amador do reis, nº 40, Bairro Três Marias.";
        cli.cep = 895852666;
        cli.aposentado = false;
        
        
        //System.out.println("Nome: "+cli.nome);
        
        //array para guardar cliente
       
        Cliente[] ListaDeClientes = new Cliente[4];
        ListaDeClientes[0] = cli;
        
        //aqui zera a variavel para preencher a próxima posição
        cli = new Cliente();
        
        cli.codigo = 1030;
        cli.nome = "Josè";
        cli.cpf = "111.222.900-63";
        cli.email = "jose@gmail.com";
        cli.telefone = "(47) 9 8888-6000";
        cli.endereço = "Rua Sete de Setembro, nº 52, Bairro Lagoinha.";
        cli.cep = 741856325;
        cli.aposentado = false;
        ListaDeClientes[1] = cli;
        
        cli = new Cliente();
       
        cli.codigo = 2305;
        cli.nome = "Maria";
        cli.cpf = "896.666.900-63";
        cli.email = "maria@gmail.com";
        cli.telefone = "(47) 9 9856-6000";
        cli.endereço = "Rua Calama, nº 89, Bairro Cohab.";
        cli.cep = 789632145;
        cli.aposentado = false;
        ListaDeClientes[2] = cli;
        
        cli = new Cliente();
        
        cli.codigo = 5698;
        cli.nome = "Beta";
        cli.cpf = "963.123.900-63";
        cli.email = "beta@gmail.com";
        cli.telefone = "(47) 9 8963-6000";
        cli.endereço = "Rua Amazonas, nº 74, Bairro Cuniã.";
        cli.cep = 963456852;
        cli.aposentado = true;
        ListaDeClientes[3] = cli;
        
        for(int i = 0; i < ListaDeClientes.length; i++ ){
            cli = ListaDeClientes[i];
            System.out.println("------------------------------");
            System.out.println("Código do cliente: "+cli.codigo);
            System.out.println("Nome: "+cli.nome);
            System.out.println("CPF: "+cli.cpf);
            System.out.println("Email: "+cli.email);
            System.out.println("Telefone: "+cli.telefone);
            System.out.println("Endereço: "+cli.endereço);
            System.out.println("CEP: "+cli.cep);
            System.out.println("Aposentado: "+cli.aposentado);
            
                
            }
            
        }
                
                
    }
    
