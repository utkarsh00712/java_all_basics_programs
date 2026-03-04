package Methodhiding;

public class Main {
public static void main(String[] args) {
	
	School.announceHoliday();
	BranchSchool.announceHoliday();
	
	School S = new BranchSchool();
	S.announceHoliday();
}
}
