package Java;

class Whatsapp {
	public  static void send(int no) {
		System.out.println("number"+" "+ no);
	} 
	public static void send(int no, String message) {
		System.out.println("pass no and message"+no+" "+message );
	}
	public static void send(String message, int no) {
		System.out.println("pass the message  and"+message+""+ no);
	}
	public static void send(String message) {
		System.out.println("message"+" " + message);
	}
	
}
public class Method {
	public static void main(String[] args) {
		
	 Whatsapp.send(3,"sree harsha");
	Whatsapp.send(4);
	Whatsapp.send("sree ahsrah");
	}
}
