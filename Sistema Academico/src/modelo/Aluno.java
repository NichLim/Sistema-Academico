package modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	public String matricula;
	private List<Disciplina> disciplinas = new ArrayList();
	private boolean situacao;
	private Curso curso;
	
	public Aluno(){
		
	}

	public Aluno(String nome, String cpf, String endereco, String email, String matricula, boolean situacao, Curso curso) {
		super(nome, cpf, endereco, email);
		this.matricula = matricula;
		this.situacao = situacao;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", disciplinas=" + disciplinas + ", situacao=" + situacao + ", curso="
				+ curso + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
