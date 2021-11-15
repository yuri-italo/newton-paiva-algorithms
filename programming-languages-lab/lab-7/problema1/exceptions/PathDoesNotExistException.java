package lab.problema1.exceptions;

import java.io.File;

public class PathDoesNotExistException extends Exception{
    public PathDoesNotExistException(File path) {
        super("Path: " + path.getAbsolutePath() + " DOES NOT exist.");
    }
}
