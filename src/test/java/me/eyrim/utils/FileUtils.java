package me.eyrim.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtils {
    public String[] readFileToArray(final String path) {
        final ArrayList<String> lines = new ArrayList<>();

        try (final Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (IOException error) {
            throw new RuntimeException(error);
        }

        return lines.toArray(String[]::new);
    }
}
