//TODO 1
public class ReadingItem extends CISItem {
    private int wordCount;
    private String datePublished;
    private String author;
    public int getWordCount(){return wordCount;}
    public void setWordCount(int wordCount){this.wordCount=wordCount;}
    public String getDatePublished(){return datePublished;}
    public void setDatePublished(String datePublished){this.datePublished=datePublished;}
    public String getAuthor(){return author;}
    public void setAuthor(String author){this.author=author;}
    public String toString(){
        return "Reading Item: Name: "+getName()+", Location: "+getLocation()+", Price: "+getPrice()+", Description: "+getDescription()+", Word Count: "+getWordCount()+", Date Published: "+getDatePublished()+", Author: "+getAuthor();
    }

}
