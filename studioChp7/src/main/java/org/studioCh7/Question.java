package org.studioCh7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {

    private final String question;
    private final HashMap<Integer, Choices> choiceMap = new HashMap<>();
    private int maxResponses = 1;

    public Question(String question, Choices[] choiceArray) {
        this.question = question;
        createRandomizedChoiceMap(choiceArray);

    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choices> getChoiceMap() {
        return choiceMap;
    }

    public int getMaxResponses() {
        return maxResponses;
    }

    public void setMaxResponses(int maxResponses) {
        this.maxResponses = maxResponses;
    }

    @Override
    public abstract String toString();

    void createRandomizedChoiceMap(Choices[] choiceArray) {
        ArrayList<Choices> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choiceList);
        for (int i =0; i < choiceList.size(); i++){
            choiceMap.put(i+1, choiceList.get(i));
        }
    }

    String getFormattedChoices(){
        StringBuilder formattedChoices = new StringBuilder();
        String newline = System.lineSeparator();
        for(int choiceNum : choiceMap.keySet()){
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + newline;
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }


    public boolean isInvalid(String resp){
        try {
            int respInt = Integer.parseInt(resp);
            return respInt <= 0 || respInt > choiceMap.size();
        } catch (NumberFormatException e){
            return true;
        }

    }
}
