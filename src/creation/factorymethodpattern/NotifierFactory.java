package creation.factorymethodpattern;

public class NotifierFactory {

    public static Notifier create(String type) {

        return switch (type) {
            case "email" -> new EmailNotifier();
            case "sms" -> new SmsNotifier();
            default -> throw new IllegalArgumentException("Unknown notifier type: " + type);
        };
    }
}
