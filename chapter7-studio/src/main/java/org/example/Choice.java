package main.java.org.example;

public class Choice {
    private final String content;
    private final Boolean correct;

    public Choice(String content, Boolean correct) {
        this.content = content;
        this.correct = correct;
    }

    //second constructor to set correct to false by default
    public Choice(String content) {
        this(content, false);
    }

    public String getContent() {
        return content;
    }

    public Boolean getCorrect() {
        return correct;
    }
}
