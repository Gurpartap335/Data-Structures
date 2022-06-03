package leetcode.String;

import java.util.Scanner;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(name.length());

        System.out.println(interpret(name));
    }

    static String interpret(String command) {
        // return command.replace("()","o").replace("(al)","al");

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                str.append('G');
            }
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                str.append('o');
                i++;
            }
            else {
                str.append("al");
                i = i + 3;
            }
        }

        return str.toString();
    }
}
/*
G -> 1
() -> 2
(al) -> 4
i++ applying in all three

you can remove i++
but than add
i++;
i += 2;
i += 4;
 */
