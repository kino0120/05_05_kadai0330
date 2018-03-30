public class Word {
    //フィールド値
    private String word;
    private String meaning;
//コンストラクタ作成
    public Word(String word,String meaning){
        this.word = word;
        this.meaning = meaning;
    }


    public void gather(){
        System.out.println("単語：" + this.word + " " + "意味：" + this.meaning);
    }

    public void setWord(){
        this.word = word;
    }
    public void setMeaning(){
        this.meaning = meaning;
    }


}
