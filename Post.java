public class Post {

    private String userID;
    private int postOrder;
    private static int nextPostOrder = 1;
    private String contents;
    private String webAddress;

    public Post(String userID, String contents, String webAddress) {

        this.userID = userID;
        this.postOrder = nextPostOrder;
        this.contents = contents;
        this.webAddress = webAddress;
        nextPostOrder++;

    }

    public int getPostOrder() {
        return postOrder;
    }

    public String toString(){
        return "User ID: " + this.userID + "\n Post Order: " + this.postOrder + "\n Post Contents: " + this.contents +"\n Web Address: " + this.webAddress;
    }
    public static void main(String args[]) {
        Post post1 = new Post("lgiesing13", "I was very confused today.", "www.SOS.com");

    }
}