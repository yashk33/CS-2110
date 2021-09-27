public class WordCount extends Thread {
	
	public static void main(String[] argv) {
		String[] list = {"src/BramStoker-Dracula.txt", "src/shakespeare-hamlet.txt"};
		countFiles(list);
	}
	
	public static void countFiles(String[] args){
		for (int i = 0; i < args.length; i++) {
			WordCountRunnable wcr = new WordCountRunnable(args[i]);
			Thread t = new Thread(wcr);
			t.start();
		}
	}
}