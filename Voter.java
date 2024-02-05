public class Voter {
    private int voterId;
    String name;
    boolean hasVoted;

    public Voter(int id, String n, boolean v){
        this.voterId = id;
        this.name = n;
        this.hasVoted = v;
    }
}
