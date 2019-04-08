package FileIO;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FilesIO {

    static String directory = "data";
    static String filename = "contacts.txt";
    static Path dataDirectory = Paths.get(directory);
    static Path dataFile = Paths.get(directory, filename);
    static List<String> iocontacts = new ArrayList<>();
    static Input scnr = new Input();

    public static void contactInterface() {
        do {
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Edit Contact Name.\n" +
                    "6. Exit" +
                    "Enter an option (1, 2, 3, 4 or 5):");
            int userChoice = scnr.getInt();
            switch (userChoice) {
                case 1:
                    displayContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5: editContactName();
                    break;
                case 6: return;
            }
            System.out.println("Continue?");
        } while (scnr.yesNo());

    }

    public static void displayContacts() {
        try {
            iocontacts = Files.readAllLines(dataFile);
        } catch (IOException e) {
            System.out.println(e);
        }
        int index = 0;
        System.out.println("Name           | Phone number     |\n" +
                "-----------------------------------");
        for (String contact : iocontacts) {
            if (contact.length() > 0) {
                index = contact.lastIndexOf(" ");
                String firstStr = contact.substring(0, index);
                String lastStr = contact.substring(index + 1);
                System.out.printf("%-14s | %-16s |%n", firstStr, lastStr);
            }
        }

    }

    public static Contact addNewContact() {
        System.out.println("Enter contact name");
        String name = scnr.getLine();
        System.out.println("Enter phone number: ");
        String number = scnr.getLine();
        number = phoneNumConverter(number);
        Contact newContact = new Contact(name, number);
        iocontacts.clear();
        iocontacts.add(newContact.toString());
        try {
            Files.write(
                    Paths.get("data", "contacts.txt"),
                    iocontacts,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println(e);
        }

        return newContact;
    }

    public static String phoneNumConverter(String phoneNum) {
        if (phoneNum.length() == 10) {
            phoneNum = phoneNum.substring(0, 3) + "-" + phoneNum.substring(3, 6) + "-" + phoneNum.substring(6);
        }
        if (phoneNum.length() == 7) {
            phoneNum = phoneNum.substring(0, 3) + "-" + phoneNum.substring(3);
        }
        return phoneNum;
    }

    public static void searchByName() {

        System.out.println("Enter contact to search for:");
        String searchFor = scnr.getLine();
        try {
            List<String> contacts = Files.readAllLines(dataFile);
            for (String contact : contacts) {
                if (contact.contains(searchFor)) {
                    System.out.println(contact);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void createDirectoryFile() {

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void deleteContact() {
        System.out.println("You have requested the deletion of a contact...");
        System.out.printf("%nEnter a first name: %n");
        String firstName = scnr.getLine();
        System.out.printf("%nEnter a last name: %n");
        String lastName = scnr.getLine();
        String fullName = firstName + " " + lastName;

        List<String> newList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(dataFile);
            for (String line : lines) {
                if (line.contains(fullName)) {
                    newList.remove(fullName);
                    continue;
                }
                newList.add(line);
                Files.write(dataFile, newList);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println();
        System.out.printf("%s has been deleted.", fullName);
        System.out.println();
        System.out.println();
    }

    public static void editContactName(){
        System.out.println("Enter contacts name to edit: ");
        String userEdit = scnr.getLine();
        System.out.println("Enter new name: ");
        String newName = scnr.getLine();
        List<String> newList = new ArrayList<>();
        try {
            List<String> contacts = Files.readAllLines(dataFile);
            for (String line : contacts) {
                if (line.contains(userEdit)) {
                    newName = line.replaceFirst(userEdit, newName);
                    newList.add(newName);
                    continue;
                }
                newList.add(line);
            }
            Files.write(dataFile, newList);
        } catch (IOException e) {
            System.out.println(e);
        }




    }

    public static void main(String[] args) {
        createDirectoryFile();
        contactInterface();
    }
}
