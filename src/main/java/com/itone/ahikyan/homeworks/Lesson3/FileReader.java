package com.itone.ahikyan.homeworks.Lesson3;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Scanner;

@Component
public class FileReader {
    private final ResourceLoader resourceLoader;

    public FileReader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void readTextFile() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:data.txt");
        Scanner scanner = new Scanner(resource.getInputStream());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
