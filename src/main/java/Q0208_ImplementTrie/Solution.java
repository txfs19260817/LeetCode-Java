package Q0208_ImplementTrie;

import java.util.Arrays;
import java.util.List;

class Trie {

    private final List<Trie> children;
    private boolean isEnd;

    public Trie() {
        this.children = Arrays.asList(new Trie[26]);
        this.isEnd = false;
    }

    public void insert(String word) {
        Trie p = this;
        for (int i = 0; i < word.length(); i++) {
            int j = word.charAt(i) - 'a';
            if (p.children.get(j) == null) {
                p.children.set(j, new Trie());
            }
            p = p.children.get(j);
        }
        p.isEnd = true;
    }

    public boolean search(String word) {
        Trie p = this;
        for (int i = 0; i < word.length(); i++) {
            int j = word.charAt(i) - 'a';
            if (p.children.get(j) == null) {
                return false;
            }
            p = p.children.get(j);
        }
        return p.isEnd;
    }

    public boolean startsWith(String prefix) {
        Trie p = this;
        for (int i = 0; i < prefix.length(); i++) {
            int j = prefix.charAt(i) - 'a';
            if (p.children.get(j) == null) {
                return false;
            }
            p = p.children.get(j);
        }
        return true;
    }
}