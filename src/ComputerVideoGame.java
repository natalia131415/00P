// Клас "Комп'ютерна відеогра" з вкладеним класом "Гравець"
class ComputerVideoGame extends VideoGame {
    private String genre;
    private String playerName;
    private String difficultyLevel;
    private String gameMode;

    // Вкладений клас "Гравець"
    class Player {
        // Метод для відтворення гри гравцем
        public void playGame() {
            System.out.println("Player " + playerName + " is playing the computer video game.");
        }
    }

    // Конструктор класу з використанням ключового слова super
    public ComputerVideoGame(String title, String genre) {
        super(title);
        this.genre = genre;
    }

    // Встановлення інформації про гравця
    public void setPlayerInfo(String playerName, String difficultyLevel, String gameMode) {
        this.playerName = playerName;
        this.difficultyLevel = difficultyLevel;
        this.gameMode = gameMode;
    }

    // Виведення інформації про гру
    public void gameInfo() {
        System.out.println("Computer video game: " + getTitle() + ", Genre: " + genre);
        System.out.println("Player: " + playerName + ", Difficulty Level: " + difficultyLevel + ", Game Mode: " + gameMode);
    }
}
