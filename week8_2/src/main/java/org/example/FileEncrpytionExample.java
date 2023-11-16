package org.example;

import org.jasypt.encryption.pbe.StandardPBEByteEncryptor;
import org.jasypt.salt.StringFixedSaltGenerator;
import java.io.*;


public class FileEncrpytionExample {
    public static void main(String[] args) throws IOException {
        String encryptedOutputFilePath = "encrypted_abc.txt";
        String decryptedOutputFilePath = "decrypted_abc.txt";

        final String PW = "12341234";
        final String ALGORITHM = "PBEWithMD5AndDES";
        final String SALT_GENERATOR = "someFixedSalt";

        StandardPBEByteEncryptor encryptor = new StandardPBEByteEncryptor();
        encryptor.setPassword(PW);
        encryptor.setAlgorithm(ALGORITHM);
        encryptor.setSaltGenerator(new StringFixedSaltGenerator(SALT_GENERATOR));

        // String text = encryptor.decrypt(readTextFile(encryptedOutputFilePath));

        // System.out.println(text);
    }

    private static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
