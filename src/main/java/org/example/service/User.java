package org.example.service;

import com.google.common.hash.BloomFilter;
import lombok.*;
import org.example.dto.Contact;

import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public abstract class User {
    private String uId;
    private String name;
    private Contact contact;
    private Trie phoneDirectory;
    private BloomFilter<String> blocked;
    private Map<String, User> contacts; // based on phone Number
    private Map<String, User> names; // based on names
    public User(String name, String number) {
        this.name = name;
        this.uId = UUID.randomUUID().toString();
        this.contact = Contact.builder().uId(UUID.randomUUID().toString()).number(number).build();
    }

    public abstract void register(String name, String number);
    public abstract void block(String number);
    public abstract void reportSpam(String number);
    public abstract void addContact(Contact contact); // add in Trie as well
    public abstract Boolean isBlocked(String nameNumber); // check in spam
}
