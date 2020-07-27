package branching;

public class BranchingMain1 {
    public static void main(String[] args) {
        int a = 10;

        switch (a){
            case 1:
                System.out.println("a = 1");
                break;
            case 2:
                System.out.println("a = 2");
                break;
            default:
                System.out.println("a не равняется 1 и 2");
                break;
        }

        System.out.println("Заканчиваем работу");
    }
}
