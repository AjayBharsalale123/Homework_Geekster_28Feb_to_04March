package hw_oop;

public class hw01March {
	public static void main(String args[]) {
		
		System.out.println(reverseToggle("my name is khan"));  
		
		
		
		String sample = "This is Geekster";
	      String[] words = sample.split(" ");
	      String result = "";
	      for(String word:words){
	         String firstSub = word.substring(0, 1);
	         String secondSub = word.substring(1);
	         result = result+firstSub.toLowerCase()+secondSub.toUpperCase()+" ";
	      }
	      System.out.println(result);

	
		
//		  String s1="A batman with bat";  
//	      String replaceString=s1.replace("bat","snow"); 
//	      System.out.println(replaceString);

	}
	
	public static String reverseToggle(String str){  
	    String words[]=str.split("\\s");  
	    String reverseToggle="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        String first=sb.substring(0,1);  
	        String afterfirst=sb.substring(1);  
	        reverseToggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return reverseToggle.trim();  
	}  

}
