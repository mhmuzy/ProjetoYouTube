package Hitss.Treinamento.Infra;

import java.util.Scanner;
import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Repositorios.*;

public class Controller {

	public static void play() {
		try {
			
		
		System.out.println("");
		System.out.println("      Hitss Treinamento");
		System.out.println("");
		System.out.println("Prezado(a) Usuário(a), Estamos em Desenvolvimento no Momento.");
		System.out.println("");
		System.out.println("---------------------");
		System.out.println("(1) - Tocar");
		System.out.println("(2) - Não Tocar");
		System.out.println("---------------------");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		int tok = teclado.nextInt();
		System.out.println("");
		
		switch (tok) {
		case 1:
			try {
				
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			String[] titulo = new String[5];
			titulo[1] = "Chora Israel";
			titulo[2] = "O Meu Deus do Impossível";
			titulo[3] = "Chuta que é Laço";
			titulo[4] = "Não Basta ser Crente";
			
			int[] avaliacao = new int[5];
			avaliacao[1] = 100;
			avaliacao[2] = 50;
			avaliacao[3] = 800;
			avaliacao[4] = 20;
			
			int[] views = new int[5];
			views[1] = 100;
			views[2] = 50;
			views[3] = 800;
			views[4] = 20;
			
			int[] curtidas = new int[5];
			curtidas[1] = 100;
			curtidas[2] = 50;
			curtidas[3] = 800;
			curtidas[4] = 20;
			
			boolean[] reproduzindo = new boolean[5];
			reproduzindo[1] = false;
			reproduzindo[2] = false;
			reproduzindo[3] = false;
			reproduzindo[4] = false;
			
			System.out.println("Selecione a música da Playlist:");
			System.out.println("");
			System.out.println("-------------------------------------------------------------------------------");
			for (int i = 1; i <= 4; i++) {
				System.out.println("Código da Música: " + codigo[i] + " - " + " Música: " + titulo[i]);
			}
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("");
			int music = teclado.nextInt();
			
			
			System.out.println("");
			
			if (music == codigo[music]) {
				Video video = new Video(titulo[music]);
				video.setTitulo(titulo[music]);
				video.setAvaliacao(avaliacao[music]);
				video.setViews(views[music]);
				video.setCurtidas(curtidas[music]);
				
				VideoRepositorio rep = new VideoRepositorio();
				rep.play(video);
				
				System.out.println("");
				System.out.println("---------------------");
				System.out.println("(1) - Dar Pause");
				System.out.println("(2) - Dar um Curtir");
				System.out.println("---------------------");
				System.out.println("");
				int ponteiro = teclado.nextInt();
				System.out.println("");
				if (ponteiro == 1) {
					rep.pause();
				} else if (ponteiro == 2) {
					rep.like(video.getCurtidas());
				} else {
					System.out.println("");
					System.out.println("Opção Inválida");
				} 
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Opção Inválida");
			}
			break;
		case 2:
			System.out.println("");
			System.out.println("O Vídeo Continua Parado.");
			break;
		default:
			System.out.println("");
			System.out.println("Opção Inválida.");
			break;
		}
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Opção Inválida.");
		}
	}	
}
