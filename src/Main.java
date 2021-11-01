public class Main {

    public static void main(String[] args){
       Partaker partaker1 = new Partaker("Иван", 200);
        Partaker partaker2 = new Partaker("Мария", 150);
        Partaker partaker3 = new Partaker("Виталий", 400);
        Partaker partaker4 = new Partaker("Вика", 100);
        Team team = new Team("Dinamo", partaker1, partaker2, partaker3, partaker4);
        Course course = new Course(100, 150, 200);

        course.finish(team);

        team.printInfoOfPartakers();
        System.out.println();
        team.printPartakerFinished();



    }

}
