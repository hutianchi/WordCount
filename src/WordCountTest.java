import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class WordCountTest {

	private ArrayList<Word> wordtest = new ArrayList<>(); 
	private ArrayList<Word> wordtrue = new ArrayList<>(); 
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCount() throws IOException {
		
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
	}

	@Test
	public void testCount2() throws IOException {
		
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
	}
	
}
