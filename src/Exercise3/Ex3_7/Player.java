package Exercise3.Ex3_7;

public class Player {
    private int number;
    private float x, y, z = 0.0f; // Default z = 0.0

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float dx = this.x - ball.getX();
        float dy = this.y - ball.getY();
        float dz = this.z - ball.getZ();
        double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
        return distance < 8;
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            float newX = ball.getX() + (float) (Math.random() * 10 - 5);
            float newY = ball.getY() + (float) (Math.random() * 10 - 5);
            float newZ = ball.getZ() + (float) (Math.random() * 5);
            ball.setXYZ(newX, newY, newZ);
            System.out.println("Player " + number + " kicked the ball to " + ball);
        } else {
            System.out.println("Player " + number + " is too far to kick the ball!");
        }
    }
}

