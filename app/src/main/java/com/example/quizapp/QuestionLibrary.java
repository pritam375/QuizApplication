package com.example.quizapp;

public class QuestionLibrary {
    private String mQuestions[]={
            "Which part of the plants holds it in thwe soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bess,butterflies and hummingbirds",
            "The _ holds the plant upright."
    };

    private String mChoices[][]={
            {"Roots", "Stem", "Flower"},
            {"Fruits","Leaves","Seeds"},
            {"Bark","Flower","Root"},
            {"Fruits","Leaves","Seeds"},


    };
    private String mCorrectAnswer[]={
            "Root",
            "Leaves",
            "Flower",
            "Stem"
    };
    public String getQuestion(int a){
        String question=mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0=mChoices[a][0];
        return choice0;
    };
    public String getChoice2(int a){
        String choice1=mChoices[a][1];
        return choice1;
    };
    public String getChoice3(int a){
        String choice2=mChoices[a][2];
        return choice2;
    };
    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswer[a];
        return answer;
    }

}
