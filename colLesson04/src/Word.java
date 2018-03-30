 public class Word {
        //フィールド値
        public String word;
        public String meaning;
        //コンストラクタ作成
        public Word(String word,String meaning){
            this.word = word;
            this.meaning = meaning;
        }
        @Override
        public String toString() {
            return "単語：" + this.word + "　意味：" + this.meaning;
        }


    }
