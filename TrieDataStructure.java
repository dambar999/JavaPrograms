import java.util.ArrayList;
import java.util.List;

class Trie{
	Trie[] children=new  Trie[26];
	boolean isEndOfWord;
	Trie(){
		for(int i=0;i<26;i++) {
			children[i]=null;
					
		}
		isEndOfWord=false;
	}
	
}


public class TrieDataStructure {
	static Trie root ;

	public static void main(String[] args) {
		
    root= new Trie();
    insertInTrie("getom");
    insertInTrie("meto");
    System.out.println(search("geto"));
	}
	public static void insertInTrie(String str){
	
		 Trie crawl= root;
		for(int i=0;i<str.length();i++) {
			int index= str.charAt(i)-'a';
			 if(crawl.children[index]==null) {
				 crawl.children[index]= new Trie();
				crawl=crawl.children[index];
			}
		}
		crawl.isEndOfWord=true;
		
	}		
	public  static boolean search(String str) {
		Trie crawl= root;
		for(int i=0;i<str.length();i++) {
			int index= str.charAt(i)-'a';
			if(crawl.children[index]==null) {
				return false;
			 }
			crawl=crawl.children[index];
		}
			
		return (crawl!=null && crawl.isEndOfWord);

	 }
	
}
