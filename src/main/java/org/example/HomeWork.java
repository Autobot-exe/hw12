package org.example;


import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Решить задачу https://codeforces.com/problemset/problem/1324/C
     */
    @SneakyThrows
    public void frogSteps(InputStream in, OutputStream out) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintStream writer = new PrintStream(out);

        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String s = reader.readLine();
            List<Integer> positions = new ArrayList<>();
            positions.add(0);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    positions.add(i + 1);
                }
            }

            positions.add(s.length() + 1);

            int maxDistance = 0;

            for (int i = 0; i < positions.size() - 1; i++) {
                maxDistance = Math.max(maxDistance, positions.get(i + 1) - positions.get(i));
            }

            writer.println(maxDistance);
        }

        writer.close();
        reader.close();
    }
}