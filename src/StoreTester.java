//TODO 3
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StoreTester {
    private Store store;
    private Book book;
    private Book book1;
    private Magazine mag;
    private Magazine mag1;
    private Arduino ard;
    private Arduino ard1;
    private Phone phone;
    private Phone phone1;
    private Phone phone2;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        store = new Store();
        book = new Book();
        book1 = new Book();
        phone = new Phone();
        phone1 = new Phone();
        phone2 = new Phone();
        mag = new Magazine();
        mag1 = new Magazine();
        ard = new Arduino();
        ard1 = new Arduino();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        store = null;
        book = null;
        book1=null;
        phone = null;
        phone1=null;
        phone2=null;
        mag=null;
        mag1=null;
        ard=null;
        ard1=null;

    }

    //TODO 6
    @org.junit.jupiter.api.Test
    void addBookTest() {
        store.addBook(book);
        assertTrue(true);

    }

    //TODO 8
    @org.junit.jupiter.api.Test
    void addBookPhoneTest(){
        store.addBook(book);
        store.addPhone(phone);
        assertTrue(true);

    }


    //TODO 11
    @org.junit.jupiter.api.Test
    void testUpdateLocationGetPhone(){
        store.addBook(book);
        store.addPhone(phone);
        store.addPhone(phone1);
        store.addPhone(phone2);
        store.updatePhonesLocation("Room 514");
        ArrayList<Phone> phoneList = store.getAllPhones();
        for(int i = 0; i<phoneList.size(); i++){
            assertEquals("Room 514",phoneList.get(i).getLocation());
        }
    }

    //TODO 13
    @org.junit.jupiter.api.Test
    void getItemsTest() throws ClassNotFoundException {
        store.addBook(book);
        store.addBook(book1);
        store.addPhone(phone);
        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addArduino(ard);
        store.addArduino(ard1);
        store.addMagazine(mag);
        store.addMagazine(mag1);

        ArrayList<Book> expectedListBook = new ArrayList<>();
        expectedListBook.add(book);
        expectedListBook.add(book1);
        assertEquals(expectedListBook,store.getItems("book"));

        ArrayList<Phone> expectedListPhone = new ArrayList<>();
        expectedListPhone.add(phone);
        expectedListPhone.add(phone1);
        expectedListPhone.add(phone2);
        assertEquals(expectedListPhone,store.getItems("phone"));

        ArrayList<Magazine> expectedListMag = new ArrayList<>();
        expectedListMag.add(mag);
        expectedListMag.add(mag1);
        assertEquals(expectedListMag,store.getItems("magazine"));

        ArrayList<Arduino> expectedListArd = new ArrayList<>();
        expectedListArd.add(ard);
        expectedListArd.add(ard1);
        assertEquals(expectedListArd,store.getItems("arduino"));

    }

    //TODO 15
    @org.junit.jupiter.api.Test
    void testUpdateGetItem() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        store.addBook(book);
        store.addBook(book1);
        store.addPhone(phone);
        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addArduino(ard);
        store.addArduino(ard1);
        store.addMagazine(mag);
        store.addMagazine(mag1);
        store.updateItems("book","location","Room 513");
        ArrayList<Book> bookList = store.getItems("book");
        for(int i = 0; i<bookList.size(); i++){
            assertEquals("Room 513",bookList.get(i).getLocation());
        }
        store.updateItems("phone","storage capacity","16");
        ArrayList<Phone> phoneList = store.getItems("phone");
        for(int i = 0; i<phoneList.size(); i++){
            assertEquals(16,phoneList.get(i).getStorageCapacity());
        }
        store.updateItems("arduino","location","Room 513");
        ArrayList<Arduino> ardList = store.getItems("arduino");
        for(int i = 0; i<ardList.size(); i++){
            assertEquals("Room 513",ardList.get(i).getLocation());
        }
        store.updateItems("magazine","cover story title","Zoe Haynes");
        ArrayList<Magazine> magList = store.getItems("magazine");
        for(int i = 0; i<magList.size(); i++){
            assertEquals("Zoe Haynes",magList.get(i).getCoverStoryTitle());
        }
    }


    @org.junit.jupiter.api.Test
    public void testShowAllInfo() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        store.addBook(book);
        store.addBook(book1);
        store.addPhone(phone);
        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addArduino(ard);
        store.addArduino(ard1);
        store.addMagazine(mag);
        store.addMagazine(mag1);
        store.updateItems("book","location","Room 513");
        store.updateItems("phone","storage capacity","16");
        store.updateItems("arduino","location","Room 513");
        store.updateItems("magazine","cover story title","Zoe Haynes");
        store.showAllInfo();

    }






}
