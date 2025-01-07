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

    public String analyseMood () throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new MoodAnalysisException(MoodAnalysisError.NULL, "Mood is NULL");
            }
            if (message.trim().isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisError.EMPTY, "Mood is EMPTY");
            }
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (MoodAnalysisException e) {
            throw e;
        }

    }
}
