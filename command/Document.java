package command;

import java.util.ArrayList;

public class Document {
    
    private String fileName;
    private ArrayList<String> lines;

    public Document(String fileName) {
        this.fileName = fileName;     
        lines = FileManipulator.readFile(fileName);
    }

    /**
     * Views the lines in a document and returns the string version of those lines.
     * @return the string of the lines (formatted correctly)
     */
    public String view() {
        String str = ""; 
        int length = findLongest() + 12;
        for(int i = 0; i < length; i++) {
            str += "_";
        }

        for(int i = 0; i < lines.size(); i++) {
            str += "\n|     " + lines.get(i);
            for(int j = 6 + lines.get(i).length(); j < length; j++) {
                str += " ";
            }
        }
        
        str += "\n";
        for(int i = 0; i < length; i++) {
            str += "_";
        }
        return str;
    }

    /**
     * Finds the longest line in the array list
     * @return the length of the longest line
     */
    private int findLongest() {
        int length = 0;
        for(int i = 0; i < lines.size(); i++) {
            if(lines.get(i).length() > length) {
                length = lines.get(i).length();
            }
        }
        return length;
    }

    /**
     * Adds a line to the list.
     * @param line the line to add to the list
     * @return the success of the method
     */
    public String append(String line) {
        lines.add(line);
        return "The line has been appended to the document";
    }

    /**
     * Clears out the list and adds the new line to it
     * @param line the line to add
     * @return the success of the method
     */
    public String write(String line) {
       lines.clear();
       lines.add(line);
       return "The line was written to the file";
    }

    /**
     * Writes the file out using the file manipulator
     * @return if the file has been successfully saved or not
     */
    public String save() {
        if(FileManipulator.writeFile(fileName, lines)) {
            return "The File has been saved";
        }
        return "Sorry, we cannot save the file at this time.";
    }
}
