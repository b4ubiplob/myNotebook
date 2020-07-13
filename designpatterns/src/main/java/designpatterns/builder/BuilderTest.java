package designpatterns.builder;

public class BuilderTest {
    
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Lokesh", "Gupta")
        .setAge(30)
        .setPhone("1234567")
        .setAddress("Fake address 1234")
        .build();
     
        System.out.println(user1);
     
        User user2 = new User.UserBuilder("Jack", "Reacher")
        .setAge(40)
        .setPhone("5655")
        //no address
        .build();
     
        System.out.println(user2);
     
        User user3 = new User.UserBuilder("Super", "Man")
        //No age
        //No phone
        //no address
        .build();
     
        System.out.println(user3);
    }

}
