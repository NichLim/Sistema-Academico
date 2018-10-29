package modelo;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{
	
	private int categoria;
	private List<Disciplina> disciplinas = new ArrayList();
		
	public Professor (){
		
	}
	
	public Professor(String nome, String cpf, String endereco, String email, int categoria){
		super(nome, cpf, endereco, email);
		this.categoria = categoria;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Professor [categoria=" + categoria + ", toString()=" + super.toString() + "]";
	}
	
	

}
