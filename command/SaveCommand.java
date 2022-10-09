package command;
/**
 * Save command class
 * @author sara hendrix
 */
public class SaveCommand extends Command{
    private Document doc;
    /**
     * constructor of SaveCommand
     * @param doc the document being operated on
     */
    public SaveCommand(Document doc){
        super(doc);
    }
    /**
     * tells the document to save the material added
     */
    public String execute(){
        String save = this.document.save();
        System.out.println(save);
        return save;
    }
}
