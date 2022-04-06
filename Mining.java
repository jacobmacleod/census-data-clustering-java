/*
* This is a program for the CS 4710 project.
* This program implements the DBSCAN algorithm for clustering data from the
* 1990 US Census.
*/
package mining;
import java.io.*;
import java.util.*;
import java.lang.*;
/*
* Jacob MacLeod
* Section 01
* CS 4710
* Dr. Chung
*/
public class Mining {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args)
    {
        //get epsilon and minPts from user input
        int epsilon = Integer.parseInt(args[0]);
        int minPts = Integer.parseInt(args[1]);
        Person[] people = new Person[1500];
        String fileName = "USCensus1990.data.txt";
        people = readFile(people, fileName);
        ArrayList<Integer> clusters = new ArrayList<>();
        Random generator = new Random();
        int noiseSize = 0;
        boolean someUnvisited = false;
        do {
            someUnvisited = false;
            int clusterSize = 0;
            int randomIndex = generator.nextInt(people.length);
            //randomly select an unvisited object and mark it as visited
            if(people[randomIndex].getVisited() == false) {
                people[randomIndex].setVisited(true);
                boolean support = getSupport(people, randomIndex, epsilon, minPts);
                //if neighborhood is big enough, create new cluster and add point
                if(support) {
                    clusterSize++;
                    people[randomIndex].setisInCluster(true);
                    boolean someVisited = false;
                    do {
                        someVisited = false;
                        //for each point in the neighborhood
                        for(int i = 0; i < people.length; i++) {
                            //if it is unvisited, mark it as visited
                            if(people[i].getVisited() == false &&
                            people[i].getinNeighborhood() == true) {
                                people[i].setVisited(true);
                                someVisited = true;
                                clusterSize++;
                                //if the point is supported, add its neighbors
                                boolean neighborSupport = getSupport(people, i, epsilon, minPts);
                                people[i].setisInCluster(true);
                            }
                            //if it is not in any cluster, add it to this cluster
                            else if(people[i].getinNeighborhood() == true &&


                            people[i].getisInCluster() == false && people[i].getVisited() == true) {
                                clusterSize++;
                                people[i].setisInCluster(true);
                                noiseSize = noiseSize - 1;
                            }
                        }
                    } while(someVisited == true); //until no point is unvisited
                }
                //otherwise, mark point as noise
                else {
                    noiseSize = noiseSize + 1;
                }
            }
            //add size to arraylist of clusters
            clusters.add(clusterSize);
            for(int j = 0; j < people.length; j++) {
                if(people[j].getVisited() == false) {
                    someUnvisited = true;
                }
            }
        } while(someUnvisited); //until no point is unvisited
        //print out the sizes of the clusters
        System.out.println("with epsilon of " + epsilon + " and minPts " +
        minPts + ", the cluster sizes are ");
        for(int k = 0; k < clusters.size(); k++) {
            if (clusters.get(k) > 0) {
                System.out.println(clusters.get(k));
                System.out.println();
            }
        }
        System.out.println("and the noise size is " + noiseSize);
    }
    /**
    * @param people the array of Person objects to be compared
    * @param index the index of the Person to compare
    * @param epsilon the user-input value for the radius
    * @param minPts the user-input minimum number of points in the neighborhood
    * @return boolean whether or not the Person has at least minPts neighbors
    *
    * The getSupport method tells the program whether or not a Person at a
    * given index has enough neighbors to be in a cluster.
    */
    public static boolean getSupport(Person[] people, int index, int epsilon, int minPts) {
        int support = -1; //-1 to mitigate counting the index against itself
        boolean supported = false;
        for(int i = 0; i < people.length; i++) {
            if(inRadius(epsilon, people[i], people[index])) {
                support = support + 1;
                people[i].setinNeighborhood(true);
            }
        }
        if(support >= minPts) {
            supported = true;
        }
        else {
            for(int j = 0; j < people.length; j++) {
                if(people[j].getVisited() == false) {
                    people[j].setinNeighborhood(false);
                }
            }
        }
        return supported;
    }


    /**
    * @param people the array of Person objects to write
    * @param fileName the name of the file to read from
    *
    * The readFile method reads in Person object data from a file
    */
    public static Person[] readFile(Person[] people, String fileName) {
        try
        {
            String line = null;
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for(int i = 0; i < people.length; i++) {
                people[i] = new Person();
                line = bufferedReader.readLine();
                //attributes delimited by commas
                String[] person = line.split(",");
                people[i].setdAge(Integer.parseInt(person[1]));
                people[i].setdAncstry1(Integer.parseInt(person[2]));
                people[i].setdAncstry2(Integer.parseInt(person[3]));
                people[i].setiAvail(Integer.parseInt(person[4]));
                people[i].setiCitizen(Integer.parseInt(person[5]));
                people[i].setiClass(Integer.parseInt(person[6]));
                people[i].setdDepart(Integer.parseInt(person[7]));
                people[i].setiDisabl1(Integer.parseInt(person[8]));
                people[i].setiDisabl2(Integer.parseInt(person[9]));
                people[i].setiEnglish(Integer.parseInt(person[10]));
                people[i].setiFeb55(Integer.parseInt(person[11]));
                people[i].setiFertil(Integer.parseInt(person[12]));
                people[i].setdHispanic(Integer.parseInt(person[13]));
                people[i].setdHour89(Integer.parseInt(person[14]));
                people[i].setdHours(Integer.parseInt(person[15]));
                people[i].setiImmigr(Integer.parseInt(person[16]));
                people[i].setdIncome1(Integer.parseInt(person[17]));
                people[i].setdIncome2(Integer.parseInt(person[18]));
                people[i].setdIncome3(Integer.parseInt(person[19]));
                people[i].setdIncome4(Integer.parseInt(person[20]));
                people[i].setdIncome5(Integer.parseInt(person[21]));
                people[i].setdIncome6(Integer.parseInt(person[22]));
                people[i].setdIncome7(Integer.parseInt(person[23]));
                people[i].setdIncome8(Integer.parseInt(person[24]));
                people[i].setdIndustry(Integer.parseInt(person[25]));
                people[i].setiKorean(Integer.parseInt(person[26]));
                people[i].setiLang1(Integer.parseInt(person[27]));
                people[i].setiLooking(Integer.parseInt(person[28]));
                people[i].setiMarital(Integer.parseInt(person[29]));
                people[i].setiMay75880(Integer.parseInt(person[30]));
                people[i].setiMeans(Integer.parseInt(person[31]));
                people[i].setiMilitary(Integer.parseInt(person[32]));
                people[i].setiMobility(Integer.parseInt(person[33]));
                people[i].setiMobillim(Integer.parseInt(person[34]));
                people[i].setdOccup(Integer.parseInt(person[35]));
                people[i].setiOthrserv(Integer.parseInt(person[36]));
                people[i].setiPerscare(Integer.parseInt(person[37]));
                people[i].setdPOB(Integer.parseInt(person[38]));
                people[i].setdPoverty(Integer.parseInt(person[39]));
                people[i].setdPwgt1(Integer.parseInt(person[40]));
                people[i].setiRagechld(Integer.parseInt(person[41]));
                people[i].setdRearning(Integer.parseInt(person[42]));
                people[i].setiRelat1(Integer.parseInt(person[43]));
                people[i].setiRelat2(Integer.parseInt(person[44]));
                people[i].setiRemplpar(Integer.parseInt(person[45]));
                people[i].setiRiders(Integer.parseInt(person[46]));
                people[i].setiRlabor(Integer.parseInt(person[47]));
                people[i].setiRownchld(Integer.parseInt(person[48]));
                people[i].setdRpincome(Integer.parseInt(person[49]));
                people[i].setiRPOB(Integer.parseInt(person[50]));
                people[i].setiRrelchld(Integer.parseInt(person[51]));
                people[i].setiRspouse(Integer.parseInt(person[52]));
                people[i].setiRvetserv(Integer.parseInt(person[53]));
                people[i].setiSchool(Integer.parseInt(person[54]));
                people[i].setiSept80(Integer.parseInt(person[55]));
                people[i].setiSex(Integer.parseInt(person[56]));
                people[i].setiSubfam1(Integer.parseInt(person[57]));
                people[i].setiSubfam2(Integer.parseInt(person[58]));
                people[i].setiTmpabsnt(Integer.parseInt(person[59]));
                people[i].setdTravtime(Integer.parseInt(person[60]));
                people[i].setiVietnam(Integer.parseInt(person[61]));
                people[i].setdWeek89(Integer.parseInt(person[62]));
                people[i].setiWork89(Integer.parseInt(person[63]));
                people[i].setiWorklwk(Integer.parseInt(person[64]));
                people[i].setiWWII(Integer.parseInt(person[65]));
                people[i].setiYearsch(Integer.parseInt(person[66]));
                people[i].setiYearwrk(Integer.parseInt(person[67]));
                people[i].setdYrsserv(Integer.parseInt(person[68]));
                people[i].setVisited(false); //mark all objects as unvisited
                people[i].setinNeighborhood(false);
            }
        } catch (IOException ex) {
            System.out.println("File Read Error");
        }
        return people;
    }
    /**
    * @param epsilon the user-specified radius
    * @param one a Person object to compare
    * @param two a Person object to compare
    * @return boolean whether or not the people are inside the radius
    *
    * The inRadius method checks two Person objects to see whether they are
    * within the user-specified radius, epsilon.
    */
    public static boolean inRadius(int epsilon, Person one, Person two) {
        boolean inside = false;
        double radius = Math.sqrt(Math.pow((one.getdAge() - two.getdAge()), 2) +
        Math.pow((one.getdAncstry1() - two.getdAncstry1()), 2) + Math.pow((one.getdAncstry2() - two.getdAncstry2()), 2) +
        Math.pow((one.getiAvail() - two.getiAvail()), 2) + Math.pow((one.getiCitizen() - two.getiCitizen()), 2) +
        Math.pow((one.getiClass() - two.getiClass()), 2) + Math.pow((one.getdDepart() - two.getdDepart()), 2) +
        Math.pow((one.getiDisabl1() - two.getiDisabl1()), 2) + Math.pow((one.getiDisabl2() - two.getiDisabl2()), 2) +
        Math.pow((one.getiEnglish() - two.getiEnglish()), 2) + Math.pow((one.getiFeb55() - two.getiFeb55()), 2) +
        Math.pow((one.getiFertil() - two.getiFertil()), 2) + Math.pow((one.getdHispanic() - two.getdHispanic()), 2) +
        Math.pow((one.getdHour89() - two.getdHour89()), 2) + Math.pow((one.getdHours() - two.getdHours()), 2) +
        Math.pow((one.getiImmigr() - two.getiImmigr()), 2) + Math.pow((one.getdIncome1() - two.getdIncome1()), 2) +
        Math.pow((one.getdIncome2() - two.getdIncome2()), 2) + Math.pow((one.getdIncome3() - two.getdIncome3()), 2) +
        Math.pow((one.getdIncome4() - two.getdIncome4()), 2) + Math.pow((one.getdIncome5() - two.getdIncome5()), 2) +
        Math.pow((one.getdIncome6() - two.getdIncome6()), 2) + Math.pow((one.getdIncome7() - two.getdIncome7()), 2) +
        Math.pow((one.getdIncome8() - two.getdIncome8()), 2) + Math.pow((one.getdIndustry() - two.getdIndustry()), 2) +
        Math.pow((one.getiKorean() - two.getiKorean()), 2) + Math.pow((one.getiLang1() - two.getiLang1()), 2) +
        Math.pow((one.getiLooking() - two.getiLooking()), 2) + Math.pow((one.getiMarital() - two.getiMarital()), 2) +
        Math.pow((one.getiMay75880() - two.getiMay75880()), 2) + Math.pow((one.getiMeans() - two.getiMeans()), 2) +
        Math.pow((one.getiMilitary() - two.getiMilitary()), 2) + Math.pow((one.getiMobility() - two.getiMobility()), 2) +
        Math.pow((one.getiMobillim() - two.getiMobillim()), 2) + Math.pow((one.getdOccup() - two.getdOccup()), 2) +
        Math.pow((one.getiOthrserv() - two.getiOthrserv()), 2) + Math.pow((one.getiPerscare() - two.getiPerscare()), 2) +
        Math.pow((one.getdPOB() - two.getdPOB()), 2) + Math.pow((one.getdPoverty() - two.getdPoverty()),2) +
        Math.pow((one.getdPwgt1() - two.getdPwgt1()), 2) + Math.pow((one.getiRagechld() - two.getiRagechld()), 2) +
        Math.pow((one.getdRearning() - two.getdRearning()), 2) + Math.pow((one.getiRelat1() - two.getiRelat1()), 2) +
        Math.pow((one.getiRelat2() - two.getiRelat2()), 2) + Math.pow((one.getiRemplpar() - two.getiRemplpar()), 2) +
        Math.pow((one.getiRiders() - two.getiRiders()), 2) + Math.pow((one.getiRlabor() - two.getiRlabor()), 2) +
        Math.pow((one.getiRownchld() - two.getiRownchld()), 2) + Math.pow((one.getdRpincome() - two.getdRpincome()), 2) +
        Math.pow((one.getiRPOB() - two.getiRPOB()), 2) + Math.pow((one.getiRrelchld() - two.getiRrelchld()), 2) +
        Math.pow((one.getiRspouse() - two.getiRspouse()), 2) + Math.pow((one.getiRvetserv() - two.getiRvetserv()), 2) +
        Math.pow((one.getiSchool() - two.getiSchool()), 2) + Math.pow((one.getiSept80() - two.getiSept80()), 2) +
        Math.pow((one.getiSex() - two.getiSex()), 2) + Math.pow((one.getiSubfam1() - two.getiSubfam1()),2) +
        Math.pow((one.getiSubfam2() - two.getiSubfam2()), 2) + Math.pow((one.getiTmpabsnt() - two.getiTmpabsnt()), 2) +
        Math.pow((one.getdTravtime() - two.getdTravtime()), 2) + Math.pow((one.getiVietnam() - two.getiVietnam()), 2) +
        Math.pow((one.getdWeek89() - two.getdWeek89()), 2) + Math.pow((one.getiWork89() - two.getiWork89()), 2) +
        Math.pow((one.getiWorklwk() - two.getiWorklwk()), 2) + Math.pow((one.getiWWII() - two.getiWWII()), 2) +
        Math.pow((one.getiYearsch() - two.getiYearsch()), 2) + Math.pow((one.getiYearwrk() - two.getiYearwrk()), 2) +
        Math.pow((one.getdYrsserv() - two.getdYrsserv()), 2));
        if(radius <= epsilon) {
            inside = true;
        }return inside;
    }
}
