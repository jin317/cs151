public class Candidate {
    final int candidateId;
    String name;
    String party;

    public Candidate(String n, String p, int id){
        this.candidateId = id;
        this.name = n;
        this.party = p;
    }
}
