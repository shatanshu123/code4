
import java.util.HashMap;
import java.util.Map;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	/** Inserts a word into the trie. */
	public void insert(String s) {
		TrieNode current = root;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			TrieNode node = current.children.get(ch);
			if (node == null) {
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
		}
		current.endOfWord = true;

	}

	/** Returns if the word is in the trie. */
	public boolean search(String s) {

		TrieNode current = root;

		for (int i = 0; i < s.length(); i++) { //iterate through the word and check if its present in Trie
			char ch = s.charAt(i);
			TrieNode node = current.children.get(ch);
			if (node == null)
				return false;
			current = node;
		}

		return current.endOfWord ? true : false;

	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String s) {

		TrieNode current = root;

		for (int i = 0; i < s.length(); i++) { //iterate through the word and check if its present in Trie
			char ch = s.charAt(i);
			TrieNode node = current.children.get(ch);
			if (node == null) 
				return false;
			current = node;
		}
		return true;

	}

	public static void main(String[] args) {
		
		Trie trieObj=new Trie();
		trieObj.insert("Dog");
		trieObj.insert("Deer");
		
		System.out.println(trieObj.search("Dog"));
		System.out.println(trieObj.startsWith("Do"));
		System.out.println(trieObj.startsWith("w"));

	}

}

class TrieNode {
	Map<Character, TrieNode> children;
	boolean endOfWord;

	TrieNode() {
		children = new HashMap<Character, TrieNode>();
		endOfWord = false;
	}
}
