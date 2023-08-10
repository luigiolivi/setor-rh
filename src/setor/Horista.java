package setor;

public class Horista extends Funcionario {
    private float horas, valorHora;
    
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
        salario = (1 + (porcentagem / 100)) * salario;
        setSalario(salario);
    }
}
