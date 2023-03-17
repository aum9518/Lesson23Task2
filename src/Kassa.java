import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Kassa implements Actionable {

    @Override
    public void payed(List<Person> people) {
        try {
            for (Person a : people) {
                //   if (a.getStatus().equals(Status.CLIENT)){
                System.out.println("Emne tamak zakaz beresiz?");
                String order = new Scanner(System.in).nextLine().toUpperCase();
                switch (order) {
                    case "MANTY":
                        System.out.println("Bank accountu jazynyz");
                        int bankAccaount = new Scanner(System.in).nextInt();
                        Set<Person> listP = new HashSet<>();
                        for (Person b : people) {
                            if (b.getBankAccount().getBankAccount() == bankAccaount) {
                                if (b.getBankAccount().getBalance() > Meal.MANTY.getPrice()) {
                                    b.getBankAccount().setBalance(b.getBankAccount().getBalance() - Meal.MANTY.getPrice());
                                    people.get(4).getBankAccount().setBalance(people.get(4).getBankAccount().getBalance() + Meal.MANTY.getPrice());
                                    listP.add(b);
                                } else {
                                    throw new Exception("Akchanyz jetpeyt");
                                }
                            }
                        }
                        if (listP.isEmpty()) {
                            throw new Exception("Tuura emes bank account");
                        } else {
                            listP.add(people.get(4));
                            System.out.println("hashSet" + listP);

                        }
                        break;
                    case "PLOV":
                        System.out.println("Bank accountu jazynyz");
                        int bankAccaount1 = new Scanner(System.in).nextInt();
                        Set<Person> listP1 = new HashSet<>();
                        for (Person b : people) {
                            if (b.getBankAccount().getBankAccount() == bankAccaount1) {
                                if (b.getBankAccount().getBalance() > Meal.PLOV.getPrice()) {
                                    b.getBankAccount().setBalance(b.getBankAccount().getBalance() - Meal.PLOV.getPrice());
                                    people.get(4).getBankAccount().setBalance(people.get(4).getBankAccount().getBalance() + Meal.PLOV.getPrice());
                                    listP1.add(b);
                                } else {
                                    throw new Exception("Akchanyz jetpeyt");
                                }
                            }
                        }
                        if (listP1.isEmpty()) {
                            throw new Exception("Tuura emes bank account");
                        } else {
                            listP1.add(people.get(4));
                            System.out.println("hashSet" + listP1);

                        }
                        break;
                case "SUP":
                    System.out.println("Bank accountu jazynyz");
                    int bankAccaount2 = new Scanner(System.in).nextInt();
                    Set<Person> listP2 = new HashSet<>();
                    for (Person b : people) {
                        if (b.getBankAccount().getBankAccount() == bankAccaount2) {
                            if (b.getBankAccount().getBalance() > Meal.SUP.getPrice()) {
                                b.getBankAccount().setBalance(b.getBankAccount().getBalance() - Meal.SUP.getPrice());
                                people.get(4).getBankAccount().setBalance(people.get(4).getBankAccount().getBalance() + Meal.SUP.getPrice());
                                listP2.add(b);
                            } else {
                                throw new Exception("Akchanyz jetpeyt");
                            }
                        }
                    }
                    if (listP2.isEmpty()) {
                        throw new Exception("Tuura emes bank account");
                    } else {
                        listP2.add(people.get(4));
                        System.out.println("hashSet" + listP2);
                    }
                    break;
                case "MASTAVA":
                    System.out.println("Bank accountu jazynyz");
                    int bankAccaount3 = new Scanner(System.in).nextInt();
                    Set<Person> listP3 = new HashSet<>();
                    for (Person b : people) {
                        if (b.getBankAccount().getBankAccount() == bankAccaount3) {
                            if (b.getBankAccount().getBalance() > Meal.MASTAVA.getPrice()) {
                                b.getBankAccount().setBalance(b.getBankAccount().getBalance() - Meal.MASTAVA.getPrice());
                                people.get(4).getBankAccount().setBalance(people.get(4).getBankAccount().getBalance() + Meal.MASTAVA.getPrice());
                                listP3.add(b);
                            } else {
                                throw new Exception("Akchanyz jetpeyt");
                            }
                        }
                    }
                    if (listP3.isEmpty()) {
                        throw new Exception("Tuura emes bank account");
                    } else {
                        listP3.add(people.get(4));
                        System.out.println("hashSet" + listP3);

                    }
                    break;
                case "LAGMAN":
                    System.out.println("Bank accountu jazynyz");
                    int bankAccaount5 = new Scanner(System.in).nextInt();
                    Set<Person> listP5 = new HashSet<>();
                    for (Person b : people) {
                        if (b.getBankAccount().getBankAccount() == bankAccaount5) {
                            if (b.getBankAccount().getBalance() > Meal.LAGMAN.getPrice()) {
                                b.getBankAccount().setBalance(b.getBankAccount().getBalance() - Meal.LAGMAN.getPrice());
                                people.get(4).getBankAccount().setBalance(people.get(4).getBankAccount().getBalance() + Meal.LAGMAN.getPrice());
                                listP5.add(b);
                            } else {
                                throw new Exception("Akchanyz jetpeyt");
                            }
                        }
                    }
                    if (listP5.isEmpty()) {
                        throw new Exception("Tuura emes bank account");
                    } else {
                        listP5.add(people.get(4));
                        System.out.println("hashSet" + listP5);

                    }
                    break;
                case "SHASHLYK":
                    System.out.println("Bank accountu jazynyz");
                    int bankAccaount6 = new Scanner(System.in).nextInt();
                    Set<Person> listP6 = new HashSet<>();
                    for (Person b : people) {
                        if (b.getBankAccount().getBankAccount() == bankAccaount6) {
                            if (b.getBankAccount().getBalance() > Meal.SHASHLYK.getPrice()) {
                                b.getBankAccount().setBalance(b.getBankAccount().getBalance() - Meal.SHASHLYK.getPrice());
                                people.get(4).getBankAccount().setBalance(people.get(4).getBankAccount().getBalance() + Meal.SHASHLYK.getPrice());
                                listP6.add(b);
                            } else {
                                throw new Exception("Akchanyz jetpeyt");
                            }
                        }
                    }
                    if (listP6.isEmpty()) {
                        throw new Exception("Tuura emes bank account");
                    } else {
                        listP6.add(people.get(4));
                        System.out.println("hashSet" + listP6);

                    }
                    break;
                default:
                    System.out.println("Myndai tamak jok");
                    break;
                }
                // }
            } }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
