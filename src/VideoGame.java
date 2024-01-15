// Батьківський клас "Відеогра"
class VideoGame {
    private String title;

    // Конструктор класу з використанням ключового слова super
    public VideoGame(String title) {
        this.title = title;
    }

    // Геттер для отримання значення title
    public String getTitle() {
        return title;
    }

    // Метод для відтворення гри
    public void play() {
        System.out.println("Playing video game: " + title);
    }
}
