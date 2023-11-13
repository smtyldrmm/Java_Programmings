package day31_Constructor.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
    //4 tester objects
    Tester tester1= new Tester("Samet",11,"SDET",11000);
    Tester tester2=new Tester("Kayra",22,"QA",12000);
    Tester tester3=new Tester("Sevinc",33,"SDET",13000);
    Tester tester4=new Tester("Uras",44,"QA",14000);
    Tester [] testers={tester1,tester2,tester3,tester4};

    //4 developer object

    Developer developer1=new Developer("Olga",12,"Java Developer",11500);
    Developer developer2=new Developer("Aygun",23,"Java Master",12500);
    Developer developer3=new Developer("Tunc",34,"Software Developer",13500);
    Developer developer4=new Developer("Sinem",45,"Senior Developer",14500);

    Developer [] developers={developer1,developer2,developer3,developer4};

    //1 scrum Team object

    ScrumTeam scrumTeam1=new ScrumTeam("Nigara","Huseyin","Neira",14);
    scrumTeam1.addTester(tester1);
    scrumTeam1.addDeveloper(developer1);

    scrumTeam1.addTesters(testers);

    scrumTeam1.addDevelopers(developers);

    System.out.println(scrumTeam1);

    System.out.println("-------------------");

    for(Tester eachTester : scrumTeam1.testerList){
        System.out.println(eachTester.name+" "+ eachTester.Salary);
    }

    System.out.println("--------------------");

    for(Developer eachDeveloper : scrumTeam1.developerList){
        System.out.println(eachDeveloper.name+" "+ eachDeveloper.Salary);
    }

    System.out.println("-------------------");

    scrumTeam1.removeTester(22);

    scrumTeam1.removeDeveloper(23);



}
}


