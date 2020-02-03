public class VotingMachine {
    private int aVotes;
    private int bVotes;

    public VotingMachine() { //Constructor for the voting machine
        aVotes = 0;
        bVotes = 0;
    }

    public void voteA() { //method that adds a vote for A
        aVotes++;
    }

    public void voteB() { //method that adds a vote for B
        bVotes++;
    }

    public int getAVotes() { //return how many votes A has
        return aVotes;
    }

    public int getBVotes() { //return how many votes B has
        return bVotes;
    }

    public void clearVotes() { //method to clear votes before next election, i think FG might need this :)
        aVotes = 0;
        bVotes = 0;
    }
}