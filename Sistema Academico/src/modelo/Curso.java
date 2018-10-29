package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private String codigo;
	private String turno;
	private List<Disciplina> grade = new ArrayList();
	private Professor coordenador;
	
	public Curso(){
		
	}

	public Curso(String nome, String codigo, String turno, Professor coordenador) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		this.coordenador = coordenador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public List<Disciplina> getGrade() {
		return grade;
	}

	public void setGrade(List<Disciplina> grade) {
		this.grade = grade;
	}

	public Professor getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", codigo=" + codigo + ", turno=" + turno + ", grade=" + grade + ", coordenador="
				+ coordenador + "]";
	}
	
	
}
