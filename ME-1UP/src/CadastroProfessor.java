import java.util.ArrayList;

public class CadastroProfessor {
	private static ArrayList<Professor> lista = new ArrayList<>();

	public static void adicionarProfessor(Professor professor) {
		lista.add(professor);
	}

	public void excluirProfessor(Professor professor) {
		lista.remove(professor);
	}

	public static void imprimirProfessor() {
		for (Professor item : lista) {
			System.out.printf("%s", item + "\n");
		}
	}

	public static void verificarMatricula(String matricula) {
		boolean existe = false;
		for (int i = 0; i < lista.size(); i++) {
			Professor p1 = lista.get(i);
			if (matricula.equals(p1.getMatricula())) {
				System.out.println(p1);
				existe = true;
				break;
			}
		}

		if (!existe) {
			System.out.println("Professor não encontrado!");
		}
	}
}
