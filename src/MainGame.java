import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення інформації від користувача
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.print("Choose difficulty level (easy/medium/hard): ");
        String difficultyLevel = scanner.nextLine();

        System.out.print("Choose game mode (single/multiplayer): ");
        String gameMode = scanner.nextLine();

        // Створення об'єктів і виклик методів
        ComputerVideoGame computerGame = new ComputerVideoGame("PUBG", "Action RPG");
        computerGame.setPlayerInfo(playerName, difficultyLevel, gameMode);
        computerGame.play();
        computerGame.gameInfo();

        ComputerVideoGame.Player player1 = computerGame.new Player();
        player1.playGame();

        ConsoleVideoGame consoleGame = new ConsoleVideoGame("IT TAKES TWO", "PlayStation 4");
        consoleGame.setPlayerInfo(playerName, difficultyLevel, gameMode);
        consoleGame.play();
        consoleGame.playOnConsole();
        consoleGame.gameInfo();

        scanner.close();
    }
}
