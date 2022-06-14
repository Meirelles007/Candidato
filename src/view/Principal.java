package view;

import java.time.LocalDate;

import model.Candidato;

public class Principal {
	
	public static void main(String[] args) {
		Candidato p = new Candidato();
		p.setId(1);
		p.setNome("joao");
		p.setEnsinoMedioPublico(true);
		p.setEnsinoSuperiorCompleto(true);
		p.setAnosRegistroEntidadeClasse(5);
		p.setAnosExperiencia(2);
		p.setPontosProva(6);
		
	}

}

