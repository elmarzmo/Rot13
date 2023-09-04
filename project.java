
public class project {
	public static void main(String[] args) {
		
	}
	public static String rot13(String message) {
	     String alphabet = "abcdefghijklmnopqrstuvwxyz";
	     String alphabet2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     StringBuilder str = new StringBuilder();
	      for(int i=0; i<message.length();i++){
	    	
	        char ch = message.charAt(i);
	        if(! ((ch >='a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){
	          str.append(ch);
	        }else{
	        if(Character.isLowerCase(ch)){
	        int idx = (alphabet.indexOf(ch)+13)%26;
	        char ch3 = alphabet.charAt(idx);
	        str.append(ch3);
	      }
	      
	     if(Character.isUpperCase(ch)){
	       int idx2 = (alphabet2.indexOf(ch)+13)%26;
	       char ch2 = alphabet2.charAt(idx2);
	       str.append(ch2);
	     }
	     }
	     }
	        
	     return str.toString();
	   }
	
		}
	

