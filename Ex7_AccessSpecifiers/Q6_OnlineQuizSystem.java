abstract class Question {
    private String questionText;
    private String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    protected boolean checkAnswer(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }

    public void displayQuestion() {
        System.out.println("Q: " + questionText);
    }
}

class MCQ extends Question {
    public MCQ(String q, String answer) { super(q, answer); }
    public boolean validate(String userAnswer) { return checkAnswer(userAnswer); }
}

class TrueFalse extends Question {
    public TrueFalse(String q, String answer) { super(q, answer); }
    public boolean validate(String userAnswer) { return checkAnswer(userAnswer); }
}

class ShortAnswer extends Question {
    public ShortAnswer(String q, String answer) { super(q, answer); }
    public boolean validate(String userAnswer) { return checkAnswer(userAnswer); }
}

class QuizManager {
    // non-static inner class to manage a quiz session
    class QuizSession {
        private Question[] questions;
        private String[] userAnswers;
        private int score = 0;

        QuizSession(Question[] questions, String[] userAnswers) {
            this.questions = questions;
            this.userAnswers = userAnswers;
        }

        void runSession() {
            for (int i = 0; i < questions.length; i++) {
                questions[i].displayQuestion();
                boolean correct;
                if (questions[i] instanceof MCQ) {
                    correct = ((MCQ) questions[i]).validate(userAnswers[i]);
                } else if (questions[i] instanceof TrueFalse) {
                    correct = ((TrueFalse) questions[i]).validate(userAnswers[i]);
                } else {
                    correct = ((ShortAnswer) questions[i]).validate(userAnswers[i]);
                }
                System.out.println("Your answer: " + userAnswers[i] + " -> " + (correct ? "Correct" : "Wrong"));
                if (correct) score++;
            }
            System.out.println("Final Score: " + score + "/" + questions.length);
        }
    }
}

public class Q6_OnlineQuizSystem {
    public static void main(String[] args) {
        Question[] questions = {
            new MCQ("Capital of France? (a)Paris (b)Rome", "Paris"),
            new TrueFalse("Java is platform independent? (True/False)", "True"),
            new ShortAnswer("What keyword is used for inheritance?", "extends")
        };
        String[] userAnswers = {"Paris", "True", "extends"};

        QuizManager manager = new QuizManager();
        QuizManager.QuizSession session = manager.new QuizSession(questions, userAnswers);
        session.runSession();
    }
}
