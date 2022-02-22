package br.edu.iftm.exerciciofeitoemaula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.iftm.exerciciofeitoemaula.model.Pessoa;
import br.edu.iftm.exerciciofeitoemaula.model.Telefone;
import br.edu.iftm.exerciciofeitoemaula.repository.PessoaRepository;
import br.edu.iftm.exerciciofeitoemaula.repository.TelefoneRepository;

@SpringBootApplication
public class ExerciciofeitoemaulaApplication implements CommandLineRunner {

	@Autowired
	PessoaRepository pessoaRepository;

	@Autowired
	TelefoneRepository telefoneRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExerciciofeitoemaulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pessoa p1 = new Pessoa(null, "Edson", "123");

		
		Telefone t1 = new Telefone(null, "cel", 123, p1);
		Telefone t2 = new Telefone(null, "cel", 456, p1);
		Telefone t3 = new Telefone(null, "cel", 789, p1);
		Telefone t4 = new Telefone(null, "cel", 999, p1);
		
		pessoaRepository.save(p1);
		telefoneRepository.save(t1);
		telefoneRepository.save(t2);
		telefoneRepository.save(t3);
		telefoneRepository.save(t4);
	}

}
