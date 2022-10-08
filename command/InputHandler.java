package command;

import java.util.HashMap;

/**
 * Class that handles the inputs of the user
 * @author Harvey Villanueva
 */
public class InputHandler {

    // instance vars

    private HashMap<String, Command> commands = new HashMap<String, Command>();

    // methods

    /**
     * Constructor for the InputHandler class
     * @param document The document to edit
     */
    public InputHandler(Document document) {
        /*
         * The execute command might be wrong
         * because I can't test it without the
         * specific commands being made lol
         */

        // create new instances of the commands themselves
        Command viewCommand = new ViewCommand(document);
        Command appendCommand = new AppendCommand(document);
        Command writeCommand = new WriteCommand(document);
        Command saveCommand = new SaveCommand(document);

        // add those commands into the hashmap
        commands.put("view", viewCommand);
        commands.put("append", appendCommand);
        commands.put("write", writeCommand);
        commands.put("save", saveCommand);
    }

    /**
     * Checks if the key is in the hashmap, if so execute the command 
     * @param data The input from the user
     */
    public void inputEntered(String data) {
        // for some reason, you have to use a for-each loop for hashmaps
        for (String i : commands.keySet()) { // looping through the keys
            if (data.equals(i)) { // checking if data equal to the key
                // execute the key's corresponding command
                commands.get(i).execute();
            }
        }
    }

    // apparently i need two commits, but i did it all in one commit, so here's a comment
}
