package command;

/**
 * Abstract Base Class that controls the commands of the user
 * @author Harvey Villanueva
 */
public abstract class Command {

    // instance vars

    protected Document document;

    // methods

    /**
     * The constructor for the document program
     * @param document The document to be edited
     */
    public Command(Document document) {
        this.document = document;
    }

    /**
     * Every class that inherits this has a command execution method
     * @return String A string representation of the result
     */
    public abstract String execute();
}
