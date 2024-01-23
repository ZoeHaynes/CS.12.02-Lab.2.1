//TODO 1
public class Phone extends ElectronicItem {
    private String networkType;
    private int screenSize;
    public String getNetworkType(){return networkType;}
    public void setNetworkType(String networkType){this.networkType=networkType;}
    public int getScreenSize(){return screenSize;}
    public void setScreenSize(int screenSize){this.screenSize=screenSize;}

    public String toString(){
        return "Phone: Name: "+getName()+", Location: "+getLocation()+", Price: "+getPrice()+", Description: "+getDescription()+", Storage Capacity: "+getStorageCapacity()+", Model:"+getModel()+", Maker: "+getMaker()+", Operating System: "+getOperatingSystem()+", Network Type: "+getNetworkType()+", Screen Size: "+getScreenSize();
    }

}
