package jtextarea.model;

public class FindKeywordModel {
    private String text;
    private String keyword;
    private int count;

    public FindKeywordModel(){

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void findKeyword(){
        String text = this.text.replace("\n"," ");
        String[] words = text.split(" ");
        this.count = count(keyword,words);

    }
    public int count(String keyword, String[] text){
        int count = 0;
        for (String word : text){
            if (word.equals(keyword)) count ++;
        }
        return count;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
