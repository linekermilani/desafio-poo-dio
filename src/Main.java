import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o do curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descri��o do curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descri��o de Mentoria Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Lineker");
		dev1.inscreverBootCamp(bootcamp);
		System.out.println("Conte�dos Inscritos Lineker: " + dev1.getConteudosInscrito());
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Lineker: " + dev1.getConteudosInscrito());
		System.out.println("Conte�dos Conclu�dos Lineker: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularXp());
		
		System.out.println("------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Jo�o");
		dev2.inscreverBootCamp(bootcamp);
		System.out.println("Conte�dos Inscritos Jo�o: " + dev2.getConteudosInscrito());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Jo�o: " + dev2.getConteudosInscrito());
		System.out.println("Conte�dos Conclu�dos Jo�o: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularXp());
		
		
	}
}
