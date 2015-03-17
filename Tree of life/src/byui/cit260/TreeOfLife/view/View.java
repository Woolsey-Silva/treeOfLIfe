package byui.cit260.TreeOfLife.view;

import java.util.Scanner;

public abstract class View implements ViewInterface {
    private String promptMessage;
    
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
            System.out.println(this.promptMessage);
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        while (!valid) {
            System.out.println("\t\nEnter your selection below:");
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid selection! Please try again! ***");
                continue;
            }
            break;
        }
        return selection;
    }
}
