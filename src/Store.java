//TODO 2
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.lang.reflect.Method;

public class Store {
    //TODO 4
    private ArrayList<CISItem> cisItems;

    public Store(){
        this.cisItems = new ArrayList<CISItem>();
    }

    //TODO 5
    public void addBook(Book book){
        cisItems.add(book);
    }

    //TODO 7
    public void addPhone(Phone phone){
        cisItems.add(phone);
    }

    public void addMagazine(Magazine magazine){
        cisItems.add(magazine);
    }
    public void addArduino(Arduino arduino){
        cisItems.add(arduino);
    }

    //TODO 9
    public void updatePhonesLocation(String location){
        for(int i = 0; i<cisItems.size(); i++){
            if(cisItems.get(i) instanceof Phone){
                CISItem phone = cisItems.get(i);
                phone.setLocation(location);
                cisItems.set(i,phone);
            }
        }
    }

    //TODO 10
    public ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> phoneList = new ArrayList<>();
        for(int i = 0; i<cisItems.size(); i++){
            if(cisItems.get(i) instanceof Phone){
                phoneList.add((Phone) cisItems.get(i));
            }
        }

        return phoneList;

    }
    //TODO 12
    public <T> ArrayList<T> getItems(String itemType) throws ClassNotFoundException {
        ArrayList<T> itemList = new ArrayList<>();
        itemType = itemType.substring(0,1).toUpperCase()+itemType.substring(1);
        Class c = Class.forName(itemType);
        for(int i = 0; i<cisItems.size(); i++){
            CISItem thisItem = cisItems.get(i);
            if(c.isInstance(thisItem)){
                itemList.add((T) cisItems.get(i));
            }
        }

        return itemList;


    }

    //TODO 14
    public void updateItems(String itemType, String property, String value) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        boolean isInt = false;
        itemType = itemType.substring(0,1).toUpperCase()+itemType.substring(1);
        Class c = Class.forName(itemType);
        String[] splitProperty = property.split(" ");
        property = "";
        for(int i = 0; i<splitProperty.length;i++){
            splitProperty[i]=splitProperty[i].substring(0,1).toUpperCase()+splitProperty[i].substring(1);
            property+=splitProperty[i];
        }
        String setter = "set"+property;
        Method method = null;
        try {
            method = c.getMethod(setter, String.class);
        } catch(NoSuchMethodException e){
            try{
                method = c.getMethod(setter,int.class);
                isInt = true;
            } catch(NoSuchMethodException ex){
            }
        }

        for(int i = 0; i<cisItems.size(); i++){
            if(c.isInstance(cisItems.get(i))){
                CISItem item = cisItems.get(i);
                if(method!=null && !isInt) {
                    method.invoke(item, value);
                }
                else if(method!=null && isInt){
                    method.invoke(item,Integer.parseInt(value));
                }
                cisItems.set(i,item);
            }
        }



    }

    //TODO 16
    public void showAllInfo(){
        for(int i = 0; i<cisItems.size();i++){
            System.out.println(cisItems.get(i));
        }
    }

    public void addItem(CISItem cisItem){
        cisItems.add(cisItem);
    }



}
