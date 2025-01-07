public class MoodAnalyser {
    private String message;

    // Default constructor
    public MoodAnalyser() {
    }

    // Parameterized constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message != null &&  message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
