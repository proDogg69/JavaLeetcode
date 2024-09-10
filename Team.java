public class Team {
    Member member;

    public Team(Member member) {
        this.member = member;
    }

    public static void main(String[] args) {
        Member myMember = new Member("Tyler", "light", 10, 1);
        Team myTeam = new Team(myMember);
        System.out.println("Name is " + myTeam.member.getName());
        System.out.println("Type is " + myTeam.member.getType());
        System.out.println("Rank is " + myTeam.member.getRank());
        System.out.println("Level is " + myTeam.member.getLevel());
    }
}

class Member {
    private String name;
    private String type;
    private int level;
    private int rank;

    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getLevel() {
        return this.level;
    }

    public int getRank() {
        return this.rank;
    }
}