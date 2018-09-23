package code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tst {
    int age;
    String name;

    public Tst(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {


        String s1 =null ;
        String s2 = "bcccb";
        Tst tst1 = new Tst(12, "vasya");
        Tst tst2 = new Tst(15, "petya");
        Tst tst3 = new Tst(9, "olya");
        Tst tst6 = new Tst(16, "katya");
        Tst tst7 = new Tst(9, "nastya");
        Tst tst4 = new Tst(11, "mitya");

        List<Tst> tstList = Arrays.asList(tst1,tst2,tst3,tst4,tst6,tst7);


        System.out.println(tstList.stream().count());
        System.out.println("forEach");
        tstList.stream().forEach(f-> System.out.println(f.age + " " + f.name));
        System.out.println("sorted");
        Comparator<Tst> comparatorAge = Comparator.comparing(a->a.age);
        Comparator<Tst> comparatorName = Comparator.comparing(n->n.name);
        tstList.stream().sorted(comparatorAge.thenComparing(comparatorName).reversed()).forEach(g-> System.out.println(g.age+" "+g.name));

        System.out.println("sotr-collect============");
        tstList.stream().sorted(comparatorAge).collect(Collectors.toList()).stream().forEach(e-> System.out.println(e.name));




//        Runnable runnable = ()-> System.out.println("ky-ky");
//        new Thread(runnable).start();
//        tstList.stream().forEach(s-> System.out.println(s.name+" "+s.age));
//        Comparator<Tst> comparatorAge = Comparator.comparing(p->p.age);
//        Comparator<Tst> comparatorName = Comparator.comparing(p->p.name);
//
//        System.out.println("++++++++++++++++++++++");
//        tstList.stream().sorted(comparatorAge).distinct().forEach(s-> System.out.println(s.name+" "+s.age));
//        System.out.println(tstList.stream().anyMatch(s->s.age==16));
//        Optional<Tst> optionalTst = tstList.stream().reduce((t1, t2)->new Tst(t1.age+t2.age,t1.name+"#"+t2.name));
//        System.out.println(optionalTst.get().name+" age: "+optionalTst.get().age);
//        tstList.stream().peek(l->{l.name="unknown_user";l.age=(Integer)(int)(Math.random()*20);}).forEach(s->System.out.println("name: "+s.name+" age:"+s.age));
//
//        Optional<Tst> first =tstList.stream().findFirst();
//        System.out.println(first.get().name);

//        byte a = 1;
//        byte d = 1;
//        byte c = (byte)(a+d);
//
//        char e = 'A';
//        char g = 'e';
//        char q = (char)(e+1);
//        System.out.println(q);






    }
}