import controller.RelationController;
import data.Human;
import data.Relation;
import data.Relative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> persons = new ArrayList<>();

        Human person1 = new Human("Степан","Степанов","47", "мужской");
        Human person2 = new Human("Инга", "Степанова", "42", "женский");
        Human person3 = new Human("Михаил","Степанов", "17", "мужской");
        Human person4 = new Human("Ангелина", "Степанова", "13", "женский");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        System.out.println("Вся база данных: " + persons);

        List<Relative> relatives = new ArrayList<>();

        relatives.add(new Relative(person1, person2, Relation.HUSBAND));
        relatives.add(new Relative(person2, person1, Relation.WIFE));
        relatives.add(new Relative(person1, person3, Relation.FATHER));
        relatives.add(new Relative(person3, person1, Relation.SON));
        relatives.add(new Relative(person1, person4, Relation.FATHER));
        relatives.add(new Relative(person4, person1, Relation.DAUGHTER));
        relatives.add(new Relative(person2, person3, Relation.MOTHER));
        relatives.add(new Relative(person3, person2, Relation.SON));
        relatives.add(new Relative(person2, person4, Relation.MOTHER));
        relatives.add(new Relative(person4, person2, Relation.DAUGHTER));
        relatives.add(new Relative(person3, person4, Relation.BROTHER));
        relatives.add(new Relative(person4, person3, Relation.SISTER));

        //System.out.println(relatives);

        RelationController controller = new RelationController();

        System.out.println(person1.getName() + " " + person1.getSecondName() + " является для: " +
                controller.findRelations( person1, relatives));
        System.out.println(person3.getName() + " " + person3.getSecondName() + " является для: " +
                controller.findRelations( person3, relatives));
        System.out.println("Для " + person4.getName() + " " + person4.getSecondName() + " мама " +
                controller.findPersonByRelations(person4,Relation.MOTHER,relatives));
        System.out.println("Для " + person2.getName() + " " + person2.getSecondName() + " сын " +
                controller.findPersonByRelations(person2, Relation.SON, relatives));
    }
}