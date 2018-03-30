import java.util.Scanner;

public class ColLesson01 {
	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		Word[] words = new Word[10];

		System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int i = 0;

		while (!input.equals("e")) {
			String[] tmp = input.split(" ");
			words[i] = new Word(tmp[0], tmp[1]);
			System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
			input = sc.nextLine();
			i++;
		}

		for (int j = 0; j < i; j++) {
			words[j].gather();
		}
		System.out.println(i+"件、登録しました。");
	}
}
