package Cryptography;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MessageDigestFunc {
    
    
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // This is just a placeholder for the file.

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest("Hello, World!".getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        System.out.println("SHA-256 Hash: " + hexString.toString());
    }
} 