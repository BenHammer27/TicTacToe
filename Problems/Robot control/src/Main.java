class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int vertical = robot.getY() - toY;
        int horizontal = robot.getX() - toX;

        while (vertical != 0) {
            switch (robot.getDirection()) {
                case UP:
                    if (vertical < 0) {
                        break;
                    } else {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                case LEFT:
                    if (vertical < 0) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                case DOWN:
                    if (vertical > 0) {
                        break;
                    } else {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    if (vertical < 0) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
            }
            robot.stepForward();
            vertical = robot.getY() - toY;
        }


        while (horizontal != 0) {
            switch (robot.getDirection()){
                case UP:
                    if (horizontal < 0) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                case DOWN:
                    if (horizontal < 0) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    if (horizontal < 0) {
                        break;
                    } else {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                    break;
                case LEFT:
                    if (horizontal < 0) {
                        robot.turnLeft();
                        robot.turnLeft();
                    } else {
                        break;
                    }
                    break;

            }
            robot.stepForward();
            horizontal = robot.getX() - toX;
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}