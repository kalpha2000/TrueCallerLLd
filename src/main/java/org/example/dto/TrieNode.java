package org.example.dto;

import java.util.ArrayList;
import java.util.List;

public class TrieNode {
    static private final Integer ARRAY_SIZE = 256;

    private List<TrieNode> children;
    private Boolean isLeaf;
    private String character;

    public TrieNode(String character) {
        this.children = new ArrayList<>(ARRAY_SIZE);
        this.character = character;
    }

    public TrieNode getChildren(int index) {
        return children.get(index);
    }

    public void setChildren(List<TrieNode> children) {
        this.children = children;
    }

    public Boolean getLeaf() {
        return isLeaf;
    }

    public void setLeaf(Boolean leaf) {
        isLeaf = leaf;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
