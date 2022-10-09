import command.Command;

public class WriteCommand extends Command{
    private Scanner in;

    public WriteCommand(Document doc){
        super(doc);
    }

    public String execute(){
        String write = this.doc.write();
        return write;
    }
}
