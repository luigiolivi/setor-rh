package setor;

import java.util.Scanner;

public class Setor {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        
        char continuar = 'S';
        
        Scanner entrada = new Scanner (System.in);

        int i = 0;
        while (continuar == 'S' || continuar == 's') {
            char tipo;
            
            {
                System.out.println("\nDigite o tipo do funcionário (A/H): ");
                tipo = entrada.next().charAt(0);
                
                if (tipo == 'H' || tipo == 'h') {
                    funcionarios[i] = new Horista();
                    
                    System.out.println("Digite o valor da hora: ");
                    Horista.setValorHora(entrada.nextFloat());
                    
                    System.out.println("Digite a quantidade de horas trabalhadas: ");
                    Horista.setHoras(entrada.nextFloat());
                    
                    System.out.println("Digite a quantidade de dias trabalhados no mês");
                    Horista.setDias(entrada.nextInt());
                    entrada.nextLine();
                    
                    funcionarios[i].setSalario((Horista.getValorHora() * Horista.getHoras() * Horista.getDias()));
                }
                
                else {
                    funcionarios[i] = new Assalariado();
                    
                    System.out.println("Digite o salário mensal: ");
                    funcionarios[i].setSalario(entrada.nextFloat());
                    entrada.nextLine();
                }
                
                System.out.println("Digite o nome do funcionário: ");
                funcionarios[i].setNome(entrada.nextLine());
                
                System.out.println("Digite o CPF do funcionário: ");
                funcionarios[i].setCpf(entrada.nextLine());
                
                System.out.println("Digite o endereço do funcionário: ");
                funcionarios[i].setEndereco(entrada.nextLine());
                
                System.out.println("Digite o telefone do funcionário: ");
                funcionarios[i].setTelefone(entrada.nextLine());
                
                System.out.println("Digite o setor do funcionário: ");
                funcionarios[i].setSetor(entrada.nextLine());
            }

            System.out.println("Deseja informar mais um usuário? (S/N)");
            continuar = entrada.next().charAt(0);
                
            if (funcionarios[9] != null) {
                System.out.println("\nNumero máximo de funcionários registrados!");
                
                break;
            }
            
            i++;
        } i = 1;
        
        for (Funcionario f : funcionarios) {
            if (f == null) break;
            
            System.out.println("\nDados do funcionário " + i + ":");
            f.mostrarDados();
            System.out.println("Salário: R$" + f.getSalario());
            
            i++;
        } i = 1;
        
        System.out.println("\nDigite o valor do aumento geral, em porcentagem (%): ");
        int porcentagem = entrada.nextInt();
        
        System.out.println("Salários com aumento geral de " + porcentagem + "%: ");
        for (Funcionario f : funcionarios) {
            if (f == null) break;
            f.aplicarAumento(porcentagem);
        }
        
        for (Funcionario f : funcionarios) {
            if (f == null) break;
            
            System.out.println("Funcionario " + i + ": R$" + f.getSalario());
            
            i++;
        }
    }
}