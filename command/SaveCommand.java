package command;
public class SaveCommand extends Command{
    private Document doc;

    public SaveCommand(Document doc){
        super(doc);
    }

    public String execute(){
        String save = this.document.save();
        System.out.println(save);
        return save;
    }
}
