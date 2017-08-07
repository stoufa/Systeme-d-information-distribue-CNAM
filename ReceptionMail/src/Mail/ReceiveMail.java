package Mail;

import java.io.*;
import java.security.NoSuchProviderException;
import java.util.Properties;

import javax.mail.*;

public class ReceiveMail{
    public static void ReceiveMail(String userName, String password){
		if(userName == "" || password == "") {
			System.out.println("missing email and/or password !");
			return;
		}
    	File file = new File("./mail.txt");   	
    	
        try{
            Properties properties= new Properties();
            properties.setProperty("mail.store.protocol","imaps");
            Session emailSession = Session.getDefaultInstance(properties);
            Store emailStore = emailSession.getStore("imaps");
            emailStore.connect("imap.gmail.com",userName,password);
            Folder emailFolder = emailStore.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);
            Message messages[]= emailFolder.getMessages();
            for(int i=messages.length-3; i<messages.length;i++){
            	Message message=messages[i];
            	System.out.println("Email Number:" +(i+1));
            	System.out.println("Subject:" +message.getSubject());
            	System.out.println("From:" +message.getFrom()[0]);
            	System.out.println("Sent date:" +message.getSentDate());
            	//System.out.println("Sent contenu:" +message.getContent());
            	String msg= message.getContent().toString();
            	 //fichier 
                if (!file.exists()){
            		try {
        				file.createNewFile();
        			} catch (IOException e) {
        	    		e.printStackTrace();
        			}
            	}
            	try(PrintWriter print=new PrintWriter(new FileOutputStream(file))){
            		print.print(msg);
            	}catch (Exception e) {
            		e.printStackTrace();
        		} 
            	//fin fichier
            }
            emailFolder.close(false);
            emailStore.close();
        	}
        	catch(Exception nspe){
            	nspe.printStackTrace();
            }
   
            	
            }
public static void main(String... args){
	String email = "";
	String password = "";
	ReceiveMail(email,password);
}
            }

