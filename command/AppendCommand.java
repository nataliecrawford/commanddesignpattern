package command;

import java.util.Scanner;

public class AppendCommand extends Command{
    private Scanner in;
    public AppendCommand(Document doc){
        super(doc);
    }
    public String execute(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter what you want to append : ");
        String str= sc.nextLine();
        String append = this.document.append(str);
        return append;        
    }
    
}
