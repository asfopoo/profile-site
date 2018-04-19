package gamePersist;

import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

/**
 * Demonstrates how to generate SHA256 hash in Java
 * @author JJ - Thanks JJ!
 */
public class hashSHA256 {
	 public static void main(String[] args) {
	        Scanner sn = new Scanner(System.in);
	        System.out.print("Please enter data for which SHA256 is required:");
	        String data = sn.nextLine();
	        
	        hashSHA256 sj = new hashSHA256();
	        String hash = sj.getSHA256Hash(data);
	        System.out.println("The SHA256 (hexadecimal encoded) hash is:"+hash);
	    }
	 
	 
	 	public String hashString(String data){
	 		
	 		hashSHA256 sj = new hashSHA256();
	        String hash = sj.getSHA256Hash(data);
			return hash;
	 		
	 	}
	    /**
	     * Returns a hexadecimal encoded SHA-256 hash for the input String.
	     * @param data
	     * @return 
	     */
	    private String getSHA256Hash(String data) {
	        String result = null;
	        try {
	            MessageDigest digest = MessageDigest.getInstance("SHA-256");
	            byte[] hash = digest.digest(data.getBytes("UTF-8"));
	            return bytesToHex(hash); // make it printable
	        }catch(Exception ex) {
	            ex.printStackTrace();
	        }
	        return result;
	    }
	    
	    /**
	     * Use javax.xml.bind.DatatypeConverter class in JDK to convert byte array
	     * to a hexadecimal string. Note that this generates hexadecimal in upper case.
	     * @param hash
	     * @return 
	     */
	    private String  bytesToHex(byte[] hash) {
	        return DatatypeConverter.printHexBinary(hash);
	    }
}
