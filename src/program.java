
public class program {
	public static void main(String[] args) throws Exception{
		charNode a;
		a = new charNode("ABCDEFG",true);
		System.out.println(a.toString());
		a.addString("HIJKLMNOP");
		System.out.println(a.toString());
		
		charNode b = new charNode("ABCDEFGHIJKLMNOP");
		System.out.println(b.toString());
		if(a.equals(b)){
			System.out.println("Stimmt Ÿberein");
		}else{
			System.out.println("Stimmt leider nicht");
		}
		Object c = new Object();
		if(a.equals(c)){
			System.out.println("Stimmt Ÿberein");
		}else{
			System.out.println("Stimmt leider nicht");
		}		
		
	}
}
