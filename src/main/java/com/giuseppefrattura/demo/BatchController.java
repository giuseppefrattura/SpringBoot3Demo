package com.giuseppefrattura.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@RestController
public class BatchController {
    @GetMapping("/cloneDB")
    public String executeScript() {
        try {
            Process process = Runtime.getRuntime().exec("/bin/sh /path/to/your/script.sh");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            StringBuilder output = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            return output.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}


