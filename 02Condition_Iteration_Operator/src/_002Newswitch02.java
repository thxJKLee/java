/**
 * _002Newswitch02
 */
public class _002Newswitch02 {

    public static void main(String[] args) {
        int score = 99;

        String grade = switch (score / 10) {
            case 9 -> "A+";
            case 8 -> "A-";
            case 7 -> "B+";
            case 6 -> "B-";
            case 5 -> "C+";
            case 4 -> "C-";
            default -> "몰?루";
        };

        System.out.println(grade);

        //

        System.out.println("switch가 반환하는 값은 결국 하나니깐: " + switch (score / 10) {
            case 9 -> "A+";
            case 8 -> "A-";
            case 7 -> "B+";
            case 6 -> "B-";
            case 5 -> "C+";
            case 4 -> "C-";
            default -> "몰?루";
        });

        //

        String newGrade = switch (score / 10) {
            case 9 -> {
                System.out.println("축하합니다.");
                yield "A+";
            }
            case 8 -> "A-";
            case 7 -> "B+";
            case 6 -> "B-";
            case 5 -> "C+";
            case 4 -> "C-";
            default -> "몰?루";
        };
        System.out.println("yield 이용: " + newGrade);
    }
}