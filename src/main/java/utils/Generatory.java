package utils;

import java.util.Random;

public class Generatory {
    public static String generateRandomString(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
    public static int generateRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
