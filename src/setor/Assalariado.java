package setor;

public class Assalariado extends Funcionario  {
    
    @Override
    public void mostrarDados() {
        System.out.println("nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Setor: " + this.getSetor());
        
    }
    
    @Override
    public void aplicarAumento() {
    
    }
}
