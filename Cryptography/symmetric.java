package Cryptography;

public class symmetric {
    public static void main(String[] args) {
        // This is just a placeholder for the file.

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();

        String message = "Hello, World!";

        Cipher encryptCipher = Cipher.getInstance("AES");
        encryptCipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] cipherText = encryptCipher.doFinal(message.getBytes());
        String encryptedMessage = Base64.getEncoder().encodeToString(cipherText);
        System.out.println("Encrypted Message: " + encryptedMessage);

        Cipher decryptCipher = Cipher.getInstance("AES");
        decryptCipher.init(Cipher.DECRYPT_MODE, secretKey); 
        byte[] decryptedBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
        String decryptedMessage = new String(decryptedBytes);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}