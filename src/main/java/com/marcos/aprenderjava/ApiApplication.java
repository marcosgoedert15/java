package com.marcos.aprenderjava;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ApiApplication.class, args);
		bird blue = new curio();
		PhaseOne(blue);
	}
	public static void PhaseOne(bird player) {
		Logger.message("nome do passaro " + player.getName());
		player.eat(5);
		Logger.message("passaro cagao " + player.getShitAmount());
		Logger.message("esta voando " + player.getFlyingStatus());
		player.fly();
		Logger.message("esta voando " + player.getFlyingStatus());
		var shitAmount = player.getShitAmount();
		for (int i = 0; i < shitAmount; i++) {
			player.shit();
			Logger.message("passaro cagao  " + player.getShitAmount());
		}
		player.eat(3);
		Logger.message("passaro cagao  " + player.getShitAmount());
		player.land();
		Logger.message("esta voando " + player.getFlyingStatus());
		player.eat(6);
		Logger.message("passaro cagao  " + player.getShitAmount());
		Logger.message("passaro colocou  " + player.layEggs());
	}
}
