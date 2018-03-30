import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04{

        public static void main(String[] args) {
            ArrayList<Word> words = new ArrayList<>();

            System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int i = 0;


            while (!input.equals("e")) {
                String[] tmp = input.split(" ");
                words.add(new Word(tmp[0],tmp[1]));
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
                if(i==9){
                    System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
                    for (int j = 0; j <= i; j++) {
                        System.out.println(words.get(j));
                    }
                    System.out.println("10件、登録しました。");
                }
                input = sc.nextLine();
                i++;

            }
            for (int j = 0; j < i; j++) {
                System.out.println(words.get(j));
            }
            System.out.println(i+"件、登録しました。");


        }
    }

