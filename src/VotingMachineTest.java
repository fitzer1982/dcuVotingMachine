public class VotingMachineTest {

    public static void main(String[] args) { //run the test method 3 times, you cam change the values here instead of in the method
    testVotes(540, 1540);
    testVotes(60,59);
    testVotes(60,60);
    }

    public static void testVotes(int valueA, int valueB) { //method that takes the params and puts them into a couple of if statements
       // int i = valueA; //store the params locally
      //  int v = valueB; // i was convinced you had to store params locally but editor told me it's not true, you learn something new
        VotingMachine newElection = new VotingMachine(); //new instance of Voting Machine
        System.out.println("Results of election");
        for (int x = 0; x < valueA; x++) { //compare x vs the amount of votes and use our Vote A method every time
            newElection.voteA();
        }
        for (int x =0; x< valueB; x++){ //same as above except for B
            newElection.voteB();
        }
        System.out.println("Party A: "+ newElection.getAVotes()+ " votes");
        System.out.println("Party B: "+ newElection.getBVotes()+ " votes");
        if(newElection.getAVotes() > newElection.getBVotes()){ //if statement that checks the results by grabbing our getA/Bvotes method from the object
            System.out.println("Party A Wins");
        } else if(newElection.getBVotes()>newElection.getAVotes()){
            System.out.println("Party B Wins");
        }else{
            System.out.println("It's a draw");
        }
        newElection.clearVotes(); //clear the votes out so the next test can be run
    }
}
