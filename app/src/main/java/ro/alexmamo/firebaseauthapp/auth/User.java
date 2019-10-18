package ro.alexmamo.firebaseauthapp.auth;

import com.google.firebase.firestore.Exclude;

import java.io.Serializable;

public class User implements Serializable {
    public String uid;
    public String name;
    @SuppressWarnings("WeakerAccess")
    public String email;
    @Exclude
    public boolean isAuthenticated;
    @Exclude
    boolean isNew, isCreated;

    public User() {}

    User(String uid, String name, String email) {
        this.uid = uid;
        this.name = name;
        this.email = email;
    }
}