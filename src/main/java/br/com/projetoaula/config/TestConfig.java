package br.com.projetoaula.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.projetoaula.entities.User;
import br.com.projetoaula.repositories.UserRepository;

@Configuration /*Classe específica de configuração*/
@Profile("test") /*Configuração específica para teste*/
public class TestConfig implements CommandLineRunner{
	
	@Autowired /*Resolve a dependência e asssociar uma instância do UserRepository no TestConfig*/
	private UserRepository userRepository;

	@Override /*Tudo que estiver dentro deste método será executado quando a aplicação for iniciada*/
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
