
public class charNode {
	private charNode next = null;
	private char Zeichen;
	/**
	 * Constructor
	 * @param text
	 * @throws Exception
	 */
	public charNode(String text) throws Exception{
		if(text.length() == 0){
			throw new Exception("String ist leer");
		}
		Zeichen = text.charAt(0);
		text = text.substring(1);
		if(text.length() != 0){
			next = new charNode(text);	
		}	
	}
	public charNode(String text, Boolean x) throws Exception{
		if(text.length() == 0){
			throw new Exception("String ist leer");
		}
		Zeichen = text.charAt(0);
		String y = "";
		for (int i = 1; i<text.length(); i++){
			y += String.valueOf(text.charAt(i));
		}
		if(y.length() != 0){
			next = new charNode(y, true);	
		}	
	}
	/**
	 * Return all chars as String
	 */
	public String toString(){
		String retVal = String.valueOf(Zeichen);
		if (next != null) retVal += next.toString();
		return retVal;
	}
	/**
	 * Add a new String at end
	 * @param Text
	 * @throws Exception 
	 */
	public void addString(String Text) throws Exception{
		if(next != null){
			next.addString(Text);
			return;
		}
		next = new charNode(Text);
	}
	/**
	 * 
	 */
	public boolean equals(Object obj){
		if(obj instanceof charNode){
			if(obj.toString().equals(this.toString())) return true;
		}
		return false;
	}
}
