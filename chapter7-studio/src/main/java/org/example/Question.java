package org.example;
import java.util.HashMap;

//public class Hashmap void QNA {
//    Hashmap<String, Boolean> qna = new HashMap<>()
//
//        }
//public Hashmap<String, Boolean> qna = new HashMap<>();
public abstract class Question {
    private final String prompt;
    //private final String answer;
    private static int nextId = 1;
    private final int id;

    HashMap<String, Boolean> qna = new HashMap<>();




    public Question(String prompt, HashMap<String, Boolean> qna) {
        this.prompt = prompt;
        this.qna = qna;
        this.id = nextId;
        nextId++;

    }

    public String getPrompt() {
        return prompt;
    }

    public int getId() {
        return id;
    }

    public String getQna(HashMap<String, Boolean> qna) {
        return String.join(",", qna.keySet());
    }

    public void setQna(HashMap<String, Boolean> qna) {
        this.qna = qna;
    }

    public String toString() {
        String newline = System.lineSeparator();
        return "ID" + id + newline +
                "Question: " + prompt + newline;
                //"Answers: " + answer + newline;
    }
    public abstract String describe();

}



