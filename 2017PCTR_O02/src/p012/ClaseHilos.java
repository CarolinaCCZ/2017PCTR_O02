package p012;

import java.util.concurrent.TimeUnit;

public class ClaseHilos extends Thread {
	
	protected  Board board;
	protected Ball ball;
	
	public ClaseHilos(Ball ball, Board board) {
		this.board = board;
		this.ball = ball;
	}

	public void run() {
		try {
			while (true) {
				ball.move();
				board.repaint();

				TimeUnit.MILLISECONDS.sleep(1000); // Un segundo
			}
		} catch (InterruptedException e) {
			System.err.println("Interrumpido");
		}

	}
}