package Hitss.Treinamento.Repositorios;

import Hitss.Treinamento.Infra.*;
import Hitss.Treinamento.Classes.*;

public class VideoRepositorio implements IAcoesVideo {

	@Override
	public void play(Video video) {
		System.out.println("");
		System.out.println("Tocando a Música: " + video.getTitulo());
		System.out.println("--------------------------------------------");
		System.err.println("Avaliações: " + video.getAvaliacao());
		System.out.println("Visualizações: " + video.getViews());
		System.out.println("Curtidas: " + video.getCurtidas());
		System.out.println("--------------------------------------------");
		video.setReproduzindo(true);
		System.out.println("Reproduzindo ...");
	}

	@Override
	public void pause() {
		System.out.println("");
		System.out.println("Video Pausado ||");
	}

	@Override
	public void like(int curt) {
		curt++;
		System.out.println("");
		System.out.println("O Nº de curtidas desse vídeo foi para: " + curt);
	}

}
