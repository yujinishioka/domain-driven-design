package factory;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Notificação por Push");
	}
}
