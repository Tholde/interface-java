public class Main {
    public static void main(String[] args) {
        ArithExpr const1 = new Constant(5.2);
        ArithExpr const2 = new Constant(2.8);
        ArithExpr const3 = new Constant(7.3);
        ArithExpr const4 = new Constant(6.9);

        ArithExpr expr1 = new Addition(const1, new Multiplication(new Addition(const2, const3), const4));
        ArithExpr expr2 = new Soustraction(const1, new Multiplication(new Soustraction(const2, const3), const4));
        ArithExpr expr3 = new Addition(const1, new Division(new Addition(const2, const3), const4));
        ArithExpr expr4 = new Soustraction(const1, new Division(new Soustraction(const2, const3), const4));

        System.out.println("*********First Expression********");
        System.out.println("Result : " + expr1.eval());
        System.out.println("Infix : " + expr1.toString());
        System.out.println("Prefix : " + expr1.prefix());
        System.out.println("Suffix : " +expr1.suffix());
        System.out.println("*********Second Expression********");
        System.out.println("Result : " + expr2.eval());
        System.out.println("Infix : " + expr2.toString());
        System.out.println("Prefix : " + expr2.prefix());
        System.out.println("Suffix : " +expr2.suffix());
        System.out.println("*********Third Expression********");
        System.out.println("Result : " + expr3.eval());
        System.out.println("Infix : " + expr3.toString());
        System.out.println("Prefix : " + expr3.prefix());
        System.out.println("Suffix : " +expr3.suffix());
        System.out.println("*********Fourth Expression********");
        System.out.println("Result : " + expr4.eval());
        System.out.println("Infix : " + expr4.toString());
        System.out.println("Prefix : " + expr4.prefix());
        System.out.println("Suffix : " +expr4.suffix());
    }
}