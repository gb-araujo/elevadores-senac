public class Elevador {
    int andarAtual;
    int totalAndares;
    double capacidade;
    int quantidadeMaxPessoas;
    int quantidadePessoas;
    int andaresAtendidos;

    public Elevador(int andarAtual, int totalAndares, int capacidade, int quantidadeMaxPessoas, int quantidadePessoas) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.quantidadeMaxPessoas = quantidadeMaxPessoas;
        this.quantidadePessoas = quantidadePessoas;

    }

    public void subir(int incremento){
        if (totalAndares > 5) {
            System.out.println("O ultimo andar é 5");
        } else {
            this.andarAtual += incremento;
            System.out.println("Subindo " + incremento + " Andares");
        }
    }

    public void descer(int decremento){
        if (totalAndares < -1) {
            System.out.println("Só consegue descer até o primeiro subsolo.");
        } else {
            this.andarAtual -= decremento;
            System.out.println("Descendo " + decremento + " Andares");
        }
    }

    public void addPessoa(int incremento){
        if (quantidadePessoas < quantidadeMaxPessoas) {
            quantidadePessoas += incremento;
            System.out.println("Pessoa adicionada");
        } else {
            System.out.println("Capacidade máxima atingida");
        }
    }

    public void removePessoa(int decremento){
        if (this.quantidadePessoas > 0) {
            quantidadePessoas -= decremento;
            System.out.println("Pessoa removida");
        } else {
            System.out.println("Não há ninguém.");
        }
    }
    public void imprimirDados() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Andar atual: " + this.andarAtual);
        System.out.println("Quantidade de andares: " + this.totalAndares);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Máximo de pessoas: " + this.quantidadeMaxPessoas);
        System.out.println("Quantidade de pessoas atual: " + this.quantidadePessoas);
        System.out.println("-------------------------------------------------------");
    }

}
