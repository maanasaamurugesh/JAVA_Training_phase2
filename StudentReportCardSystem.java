//package oops;
class StudentReportCard{
	int rollno;
	String name;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	int total;
	float avg;
	String grade;
	
	StudentReportCard(int rollno,String name, int m1, int m2, int m3, int m4, int m5){
		this.rollno = rollno;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
		this.calResult();
	}
	
	void getReportCard() {
		System.out.println(this.rollno + " " + this.name + " " + this.total + " " + this.avg + " " + this.grade + " " + this.m1 + " " + this.m2 + " " + this.m3 + " " +this.m4 + " " + this.m5 + " ");
	}
	
	void calResult() {
		total = m1 + m2 + m3 + m4+ m5;
		avg = total/5;
		
		if(avg > 90) grade = "O";
		else if (avg > 80) grade = "A+";
		else if (avg > 70) grade = "A";
		else if(avg > 60) grade = "B";
		else if(avg >= 40) grade = "C";
		else grade = "F";
		
	}
}

public class StudentReportCardSystem {
public static void main(String[] args) {
		StudentReportCard s1 = new StudentReportCard(65, "MM",1, 2, 3, 4 ,5);
		StudentReportCard s2 = new StudentReportCard(64, "CS",10, 20, 30, 40 ,50);
		StudentReportCard s3 = new StudentReportCard(48, "TS",100, 200, 300, 400 ,500);
		
		//s1.calResult();
		s1.grade = "A++";
		s2.grade = "A++";
		s1.getReportCard();
		s2.getReportCard();
		s3.getReportCard();

	}

}
