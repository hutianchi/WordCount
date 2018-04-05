import java.io.IOException;
import java.io.File;
import java.util.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Test;
import org.junit.runner.*;

public class  TestAssertions {
	
	private ArrayList<Word> wordtest = new ArrayList<>(); 
	private ArrayList<Word> wordtrue = new ArrayList<>(); 
	
	@Test
	 public void testAssertions() throws IOException {
		WordCount m_WordCount = new WordCount("input.txt");    //打开文件
		m_WordCount.Count();    //统计
		wordtest=m_WordCount.getWordArr();
		Word n_word1 = new Word("xc",1);
		wordtrue.add(n_word1);
		Word n_word2 = new Word("zc",1);
		wordtrue.add(n_word2);
		Word n_word3 = new Word("zxc",3);
		wordtrue.add(n_word3);
		Word n_word4 = new Word("zx",1);
		wordtrue.add(n_word4);
		
		assertEquals(wordtrue, wordtest);
		
//		
//		wordtrue.add(new Word("xc",1));
//		wordtrue.add(new Word("zc",1));
//		wordtrue.add(new Word("zxc",3));
//
//		assertEquals(wordtrue, wordtest);
	}		
	
	
}

