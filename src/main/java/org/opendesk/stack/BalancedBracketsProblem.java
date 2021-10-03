package org.opendesk.stack;

import java.util.Stack;

public class BalancedBracketsProblem {

    public static void main(String[] args) {
        BalancedBracketsProblem bbr = new BalancedBracketsProblem ();
        System.out.println(bbr.isBalanced("2{1 + [4(2 + 1) + 3]}"));
    }

    boolean isBalanced (String braString) {

        Stack <Character> stack = new Stack<>();

        for (int i=0; i < braString.length(); i++){
            char ch = braString.charAt(i);

            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                continue;
            }

            if (ch == ')' || ch == '}' || ch == ']'){
                Character popValue = stack.pop();

                if (ch == ')' && popValue != '(') return false;
                if (ch == ']' && popValue != '[') return false;
                if (ch == '}' && popValue != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}
