public class lab8demo {
    public static void main(String[] args) {
    
        int grade = 52;
        int level = 0;
        int age = 20;
        boolean hasID = true;
        boolean isWeekend = true, isHoliday = true;

        if(age >= 18 && hasID){
            System.out.println("You shall pass");
        }else{
            System.out.println("You shall not pass");
        }
        if(isWeekend || isHoliday){
            System.out.println("You may relax!");
        }else{
            System.out.println("Work it hard!");
        }
        if((age >= 18 && hasID) || isHoliday){
            System.out.println("and and or together evaluates to true");
        } else {
            System.out.println("and and or together evaluates to false");
        }

        if(grade >= 70) {
            System.out.println("First Class Honors");
            level = 1;
        } else if (grade >= 60){
            System.out.println("Second Class Honors Higher");
            level = 2;
        } else if (grade >= 50){
            System.err.println("Second Class Honors Lower");
            level = 3;
        } else if (grade >= 40){
            System.out.println("Pass");
            level = 4;
        } else {
            System.out.println("Fail");
        }

        switch(level) {
            case 1:
                System.out.println("Excellent work!");
                break;
            case 2:
                System.out.println("Good job!");
                break;
            case 3:
                System.out.println("You passed.");
                break;
            case 4:
                System.out.println("Barely made it.");
                break;
            default:
                System.out.println("Better luck next time.");
        }
    }
}