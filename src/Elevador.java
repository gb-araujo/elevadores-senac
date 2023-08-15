public class Elevador {
    String local;
    int andarAtual;
    int totalAndares;
    double capacidade;
    int quantidadeMaxPessoas;
    int quantidadePessoas;
    int andaresAtendidos;

    public Elevador(String local, int andarAtual, int totalAndares, double capacidade, int quantidadeMaxPessoas, int quantidadePessoas) {
        this.local = local;
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.quantidadeMaxPessoas = quantidadeMaxPessoas;
        this.quantidadePessoas = quantidadePessoas;
    }

    public void subir(int incremento){
        int novoAndar = andarAtual + incremento;
        if (novoAndar <= totalAndares && novoAndar <= 5) {
            this.andarAtual = novoAndar;
            System.out.println("Subindo " + incremento + " Andares");
        } else {
            System.out.println("Não é possível subir até esse andar.");
        }
    }

    public void descer(int decremento){
        int novoAndar = andarAtual - decremento;
        if (novoAndar >= 0 && novoAndar >= -1) {
            this.andarAtual = novoAndar;
            System.out.println("Descendo " + decremento + " Andares");
        } else {
            System.out.println("Não é possível descer até esse andar.");
        }
    }

    public void addPessoa(int incremento){
        int novaQuantidadePessoas = quantidadePessoas + incremento;
        if (novaQuantidadePessoas <= quantidadeMaxPessoas && novaQuantidadePessoas <= capacidade) {
            quantidadePessoas = novaQuantidadePessoas;
            System.out.println("Pessoa adicionada");
        } else {
            System.out.println("Capacidade máxima atingida");
        }
    }

    public void removePessoa(int decremento){
        int novaQuantidadePessoas = quantidadePessoas - decremento;
        if (novaQuantidadePessoas >= 0) {
            quantidadePessoas = novaQuantidadePessoas;
            System.out.println("Pessoa removida");
        } else {
            System.out.println("O elevador está vazio.");
        }
    }

    public void imprimirDados() {
        System.out.println("Elevador: " + this.local);
        System.out.println("Andar atual: " + this.andarAtual);
        System.out.println("Quantidade de andares: " + this.totalAndares);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Máximo de pessoas: " + this.quantidadeMaxPessoas);
        System.out.println("Quantidade de pessoas atual: " + this.quantidadePessoas);
        System.out.println("-------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Exemplo de uso do elevador
        Elevador elevador = new Elevador("Edifício A", 0, 10, 1000, 10, 0);

        elevador.addPessoa(5);
        elevador.subir(3);
        elevador.imprimirDados();

        elevador.removePessoa(3);
        elevador.descer(2);
        elevador.imprimirDados();
    }
}
