//made by Evan Belcourt
package myfirstandroidgame;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
public class SimpeGameEngine {
// gameView will be the view of the game
// It will also hold the logic of the game
// and respond to screen touches s well
	GameView gameView;
	
	@Override
	protected void onCreate(bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 
        // Initialize gameView and set it as the view
        gameView = new GameView(this);
        setContentView(gameView);
	}
	//Gameview will go here 
	
	//more SimpleGameEngine methods will go here
	class GameView extends SurfaceView implements Runable{
		
	}
}
