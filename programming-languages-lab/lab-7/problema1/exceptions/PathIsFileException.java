package lab.problema1.exceptions;

import java.io.File;

public class PathIsFileException extends Exception{
    public PathIsFileException(File path) {
        super("The path is a File.\nName: "  + path.getName() + "\nSize: " + path.length() + " Bytes");
    }
}
