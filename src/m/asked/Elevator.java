package m.asked;
enum Direction {
    UP, DOWN, IDLE
}

public class Elevator {
    private int currentFloor;
    private Direction direction;
    public Elevator() {
        this.currentFloor = 0; // assume ground floor
        this.direction = Direction.IDLE;
    }
    public void moveToFloor(int destination) {
        if (destination == currentFloor) {
            System.out.println("Already at floor " + currentFloor);
            return;
        }
        if (destination > currentFloor) {
            direction = Direction.UP;
            while (currentFloor < destination) {
                currentFloor++;
                System.out.println("Moving up... floor " + currentFloor);
            }
        } else {
            direction = Direction.DOWN;
            while (currentFloor > destination) {
                currentFloor--;
                System.out.println("Moving down... floor " + currentFloor);
            }
        }
        direction = Direction.IDLE;
        System.out.println("Arrived at floor " + currentFloor);
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public Direction getDirection() {
        return direction;
    }
    public static void main(String[] args) {
        Elevator e = new Elevator();
        e.moveToFloor(5);
        e.moveToFloor(2);
        e.moveToFloor(2); // same floor
    }
}

