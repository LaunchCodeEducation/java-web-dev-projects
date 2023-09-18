package org.studioCh7;

public class Choices {
    private final String content;
    private final boolean correct;

    public Choices(String content, boolean correct) {
        this.content = content;
        this.correct = correct;
    }

    public Choices(String content){
        this(content, false);
    }

    public String getContent() {
        return content;
    }

    public boolean isCorrect() {
        return correct;
    }
}
