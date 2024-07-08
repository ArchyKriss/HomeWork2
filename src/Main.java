public class Main {
    public static void main(String[] args) {
        //task1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //task2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //task3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.8;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //task4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var generalWeight = firstBoxer + secondBoxer;
        System.out.println(generalWeight);
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println(differenceWeight);

        //task7
        var remains = secondBoxer % firstBoxer;
        System.out.println(remains);

        //task8
        var generalHours = 640;
        var workTimeMan = 8;
        var workers = generalHours / workTimeMan;
        System.out.println("Всего работников в компании - "+ workers+" человек");
        workers = workers+ 94;
        var hoursWork = generalHours/workers;
        System.out.println("Если в компании работает "+ workers+ " человек, то всего "+hoursWork+ " часов работы может быть поделено между сотрудниками");


    }
}