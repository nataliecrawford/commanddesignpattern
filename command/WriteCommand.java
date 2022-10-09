package command;
import java.util.Scanner;
/**
 * Write Command class
 * @author sara hendrix
 */
public class WriteCommand extends Command{
    private Scanner in;
    /**
     * WriteCommand constructor
     * @param doc document being operated on
     */
    public WriteCommand(Document doc){
        super(doc);
    }
    /**
     * gets the line being written by the user, calls the document to write 
     */
    public String execute(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter what you want to write : ");
        String line= in.nextLine();
        String write = this.document.write(line);
        System.out.println(write);
        return write;
    }
}
