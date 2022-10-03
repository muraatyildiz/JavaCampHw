
public class StringsDemo {

	public static void main(String[] args) {
		String message= "Weather is really nice today";
		
		System.out.println(message);
		
		System.out.println("Member count:" + message.length());
		System.out.println("5th Member : " + message.charAt(5));
		System.out.println(message.concat(" heyyy!"));
		System.out.println(message.startsWith("A"));
		System.out.println(message.endsWith("y"));
		
		char[] chars = new char[7];
		message.getChars(0, 7, chars, 0);
		System.out.println(chars);
		System.out.println(message.indexOf("e"));
		System.out.println(message.lastIndexOf("e"));
				
		String newMessage = message.replace(" ", "-");
		
		System.out.println(newMessage);
		System.out.println(message.substring(2,5));
		
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		System.out.println(message.trim());
		

	}

}
