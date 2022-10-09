package command;

import java.util.Scanner;

public class docCheck {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a file name");
        String docName = in.nextLine().toLowerCase().trim();
        
        Document doc = new Document(docName);

        System.out.println(doc.view());

        System.out.println("Enter a line to append:");
        doc.append(in.nextLine().toLowerCase().trim());

        System.out.println(doc.view());

        System.out.println("Enter a line to write a file:");
        doc.write(in.nextLine().toLowerCase().trim());

        System.out.println(doc.view());

        System.out.println("Saving file");
        doc.save();        

    }
}
