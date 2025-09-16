package myapp.helpers;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.*;     // Noncompliant - package is imported twice
import java.lang.Runnable;  // Noncompliant - java.lang is imported by default

public class FileHelper {
    public static String readFirstLine(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath)).get(0);
    }
}
