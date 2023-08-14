package setor;

public class Horista extends Funcionario {
    private static float valorHora, horas;
    private static int dias;
    
    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Setor: " + getSetor());
    }
    
    @Override
    public void aplicarAumento(int porcentagem) {
        float salario = getSalario();
        salario += (salario * porcentagem) / 100;
        setSalario(salario);
    }

    public static float getHoras() {
        return horas;
    }

    public static void setHoras(float horas) {
        Horista.horas = horas;
    }

    public static float getValorHora() {
        return valorHora;
    }

    public static void setValorHora(float valorHora) {
        Horista.valorHora = valorHora;
    }

    public static float getDias() {
        return dias;
    }

    public static void setDias(int dias) {
        Horista.dias = dias;
    }
}
