package factory;

public class NotificationService {
	
	public static void main(String[] args) {
		
		NotificationFactory nf = new NotificationFactory();
		
		Notification n = nf.createNotification("Coruja");
		System.out.println("Obj: " + n);
		n.notifyUser();
	}
}
