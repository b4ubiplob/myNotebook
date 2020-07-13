package designpatterns.builder;

public class User {
    
  //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
    
    private User(UserBuilder userbuilder) {
        this.firstName = userbuilder.firstName;
        this.lastName = userbuilder.lastName;
        this.age = userbuilder.age;
        this.phone = userbuilder.phone;
        this.address = userbuilder.address;
    }
    
    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
 
    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }
    
    public static class UserBuilder {
        
      //All final attributes
        private String firstName; // required
        private String lastName; // required
        private int age; // optional
        private String phone; // optional
        private String address; // optional
        
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public User build() {
            return new User(this);
        }
        
    }
 

}
