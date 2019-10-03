package ASSIGNMENTClasses;
import TE1.Printer;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class abstractAssignment {
    private String assignmentName;
    private  final String  ASSIGNMENTSPATH;

    protected abstractAssignment() {
        ASSIGNMENTSPATH = System.getProperty("user.dir")+"\\ASSIGNMENT\\";
    }

    public abstract boolean RunASSIGNMENT();
    protected boolean PrintAssignmentAsText(){
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(ASSIGNMENTSPATH+assignmentName+".txt"), StandardCharsets.UTF_8)) {
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        Printer.ANSI_PURPLE(String.valueOf(sb));
        return true;
    }
    public String getAssignmentName() {
        return assignmentName;
    }
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }
    protected  void PrintAssignmentName(){
        Printer.ANSI_RED(assignmentName);
    }

    protected void Exit() {
        Printer.RED_BRIGHT("Exit from "+getAssignmentName());
    }
}
