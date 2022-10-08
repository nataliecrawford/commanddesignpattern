package command;

public class ViewCommand extends Command {

    private Document doc;
    
    public ViewCommand(Document doc){
        super(doc);
        this.doc = doc;
    }
    
    public String execute(){
        String view = doc.view();
        return view;
    }
    

    
}
