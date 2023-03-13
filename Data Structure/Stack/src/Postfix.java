public class Postfix {
    protected static int evalPostfix(String express) {
        LinkedStack<Integer> new = new LinkedStack<>() {

        };

        for (int i = 0; i < express.length(); i++) {
            char ch = express.charAt(i);

            if (Character.isDigit(char))
                new.push(ch - '0');


            else {
                int v1 = new.pop();
                int v2 = new.pop();

                switch (char) {
                    case '+':
                        new.push(v2 + v1);
                        break;

                    case '-':
                        new.push(v2 - v1);
                        break;

                    case '*':
                        new.push(v2 * v1);
                        break;
                    case '/':
                        new.push(v2 / v1);
                        break;
                }
            }
        }
        return new.pop();
    }

    public static void main(String[] args) {
        String express = "242+*";
        System.out.println("Postfix " + evalPostfix(express));
    }
}