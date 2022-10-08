package command;

/**
 * Append Command Class
 * @author Natalie Crawford
 */

import java.util.Scanner;

public class AppendCommand extends Command{
    private Scanner in;

    /**
     * Default constructor for appendcommand
     * @param doc the document that will be added to
     */
    public AppendCommand(Document doc){
        super(doc);
    }

    /**
     * executes the append action, by asking what to add 
     * and returning if it was or not
     * @return the value of document.append
     */
    public String execute(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter what you want to append : ");
        String str= in.nextLine();
        String append = this.document.append(str);
        in.close();
        return append;        
    }
}
