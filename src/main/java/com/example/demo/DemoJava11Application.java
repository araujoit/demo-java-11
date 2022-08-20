package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.utils.CollectionArraySupport;
import com.example.demo.utils.FileSupport;
import com.example.demo.utils.HttpClientSupport;
import com.example.demo.utils.LocalVariableSyntaxSupport;
import com.example.demo.utils.NotPredicateMethodSupport;
import com.example.demo.utils.StringMethodsSupport;

@SpringBootApplication
public class DemoJava11Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJava11Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Rodando Java 11");
		
		//StringMethodsSupport.validate();
		//FileSupport.validate();
		//CollectionArraySupport.validate();
		//NotPredicateMethodSupport.validate();
		//LocalVariableSyntaxSupport.validate();
		//HttpClientSupport.validate();
		
		// 3.8. Running Java Files
		// A partir do Java 11 é possível rodar diretamente o comando java no arquivo .java
		
		// 4. Foi melhorada a performance
		// 4.1. Constantes de arquivo de classe dinâmica
		
		// 4.2. Intrínsecos Aarch64 aprimorados
		
		/* 4.3. Um coletor de lixo sem operação
		 * Um novo coletor de lixo chamado Epsilon está disponível para uso no Java 11 como um recurso experimental.

			É chamado de No-Op (sem operações) porque aloca memória, mas na verdade não coleta nenhum lixo. Assim, o Epsilon é aplicável para simular erros de falta de memória.
			
			Obviamente, o Epsilon não será adequado para um aplicativo Java de produção típico; no entanto, existem alguns casos de uso específicos em que pode ser útil:
			
			Teste de performance
			Teste de pressão de memória
			Teste de interface de VM e
			Trabalhos extremamente curtos
			Para habilitá-lo, use o sinalizador -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC .
		 */
		
		/*
		 * 4.4 Flight Recorder
		 * O Java Flight Recorder (JFR) agora é de código aberto no Open JDK , enquanto costumava ser um produto comercial no Oracle JDK. 
		 * JFR é uma ferramenta de criação de perfil que podemos usar para coletar dados de diagnóstico e criação de perfil de um aplicativo Java em execução.
		 *
		 * Para iniciar uma gravação JFR de 120 segundos, podemos usar o seguinte parâmetro:

			-XX:StartFlightRecording=duration=120s,settings=profile,filename=java-demo-app.jfr
			Podemos usar JFR em produção, pois sua sobrecarga de desempenho geralmente é inferior a 1%. 
			Decorrido o tempo, podemos acessar os dados gravados salvos em um arquivo JFR; 
			no entanto, para analisar e visualizar os dados, precisamos fazer uso de outra ferramenta chamada JDK Mission Control (JMC).
		 */
		
		/*
		 * 5. Módulos removidos e obsoletos
		 * 5.1. Java EE e CORBA
		 * 5.2. JMC e JavaFX
		 * 5.3. Módulos obsoletos
		 * 	- Mecanismo JavaScript Nashorn, incluindo a ferramenta JJS
		 * 	- Esquema de compactação Pack200 para arquivos JAR
		 */
		
		/*
		 * 6. Alterações Diversas
		 * O Java 11 introduziu mais algumas mudanças que são importantes mencionar:
			Novas implementações de cifra ChaCha20 e ChaCha20-Poly1305 substituem a cifra de fluxo RC4 insegura
			Suporte para acordo de chave criptográfica com Curve25519 e Curve448 substitui o esquema ECDH existente
			O Transport Layer Security (TLS) atualizado para a versão 1.3 traz melhorias de segurança e desempenho
			Introduziu um coletor de lixo de baixa latência, ZGC, como um recurso experimental com tempos de pausa baixos
			Suporte para Unicode 10 traz mais caracteres, símbolos e emojis
		 */
	}

}
