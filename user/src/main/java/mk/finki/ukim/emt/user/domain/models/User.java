package mk.finki.ukim.emt.user.domain.models;

import mk.finki.ukim.emt.user.valueobject.SecurePassword;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String address;
    private String email;
    private SecurePassword password;
    private int role;
}
