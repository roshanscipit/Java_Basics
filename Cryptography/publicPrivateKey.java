    package Cryptography;
    import java.security.KeyPair;
    import java.security.KeyPairGenerator;  
    import java.security.PrivateKey;
    import java.security.PublicKey;
    import javax.crypto.Cipher;
    import java.util.Base64;

    public class publicPrivateKey {
        public static void main(String[] args) throws Exception {
            // This is just a placeholder for the file.

            KeyPairGenerator keygen = KeyPAirGenerator.getInstance("RSA");
            keygen.initialize(2048);
            KeyPair keypair = keygen.generateKeyPair();
            PublicKey publicKey = keypair.getPublic();
            PrivateKey privateKey = keypair.getPrivate();
            System.out.println("Public Key: " + publicKey);
            System.out.println("Private Key: " + privateKey);

            //encryption
            String message = "Hello, World!";

            Cipher encryptCipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] cipherText = encryptCipher.doFinal(message.getBytes());
            String encryptedMessage = Base64.getEncoder().encodeToString(cipherText);
            System.out.println("Encrypted Message: " + encryptedMessage);

            Cipher decryptCipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] decryptedBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
            String decryptedMessage = new String(decryptedBytes);
            System.out.println("Decrypted Message: " + decryptedMessage);   

          
        }
    }