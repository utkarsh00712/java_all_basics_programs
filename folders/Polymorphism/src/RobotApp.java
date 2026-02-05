
public class RobotApp {
public static void main(String[] args) {
	Robot robo1 = new Robot();
	operateRobo(robo1);
	
	Robot robo2 = new Robot();
	operateRobo(robo2);
	
	
}

public static void operateRobo(Robot robo) {
	robo.learn();
	robo.charge();
	robo.tasks();
}
}
