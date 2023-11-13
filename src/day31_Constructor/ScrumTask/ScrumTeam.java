package day31_Constructor.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {  public  String PO, BA, SM;
    public ArrayList<Tester> testerList=new ArrayList<>();
    public ArrayList<Developer> developerList=new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testerList.add(tester);
    }
    public void addTesters(Tester [] testers){
        testerList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        developerList.add(developer);
    }
    public void addDevelopers(Developer [] developers){
        developerList.addAll(Arrays.asList(developers));
    }
    public  void removeTester(int employeeID){
        testerList.removeIf(p-> p.employeeID==employeeID);
    }
    public void removeDeveloper(int employeeID){
        developerList.removeIf(p-> p.employeeID==employeeID);
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers =" + testerList.size() +
                ", total number of developers =" + developerList +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/*
create a class called scrumTeam
            PO: product owner
            BA : business analiyst
            SM : Scrum Master
        Attributes :
            String PO, BA, SM;
            ArrayList<Tester> testerList=new ArrayList<>();
            ArrayList<Developer> developerList=new ArrayList<>();
            int daysOfSprint;

        Add a constructor that can set the fields PO,BA,SM

        Actions :
            addTester(Tester tester) : adds the given tester to the testers ArrayList

            addTester(Tester [] testers) : adds the given testers to the testers ArrayList

            addTester(Developer developer) : adds the given developer to the testers ArrayList

            addTester(Developer [] developers) : adds the given developers to the testers ArrayList

            removeTester(int employeeID) : removes the given tester from the ArrayList

            removeDeveloper (int employeeID) : removes the given developer from the ArrayList



 */

