/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;

/**
 *
 * @author Judith
 */
public class ContactsModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Client test = new Client();
        //System.out.println(test);
                
        ContactList temp = new ContactList();
        temp.loadContacts(args[0]);
        System.out.println(temp.toString());
        temp.saveContacts("Rose.txt");
    }
    
}
