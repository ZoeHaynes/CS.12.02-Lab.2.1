//TODO 1
public class Arduino extends ElectronicItem{
    private String version;
    public String getVersion(){return version;}
    public void setVersion(String version){this.version=version;}

    public String toString() {
        return "Arduino: Name: " + getName() + ", Location: " + getLocation() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Storage Capacity: " + getStorageCapacity() + ", Model:" + getModel() + ", Maker: " + getMaker() + ", Operating System: " + getOperatingSystem() + ", Version: "+getVersion();
    }
}
