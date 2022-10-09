package command;
import java.util.Scanner;
public class WriteCommand extends Command{
    private Scanner in;

    public WriteCommand(Document doc){
        super(doc);
    }

    public String execute(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter what you want to write : ");
        String line= in.nextLine();
        String write = this.document.write(line);
        return write;
    }
}
