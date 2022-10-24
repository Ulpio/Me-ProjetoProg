public class ListaProfessor {

	public static void main(String[] args) {

		Professor yanna = new Professor("Yanna", "1234", "001", "Programação");
		Professor ulpio = new Professor("ulpio", "1334", "002", "logica");
		Professor henrique = new Professor("henrique", "1335", "003", "fisica");
		Professor henry = new Professor("henry", "1233", "004", "Redes");
		Professor arthur = new Professor("arthur", "1431", "005", "Calculo");

		CadastroProfessor.adicionarProfessor(yanna);
		CadastroProfessor.adicionarProfessor(ulpio);
		CadastroProfessor.adicionarProfessor(henrique);
		CadastroProfessor.adicionarProfessor(henry);
		CadastroProfessor.adicionarProfessor(arthur);

        CadastroProfessor.imprimirProfessor();
		CadastroProfessor.verificarMatricula("002");
	}
}
