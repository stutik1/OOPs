package HashCode;

public class Player {
    public int id;
    public String name;
    public int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {//1
            return false;
        } else if (obj == getClass()) {//2
            return false;
        } else {//3
            Player otherPlayer = (Player) obj;//3a
            if (otherPlayer.id == this.id
                    && otherPlayer.name == this.name
                    && otherPlayer.position == this.position) {//3b
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "name: " + name + " id: " + id + " pos " + position;
    }

    @Override
    public int hashCode() {
        return 31 * (this.id + this.position + name.hashCode());
    }

    private int getSum(String name) {
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            sum = sum + (int) name.charAt(i);
        }
        return sum;
    }
}
