//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Using the parameterized constructor
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        String result1 = moodAnalyser1.analyseMood();
        System.out.println("Message: " + moodAnalyser1.getMessage() + " | Mood: " + result1);

        // Using the default constructor and setting the message later
        MoodAnalyser moodAnalyser2 = new MoodAnalyser();
        moodAnalyser2.setMessage("I am in Any Mood");
        String result2 = moodAnalyser2.analyseMood();
        System.out.println("Message: " + moodAnalyser2.getMessage() + " | Mood: " + result2);

    }
}