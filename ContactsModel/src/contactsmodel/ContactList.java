/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Judith
 */
public class ContactList {
    
     private String listName;
     private ArrayList<Client> contacts;
     
    
     public ContactList(){
         
         contacts = new ArrayList<Client>();
         listName ="";
         
     }

    /**
     * @return the listName
     */
    public String getListName() {
        return listName;
    }

    /**
     * @param listName the listName to set
     */
    public void setListName(String listName) {
        this.listName = listName;
    }
    
    public String toString(){
        String lineSep = System.lineSeparator();
        String out = "";
        
        for (int i = 0; i < contacts.size(); i++) {
           out+= "\n"+ contacts.get(i).toString();
           
            
        }
        return listName+lineSep+out;
        
    }
    public Client getContact (int index){
          return contacts.get(index);
    }
    
    public int size(){
        return contacts.size();
    }
    
    public void deleteContact(int index){
        contacts.remove(index);
    }
    
    public void addContact(Client client){
        contacts.add(client);
    }
    public void loadContacts(String filename){
        try{
              Scanner scnr = new Scanner(new File(filename));
            listName = scnr.nextLine();

            while (scnr.hasNext()) {
                Client client = new Client();
                String[] data = scnr.nextLine().split(",");
                client.setFirstname(data[0]);
                client.setLastname(data[1]);
                client.setGender(data[2]);
                client.setAge(Integer.parseInt(data[3]));
                client.setPhone(data[4]);
                client.setEmail(data[5]);
                contacts.add(client);
            
            
            
        }
        }
        catch   (FileNotFoundException ex){
            
        }
        
    }
    public void saveContacts(String filename){
        
                try {
            PrintWriter pw = new PrintWriter(filename);

            for (int i = 0; i < contacts.size(); i++) {
                pw.println(contacts.get(i).toString());
                System.lineSeparator();
            }
            pw.close();
        } catch (FileNotFoundException ex) {

        }
    }
        
    }

