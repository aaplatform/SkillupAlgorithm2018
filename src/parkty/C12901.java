package parkty;

public class C12901 {
	
	private int monthDays[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private String weeks[] ={"THU", "FRI","SAT","SUN", "MON", "TUE", "WED"};

	public String solution(int a, int b) {
        String answer = "";

        int dayGap = 0;
        for(int i=0; i<a-1; i++){
        	dayGap += monthDays[i];
        }
        dayGap += b-1; //2016.01.01 하루 제외
        
        answer = weeks[dayGap%7];

        return answer;
    }


	public static void main(String[] args) {
		C12901 test = new C12901();
        System.out.println(test.solution(5, 24));
	}

}
