// System.out.println はJavaの標準出力用メソッド（Rubyのputs）

// mainメソッド（プログラムで最初に呼び出されるメソッド）
	// static void main(String [] args){}
	// static void main(String... args){}

class Ready01{
	public static void main(String [] args) {
		System.out.println("文字を出力！JAVAの実行方法は、"
		+ "①javac  ファイル名でコンパイル ②java  class名");
	}
}

class Ready02{
	public static void main(String [] args) {
		System.out.println("こんにちは！");
	}
}

class Ready03{
	public static void main(String[] args){
		System.out.println("Hello, WEBCAMP!");
		System.out.println("Hello,JAVA!");
	}
}


//変数宣言
	// 型　変数名；で宣言
	// 変数名　＝　データで代入！再代入可能！

class Variable01{
	public static void main(String...args){
		int num1;
		String str1;
		num1 = 10;
		str1 ="Hello,World!";
		System.out.println(num1);
		System.out.println(str1);
		
		num1 = 20;
		System.out.println(num1);
		
		int num2 = 30;
		System.out.println(num2);
	}
}

// 定数宣言（頭にfinalを付け、全て英大文字表示）
	// 型　定数名 = 初期値;
	
class Variable02{
	public static void main(String [] args){
		final int MIN_NUMBER = 10;
		System.out.println(MIN_NUMBER);
		// 再代入エラー
		// final int MIN_NUMBER = 20;
		// System.out.println(MIN_NUMBER);
	}
}

class Variable03{
	public static void main(String...args){
		String name = "TAKANO NAGISA";
		System.out.println(name);
		
		name = "はるじゃむ";
		System.out.println(name);
		
		final int LUCKY_NUMBER = 1747;
		System.out.println(LUCKY_NUMBER);
	}
}