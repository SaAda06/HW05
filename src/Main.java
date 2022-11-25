import PublicTransport.Transport;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.setName("Volvo");
//        transport.getName();
        System.out.println(transport);
        transport.setSpotsCount(4);
        transport.setSpotsCount(10);
        transport.move(2);
        transport.move(20);


    }
}
//    public static void main(String[] args) {
//        Dog firstDog = new Dog("Dog", 0);
//        Dog secondDog = new Dog("New Dog", 15);
//        Dog thirdDog = new Dog("Third Dog", 12);
//        Client firstClient = new Client("Ivan", 10000, 364525452);
//        Client secondClient = new Client("Boris",20000, 452585612);
//        Client thirdClient = new Client("John",100, 415853128);
//
//  }


