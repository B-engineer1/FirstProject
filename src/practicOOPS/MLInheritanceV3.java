package practicOOPS;

public class MLInheritanceV3 extends MLInheritanceV2 {
	
	public void WhatsupContacts() {
		
		System.out.println("Contacts");
	}
	
	public void WhatsupFileupload() {
		
		System.out.println("File Uploads");
		
	}

	public static void main(String[]args) {
		
		MLInheritanceV3 wh = new MLInheritanceV3();
		
		wh.WhatsupAudio();
		wh.WhatsupContacts();
		wh.WhatsupEmoji();
		wh.WhatsupFileupload();
		wh.WhatsupText();
		wh.WhatsupVideo();
		
		
		
	}
}
