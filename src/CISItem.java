//TODO 1
public class CISItem {
    private String name;
    private String location;
    private int price;
    private String description;
    public String getLocation() {
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getPrice(){return price;}
    public void setPrice(int price){this.price=price;}
    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public String toString(){
        return "CIS Item: Name: "+getName()+", Location: "+getLocation()+", Price: "+getPrice()+", Description: "+getDescription();
    }

}
