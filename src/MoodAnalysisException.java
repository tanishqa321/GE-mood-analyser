public class MoodAnalysisException extends Exception {
    private final MoodAnalysisError error;

    public MoodAnalysisException(MoodAnalysisError error, String message){
        super(message);
        this.error = error;
    }
}
