package code.func_interf;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;
import java.util.function.*;

public class Func_interf {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = x->x>0;
        System.out.println(isPositive.test(4));

        UnaryOperator<Integer> square  = x1->x1*2+x1;
        System.out.println(square .apply(4));

        BinaryOperator<Integer> mult = (x1,x2) -> x1*x2;
        System.out.println(mult.apply(2,3));

        Function<Integer, String> convert = x->String.valueOf(x) + " dollars";
        System.out.println(convert.apply(1));

        Consumer<Integer> printer = x-> System.out.printf("%d dollars", x);
        printer.accept(3);

        Supplier<User> userFactory = ()-> {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your nsme: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Name user1: " + user1.getname());
        System.out.println("Name user2: " + user2.getname());
        }
    }

    class User {
        private String name;

        User(String name) {
            this.name = name;
        }

        String getname() {
            return name;
        }
    }