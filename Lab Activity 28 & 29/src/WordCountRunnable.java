/*
Name: Shriman Selvamani, Hickson Frimpong, Edward Lue, Yash Kolli
Computing ID: ss5qt, haf3md , eyl4qaq, ysk6dw
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.locks.*;



/**
   Counts how many words in a file.
 */
public class WordCountRunnable implements Runnable{
    private String filename;
    private static int threadCount = 0;
    private static int combinedWordCount = 0;
    private Lock myLock;
    
    /**
      Constructs a WordCountRunnable object with a file name.
      @param aFilename the file name that needs to count words
     */
    public WordCountRunnable(String aFilename) {
        filename = aFilename;
        myLock = new ReentrantLock();
    }

    public void run() {
    	myLock.lock();
    	threadCount++;
        //add your code here:
    	boolean fileFound = true;
    	int count = 0;
    	try {
    		Scanner myScanner = new Scanner(new FileInputStream(this.filename));
        	while(myScanner.hasNext()) {
        		myScanner.next();
        		count++;
        	}
        	myScanner.close();
    	} catch (FileNotFoundException e) {
			System.out.println(this.filename+" was not found");
			fileFound = false;
			threadCount--;
			
		}
    	finally {
    		if(fileFound) {
    			combinedWordCount+=count;
        		System.out.println(this.filename +": " + count);
        		threadCount--;
        	}
        	if(threadCount==0) {
        		System.out.println("total word count is: "+combinedWordCount);
        	}
        	myLock.unlock();
    	}
        // hints:
        // initialize a counter
        // create Scanner - can use, ... new Scanner(new FileInputStream(filename))
        // don't forget try-catch	  
        // while loop 
        //      count individual words
        // what are you going to catch??
        // print statement of the format:  filename: wordCount
    }
}