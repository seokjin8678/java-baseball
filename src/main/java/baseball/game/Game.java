package baseball.game;

public class Game {
	private Game() {
		System.out.println("숫자 야구 게임을 시작합니다.");
	}

	public static Game create() {
		return new Game();
	}

	public void start() {

	}
}
