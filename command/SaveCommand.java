import command.Command;

public class SaveCommand extends Command{
    public SaveCommand(Document doc){
        super(doc);
    }

    public String execute(){
        String save = this.doc.save();
        return save;
    }
}
