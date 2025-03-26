package frogger;

public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean[] getOccupied() {
        return this.occupied;
    }

    public boolean isOccupied(int position) {
        return occupied[position];
    }

    public boolean isValidPosition(int position) {
        return position >= 0 && position < occupied.length;
    }
}
