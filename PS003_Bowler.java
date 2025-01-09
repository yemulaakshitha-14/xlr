public class PS003_Bowler {
    // Instance variables
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    // Default constructor
    public PS003_Bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    // Parameterized constructor
    public PS003_Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    // Method: computeBowlingAverage
    public void computeBowlingAverage() {
        if (wickets == 0) {
            System.out.println("Bowling average cannot be calculated as wickets are 0.");
        } else {
            double bowlingAverage = (double) runsConceded / wickets;
            System.out.println("Bowling Average of " + name + ": " + bowlingAverage);
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        PS003_Bowler bowler1 = new PS003_Bowler();
        bowler1.computeBowlingAverage();

        // Using parameterized constructor
        PS003_Bowler bowler2 = new PS003_Bowler("Madhav", 25, 10, 600, 500);
        bowler2.computeBowlingAverage();
    }
}