
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

public class Menu {

    private ArrayList<User> userList = new ArrayList();
    private User currentUser;
    private Scanner sc;
    private ArrayList<Post> postList = new ArrayList<>();


    public Menu(User currentUser){
        this.currentUser = currentUser;
        this.userList = new ArrayList<>();
        sc = new Scanner(System.in);
        userList.add(currentUser);
        this.postList = new ArrayList<>();
    }

    public void setCurrentUser(User currentUser){
        this.currentUser = currentUser;
    }


    public void displayMenu() {
        out.println();
        out.println("Main Menu");
        out.println("1) Create a new user");
        out.println("2) Become an existing user");
        out.println("3) Create a post as the current user");
        out.println("4) Print all posts");
        out.println("5) Print all users");
        out.println("9) EXIT PROGRAM");
        out.println();
        out.println("You are currently logged in as " + currentUser.getUserName() + ". What would you like to do?");
        String choice = sc.nextLine();
        performChoice(choice);
    }
    public void continueMenu(String cont){

        if (cont.equalsIgnoreCase("y")){
            displayMenu();}
        else if (cont.equalsIgnoreCase("n")){
            out.println("Goodbye");
        }else{
            out.println("Invalid Entry.");
            displayMenu();
        }
    }

    public void performChoice(String choice){

        switch (choice) {
            case "1":
                //call method to create new user--save input to variables and then create a new User instance with the info entered?
                out.println("Enter Avatar URL: ");
                String url = sc.nextLine();
                out.println("Enter Username: ");
                String username = sc.nextLine();
                out.println("Enter First and Last Name: ");
                String realName = sc.nextLine();
                out.println("Enter email address: ");
                String email = sc.nextLine();
                out.println();
                User newUser = new User (url, username, realName, email);
                currentUser = newUser;
                userList.add(newUser);
                out.println("You are now posting as " + currentUser.getUserName());
                out.println();

                out.println("Would you like to continue? Y or N?");
                String cont = sc.nextLine();
                continueMenu(cont);
                break;

            case "2":
                //call method to become existing user
                out.println(Arrays.toString(userList.toArray()));
                System.out.println();
                out.println("Which user would you like to post as? (1,2,3,etc.)");
                String userSelection = sc.nextLine();
                int userChoice = Integer.parseInt(userSelection);
                setCurrentUser(userList.get(userChoice-1));
                out.println("You are logged in as " + currentUser.getUserName() + ".");
                out.println();
                out.println("Would you like to continue? Y or N?");
                cont = sc.nextLine();
                continueMenu(cont);
                break;

            case "3":
                //call method to create post as current user
                if (postList != null && !postList.isEmpty()) {
                    out.println(postList.get(postList.size() - 1));
                }
                out.println("What would you like to post?");
                String postText = sc.nextLine();
                out.println("What is your web address?");
                String webAddy = sc.nextLine();
                Post currPost = new Post(currentUser.getUserName(),postText, webAddy);
                out.println(currPost);
                postList.add(currPost);
                out.println("Would you like to continue? Y or N?");
                cont = sc.nextLine();
                continueMenu(cont);
                break;

            case "4":
                //print all posts
                out.println(postList);
                out.println();
                out.println("Would you like to continue? Y or N?");
                cont = sc.nextLine();
                continueMenu(cont);
                break;

            case "5":
                //print the users stored in the user array
                out.println(Arrays.toString(userList.toArray()));
                out.println();
                out.println("Would you like to continue? Y or N?");
                cont = sc.nextLine();
                continueMenu(cont);
                break;

            case "9":
                out.println("Goodbye!");

        }
    }
    public static void main(String[] args) {
        User currentUser = new User("DefaultUSER", "defaultUSER", "default USER", "defaultUSER.com");
        Menu currMenu = new Menu(currentUser);
        currMenu.displayMenu();

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

            currMenu.performChoice(choice);
        }

    }


