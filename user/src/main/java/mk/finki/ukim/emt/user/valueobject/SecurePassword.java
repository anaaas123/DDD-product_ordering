package mk.finki.ukim.emt.user.valueobject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecurePassword {
    private String hashedPassword;

    public SecurePassword(String plainTextPassword) {
        this.hashedPassword = hashPassword(plainTextPassword);
    }

    private String hashPassword(String plainTextPassword) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(plainTextPassword.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getHashedPassword() {
        return hashedPassword;
    }
}

