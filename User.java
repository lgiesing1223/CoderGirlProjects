public class User {

    private String avatarURL;
    private String userName;
    private String realName;
    private String email;

    public User(String avatarURL, String userName, String realName, String email) {
        this.avatarURL = avatarURL;
        this.userName = userName;
        this.realName = realName;
        this.email = email;
    }

    public String getUserName(){
        return this.userName;
    }

    public String toString(){
        return this.userName;
    }
    public static void main(String args[]) {

        User user1 = new User("www.nope.com", "LGiesing", "Lindsey Giesing", "lgiesing13@gmail.com");

        System.out.println(user1.userName);
    }
}
