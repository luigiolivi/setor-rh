package setor;

import java.util.Scanner;

public class Setor {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        
        char continuar = 'S';
        int i = 0;
        do {
            String tipo;
            
            Scanner entrada = new Scanner (System.in);
            
            {
                System.out.println("Digite o tipo do funcionário (assalariado/horista): ");
                tipo = entrada.next();
                
                if (tipo == "horista") {
                    funcionarios[i] = new Horista();
                    
                    System.out.println("Digite o valor da hora: ");
                    Horista.setValorHora(entrada.nextFloat());
                    
                    System.out.println("Digite a quantidade de horas trabalhadas: ");
                    Horista.setHoras(entrada.nextFloat());
                    
                    System.out.println("Digite a quantidade de dias trabalhados ");
                    Horista.setDias(entrada.nextInt());
                    
                    funcionarios[i].setSalario((Horista.getValorHora() * Horista.getHoras() * Horista.getDias()));
                }
                
                else {
                    funcionarios[i] = new Assalariado();
                    
                    System.out.println("Digite o salário mensal: ");
                    funcionarios[i].setSalario(entrada.nextFloat());
                }
                
                System.out.println("Digite o nome do funcionário: ");
                funcionarios[i].setNome(entrada.next());
                
                System.out.println("Digite o CPF do funcionário: ");
                funcionarios[i].setCpf(entrada.next());
                
                System.out.println("Digite o endereço do funcionário: ");
                funcionarios[i].setEndereco(entrada.next());
                
                System.out.println("Digite o telefone do funcionário: ");
                funcionarios[i].setTelefone(entrada.next());
                
                System.out.println("Digite o setor do funcionário: ");
                funcionarios[i].setSetor(entrada.next());
            }

            System.out.println("Deseja informar mais um usuário? (S/N)");
            continuar = entrada.next().charAt(0);
                
            i++;
        } while(continuar == 'S' || continuar == 's');
        i = 0;
        
        for (Funcionario f : funcionarios) {
            System.out.println("Dados do funcionário " + i);
            System.out.println("Nome :" + f.getNome());
            System.out.println("CPF: " + f.getCpf());
            System.out.println("Endereço: " + f.getEndereco());
            System.out.println("Telefone: " + f.getTelefone());
            System.out.println("Setor: " + f.getSetor());
            System.out.println("Salário: " + f.getSalario());
            
            i++;
        }
    }
}