package byui.cit260.TreeOfLife.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import tree.of.life.TreeOfLife;

public abstract class View implements ViewInterface {
    private String promptMessage;
    
    protected final BufferedReader keyboard = TreeOfLife.getInFile();
    protected final PrintWriter console = TreeOfLife.getOutFile();
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
            this.console.println(this.promptMessage);
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        try{
            while (!valid) {
                this.console.println("\t\nEnter your selection below:");
            
                selection = this.keyboard.readLine();
                selection = selection.trim();
            
                if (selection.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "\n*** Invalid selection! Please try again! ***");
                    continue;
                }
                break;
            } 
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), ("Error reading input: " + e.getMessage()));
        }
        return selection;
    }
}
