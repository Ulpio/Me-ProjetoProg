public class ListaProfessor {
    public static void main(String[] args) {
        Professor Yanna = new Professor("Yanna", "1234", "001", "Programação");
        Professor Ulpio = new Professor("ulpio", "133", "002", "logica");
        CadastroProfessor.adicionarProfessor(Yanna);
        CadastroProfessor.adicionarProfessor(Ulpio);
        CadastroProfessor.imprimirProfessor();
        CadastroProfessor.verificarMatricula("002");
    }
}
