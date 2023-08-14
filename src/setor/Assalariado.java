package setor;

public class Assalariado extends Funcionario  {
    
    @Override
    public void mostrarDados() {
        System.out.println("nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Setor: " + getSetor());
    }
    
    @Override
    public void aplicarAumento(int porcentagem) {
        float salario = getSalario();
        salario += (salario * porcentagem) / 100;
        this.setSalario(salario);
    }
}
