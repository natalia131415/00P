// Клас, який наслідується від батьківського та містить додатковий метод
class ConsoleVideoGame extends VideoGame {
    private String platform;
    private String playerName;
    private String difficultyLevel;
    private String gameMode;

    // Конструктор класу з використанням ключового слова super
    public ConsoleVideoGame(String title, String platform) {
        super(title);
        this.platform = platform;
    }

    // Встановлення інформації про гравця
    public void setPlayerInfo(String playerName, String difficultyLevel, String gameMode) {
        this.playerName = playerName;
        this.difficultyLevel = difficultyLevel;
        this.gameMode = gameMode;
    }

    // Метод для відтворення гри на консолі
    public void playOnConsole() {
        System.out.println("Playing video game on " + platform + " console.");
    }

    // Виведення інформації про гру
    public void gameInfo() {
        System.out.println("Console video game: " + getTitle() + ", Platform: " + platform);
        System.out.println("Player: " + playerName + ", Difficulty Level: " + difficultyLevel + ", Game Mode: " + gameMode);
    }
}
