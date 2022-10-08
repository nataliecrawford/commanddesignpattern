package command;
/**
 * View Command Class
 * @author Natalie Crawford
 */

public class ViewCommand extends Command {
    /**
     * calls the view command constructor
     * @param doc the document that will be viewed
     */
    public ViewCommand(Document doc){
        super(doc);
    }

    /**
     * executes the desired action
     * @return returns the visual representation of the document
     */
    public String execute(){
        String view = this.document.view();
        return view;
    } 
}
