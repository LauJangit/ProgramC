package cn.jangit.programc.Tool.TopicInterpreter;

/**
 * Created by jangitlau on 2017/5/25.
 */

public class Topic {
    static class Question {
        String question;

        public Question(String question) {
            this.question = question;
        }

        public String getQuestion() {
            return question;
        }
    }

    static class Answer {
        String answer;
        boolean isCorrect;

        public Answer(String answer, boolean isCorrect) {
            this.answer = answer;
            this.isCorrect = isCorrect;
        }

        public String getAnswer() {
            return answer;
        }

        public boolean isCorrect() {
            return isCorrect;
        }
    }
}
