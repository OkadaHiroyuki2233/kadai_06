 public class Word {
        public String word;
        public String meaning;

        public Word(String word, String meaning){
            this.word = word;
            this.meaning = meaning;
        }

        public String toString(){
            return "単語:" + this.word + "日本語:" + this.meaning;
        }
    }
