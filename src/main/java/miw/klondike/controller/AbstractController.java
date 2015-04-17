package miw.klondike.controller;

import miw.klondike.Game;

public abstract class AbstractController {
	private Game game;

	public AbstractController(Game game) {
		super();
		this.setGame(game);
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	
	
}
