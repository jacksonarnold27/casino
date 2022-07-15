public class Player {
    private int balance;
    private String name;

//  TODO: create player interaction with games
//  TODO: add player currency system
//  TODO: add player inventory system
//  TODO: add ranking/ELO system -- or more realistically add leaderboards for each game

    public Player(String name) {
        setBalance(0);
        setName(name);

    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
