import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TODO Lesson 23 task 2
        /*Озунуздун Exception классынызды тузунуз.
        Employee деген класс тузунуз (свойства: name, age, job).
        Age берип жатканда эгерде минус сан болсо, тузгон Exception классынызды ыргытыныз.
                ArrayList тузуп аны жумушчулар менен толтурунуз, бироосунун жашын минус сан менен
        бериниз, бир элементин null деп бериниз.
        Элементтеринин маалыматтарын консолго чыгарыныз.
        Жок индексине да кайрылып корунуз.
                Болушу мумкун болгон бардык каталарга оз озунчо catch блогун жазыныз.
        finally блогун кошунуз акырында “Бутту” деп программаны бутурунуз.*/

        /*Employee employee = new Employee();

        LinkedList <String> list = new LinkedList<>();
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("5");

        LinkedList <String> list1 = new LinkedList<>();
        list1.add("1");
        list1.add("3");
        list1.add("3");
        list1.add("5");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2).isEmpty());
        list.equals(list1);
        list.isEmpty();
        list.set(1,"2");

        String[] array = new String[4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                array[i]=list.get(i);
            }
        }
        System.out.println(Arrays.toString(array));




        Set<String>hashSet = new HashSet<>(list);
        Set<String>hashSet1 = new HashSet<>(list1);

        System.out.println(hashSet);
        //hashSet.clear();
        if (hashSet.isEmpty()){
            System.out.println("Bosh");
        }else {
            System.out.println("Bosh emes");
        }
        System.out.println("elementerdin sany: "+hashSet.size());

        Set <String>treeSet = new TreeSet<>(hashSet);
        if (hashSet.equals(hashSet1)){
            System.out.println("Okshosh");
        }else {
            System.out.println("Okshosh emes");
        }
        hashSet.forEach(System.out::println);
        String[] array1 = {Arrays.toString(hashSet.toArray())};
        System.out.println(Arrays.toString(array1));


    }*/

        Person person1 = new Person(Status.CLIENT,"Manas",new BankAccount(1122,3000));
        Person person2 = new Person(Status.CLIENT,"Matmusa",new BankAccount(1133,2000));
        Person person3 = new Person(Status.CLIENT,"Torogeldi",new BankAccount(1144,1000));
        Person person4 = new Person(Status.CLIENT,"Momun",new BankAccount(1155,4000));
        Person person6 = new Person(Status.CHEF,"Manas",new BankAccount(1166,3000));

        List<Person>people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person6);


        Kassa kassa = new Kassa();

       // System.out.println(Arrays.toString(Meal.values()));
            System.out.println(Arrays.toString(Meal.values()));
        kassa.payed(people);


    }
}