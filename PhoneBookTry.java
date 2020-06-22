package Java2.Lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBookTry {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Jimmy ", 123411234);
        phoneBook.add("Ron ", 23462345);
        phoneBook.add("Carmen ",  234626);
        phoneBook.add("Jimmy ",  768957);
        phoneBook.add("Kate ",  567844);
        phoneBook.add("Frank ", 245765);
        phoneBook.add("Al ", 24572276);
        phoneBook.add("Timmy ",  2576585);
        phoneBook.add("Bob ", 257425435);

        System.out.println(phoneBook.phoneBook1);

        phoneBook.get("Jimmy");

    }

    static class PhoneBook {

        HashMap<String, HashSet<Integer>> phoneBook1;

        PhoneBook() {
            this.phoneBook1 = new HashMap<>();
        }

        void add(String name, int number) {
            HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
            phoneBook.add(number);

            phoneBook1.put(name, phoneBook);
        }

        void get(String name) {

            System.out.println(name + "'s number is" +
                    phoneBook1.getOrDefault(name, new HashSet<>()));
        }

    }

}
