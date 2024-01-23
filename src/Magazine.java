//TODO 1
public class Magazine extends ReadingItem{
    private String coverStoryTitle;
    private String printDate;
    public String getCoverStoryTitle(){return coverStoryTitle;}
    public void setCoverStoryTitle(String coverStoryTitle){this.coverStoryTitle=coverStoryTitle;}
    public String getPrintDate(){return printDate;}
    public void setPrintDate(String printDate){this.printDate=printDate;}

    public String toString(){
        return "Magazine: Name: "+getName()+", Location: "+getLocation()+", Price: "+getPrice()+", Description: "+getDescription()+", Word Count: "+getWordCount()+", Date Published: "+getDatePublished()+", Author: "+getAuthor()+", Cover Story Title: "+getCoverStoryTitle()+", Print Date: "+getPrintDate();
    }

}
