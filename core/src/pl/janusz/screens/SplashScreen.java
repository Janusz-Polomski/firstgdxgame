package pl.janusz.screens;

import com.badlogic.gdx.graphics.Texture;

import pl.janusz.FirstGame;

public class SplashScreen extends AbstractScreen{
	
	private Texture splashImg;

	public SplashScreen(FirstGame game) {
		super(game);
		init();
	}

	private void init() {
		//TODO implement better assets loading when game grows
		splashImg = new Texture("badlogic.jpg");
	}

	@Override
	public void render(float delta) {
		super.render(delta);
		
		spriteBatch.begin();
		spriteBatch.draw(splashImg, 0,0);
		spriteBatch.end();
	}
}
