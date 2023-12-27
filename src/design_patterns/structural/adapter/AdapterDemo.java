package design_patterns.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        PowerAdapter socket = new PowerAdapter(mobilePhone);
        socket.connect();

        System.out.println();

        PowerAdapterClass socketClass = new PowerAdapterClass();
        socketClass.connect();
    }
}
