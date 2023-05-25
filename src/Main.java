public class Main {
    public static void main(String[] args) {

        Elevador atrio = new Elevador("atrio",0, 7, 1125, 15, 0);
        atrio.descer(-3);
        atrio.addPessoa(8);
        atrio.removePessoa(8);
        atrio.imprimirDados();

        Elevador biblioteca = new Elevador("biblioteca",0, 7, 1125, 15, 0);
        biblioteca.subir(2);
        biblioteca.addPessoa(15);
        biblioteca.removePessoa(4);
        biblioteca.imprimirDados();

        Elevador principal = new Elevador("principal",0, 7, 1800, 24, 0);
        principal.subir(8);
        principal.addPessoa(5);
        principal.removePessoa(1);
        principal.imprimirDados();


    }
}