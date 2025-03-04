package org.example.service.Impl;


import org.example.Utils.GlobalSpam;
import org.example.dto.Contact;
import org.example.service.User;
import org.example.service.Trie;

public class UserImpl extends User {
    public UserImpl(String name, String number) {
        super(name, number);
        setPhoneDirectory(new TrieImpl());
    }

    @Override
    public void register(String name, String number) {

    }

    @Override
    public void block(String number) {

    }

    @Override
    public void reportSpam(String number) {
        GlobalSpam.INSTANCE.insertSpam(number);
    }

    @Override
    public void addContact(Contact contact) {

    }

    @Override
    public Boolean isBlocked(String nameNumber) {
        return null;
    }
}
