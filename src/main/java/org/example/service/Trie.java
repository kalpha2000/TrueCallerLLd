package org.example.service;

import org.example.dto.TrieNode;

import java.util.List;

abstract public class Trie {
    TrieNode root;

    abstract public void insert(String key);
    abstract public Boolean get(String key);
    abstract public List<String> getPrefix(String key);
    abstract public void deleteKey(String key);
}
