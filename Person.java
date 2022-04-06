/*
* This is a class for the CS 4710 project.
* This class creates Person objects from the 1990 US Census data.
* This class uses methods to modify and return fields of the Person object.
*/
package mining;
/*
* Jacob MacLeod
* CS 4710
* Section 01
* Dr. Chung
*/
public class Person {
    private int id;
    private int dAge;
    private int dAncstry1;
    private int dAncstry2;
    private int iAvail;
    private int iCitizen;
    private int iClass;
    private int dDepart;
    private int iDisabl1;
    private int iDisabl2;
    private int iEnglish;
    private int iFeb55;
    private int iFertil;
    private int dHispanic;
    private int dHour89;
    private int dHours;
    private int iImmigr;
    private int dIncome1;
    private int dIncome2;
    private int dIncome3;
    private int dIncome4;
    private int dIncome5;
    private int dIncome6;
    private int dIncome7;
    private int dIncome8;
    private int dIndustry;
    private int iKorean;
    private int iLang1;
    private int iLooking;
    private int iMarital;
    private int iMay75880;
    private int iMeans;
    private int iMilitary;
    private int iMobility;
    private int iMobillim;
    private int dOccup;
    private int iOthrserv;
    private int iPerscare;
    private int dPOB;
    private int dPoverty;
    private int dPwgt1;
    private int iRagechld;
    private int dRearning;
    private int iRelat1;
    private int iRelat2;
    private int iRemplpar;
    private int iRiders;
    private int iRlabor;
    private int iRownchld;
    private int dRpincome;
    private int iRPOB;
    private int iRrelchld;
    private int iRspouse;
    private int iRvetserv;
    private int iSchool;
    private int iSept80;
    private int iSex;
    private int iSubfam1;
    private int iSubfam2;
    private int iTmpabsnt;
    private int dTravtime;
    private int iVietnam;
    private int dWeek89;
    private int iWork89;
    private int iWorklwk;
    private int iWWII;
    private int iYearsch;
    private int iYearwrk;
    private int dYrsserv;
    private boolean visited;
    private boolean inNeighborhood;
    private boolean isInCluster;
    private int cluster;
    public Person() {
    }
    //getters and setters
    /**
    * @return int the value of the dAge attribute
    *
    * The getdAge method gets the dAge attribute of the Person object.
    */
    public int getdAge()
    {
        return dAge;
    }
    /**
    * @return int the value of the dAncstry1 attribute
    *
    * The getdAncstry1 method gets the dAncstry1 attribute of the Person object.
    */
    public int getdAncstry1()
    {
        return dAncstry1;
    }
    /**
    * @return int the value of the dAncstry2 attribute
    *
    * The getdAncstry2 method gets the dAncstry2 attribute of the Person object.
    */
    public int getdAncstry2()
    {
        return dAncstry2;
    }
    /**
    * @return int the value of the iAvail attribute
    *
    * The getiAvail method gets the iAvail attribute of the Person object.
    */


    public int getiAvail()
    {
        return iAvail;
    }
    /**
    * @return int the value of the iCitizen attribute
    *
    * The getiCitizen method gets the iCitizen attribute of the Person object.
    */
    public int getiCitizen()
    {
        return iCitizen;
    }
    /**
    * @return int the value of the iClass attribute
    *
    * The getiClass method gets the iClass attribute of the Person object.
    */
    public int getiClass() {
        return iClass;
    }
    /**
    * @return int the value of the dDepart attribute
    *
    * The getdDepart method gets the dDepart attribute of the Person object.
    */
    public int getdDepart() {
        return dDepart;
    }
    /**
    * @return int the value of the iDisabl1 attribute
    *
    * The getiDisabl1 method gets the iDisabl1 attribute of the Person object.
    */
    public int getiDisabl1() {
        return iDisabl1;
    }
    /**
    * @return int the value of the iDisabl2 attribute
    *
    * The getiDisabl2 method gets the iDisabl2 attribute of the Person object.
    */
    public int getiDisabl2() {
        return iDisabl2;
    }
    /**
    * @return int the value of the iEnglish attribute
    *
    * The getiEnglish method gets the iEnglish attribute of the Person object.
    */
    public int getiEnglish() {
        return iEnglish;
    }
    /**
    * @return int the value of the iFeb55 attribute
    *
    * The getiFeb55 method gets the iFeb55 attribute of the Person object.
    */
    public int getiFeb55() {
        return iFeb55;
    }
    /**
    * @return int the value of the iFertil attribute
    *
    * The getiFertil method gets the iFertil attribute of the Person object.
    */
    public int getiFertil() {
        return iFertil;
    }
    /**
    * @return int the value of the dHispanic attribute
    *
    * The getdHispanic method gets the dHispanic attribute of the Person object.
    */
    public int getdHispanic() {
        return dHispanic;
    }
    /**
    * @return int the value of the dHour89 attribute
    *
    * The getdHour89 method gets the dHour89 attribute of the Person object.
    */
    public int getdHour89() {
        return dHour89;
    }
    /**
    * @return int the value of the dHours attribute
    *
    * The getdHours method gets the dHours attribute of the Person object.
    */
    public int getdHours() {
        return dHours;
    }
    /**
    * @return int the value of the iImmigr attribute
    *
    * The getiImmigr method gets the iImmigr attribute of the Person object.
    */
    public int getiImmigr() {
        return iImmigr;
    }
    /**
    * @return int the value of the dIncome1 attribute
    *
    * The getdIncome1 method gets the dIncome1 attribute of the Person object.
    */
    public int getdIncome1() {
        return dIncome1;
    }
    /**
    * @return int the value of the dIncome2 attribute
    *
    * The getdIncome2 method gets the dIncome2 attribute of the Person object.
    */
    public int getdIncome2() {
        return dIncome2;
    }
    /**
    * @return int the value of the dIncome3 attribute
    *
    * The getdIncome3 method gets the dIncome3 attribute of the Person object.
    */
    public int getdIncome3() {
        return dIncome3;
    }
    /**
    * @return int the value of the dIncome4 attribute
    *
    * The getdIncome4 method gets the dIncome4 attribute of the Person object.
    */
    public int getdIncome4() {
        return dIncome4;
    }
    /**
    * @return int the value of the dIncome5 attribute
    *
    * The getdIncome5 method gets the dIncome5 attribute of the Person object.
    */
    public int getdIncome5() {
        return dIncome5;
    }
    /**
    * @return int the value of the dIncome6 attribute
    *
    * The getdIncome6 method gets the dIncome6 attribute of the Person object.
    */
    public int getdIncome6() {
        return dIncome6;
    }
    /**
    * @return int the value of the dIncome7 attribute
    *
    * The getdIncome7 method gets the dIncome7 attribute of the Person object.
    */
    public int getdIncome7() {
        return dIncome7;
    }
    /**
    * @return int the value of the dIncome8 attribute
    *
    * The getdIncome8 method gets the dIncome8 attribute of the Person object.
    */
    public int getdIncome8() {
        return dIncome8;
    }
    /**
    * @return int the value of the dIndustry attribute
    *
    * The getdIndustry method gets the dIndustry attribute of the Person object.
    */
    public int getdIndustry() {
        return dIndustry;
    }
    /**
    * @return int the value of the iKorean attribute
    *
    * The getiKorean method gets the iKorean attribute of the Person object.
    */
    public int getiKorean() {
        return iKorean;
    }
    /**
    * @return int the value of the iLang1 attribute
    *
    * The getiLang1 method gets the iLang1 attribute of the Person object.
    */
    public int getiLang1() {
        return iLang1;
    }
    /**
    * @return int the value of the iLooking attribute
    *
    * The getiLooking method gets the iLooking attribute of the Person object.
    */
    public int getiLooking() {
        return iLooking;
    }
    /**
    * @return int the value of the iMarital attribute
    *
    * The getiMarital method gets the iMarital attribute of the Person object.
    */
    public int getiMarital() {
        return iMarital;
    }
    /**
    * @return int the value of the iMay75880 attribute
    *
    * The getiMay75880 method gets the iMay75880 attribute of the Person object.
    */
    public int getiMay75880() {
        return iMay75880;
    }
    /**
    * @return int the value of the iMeans attribute
    *
    * The getiMeans method gets the iMeans attribute of the Person object.
    */
    public int getiMeans() {
        return iMeans;
    }
    /**
    * @return int the value of the iMilitary attribute
    *
    * The getiMilitary method gets the iMilitary attribute of the Person object.
    */
    public int getiMilitary() {
        return iMilitary;
    }
    /**
    * @return int the value of the iMobility attribute
    *
    * The getiMobility method gets the iMobility attribute of the Person object.
    */
    public int getiMobility() {
        return iMobility;
    }
    /**
    * @return int the value of the iMobillim attribute
    *
    * The getiMobillim method gets the iMobillim attribute of the Person object.
    */
    public int getiMobillim() {
        return iMobillim;
    }
    /**
    * @return int the value of the dOccup attribute
    *
    * The getdOccup method gets the dOccup attribute of the Person object.
    */
    public int getdOccup() {
        return dOccup;
    }
    /**
    * @return int the value of the iOthrserv attribute
    *
    * The getiOthrserv method gets the iOthrserv attribute of the Person object.
    */
    public int getiOthrserv() {
        return iOthrserv;
    }
    /**
    * @return int the value of the iPerscare attribute
    *
    * The getiPerscare method gets the iPerscare attribute of the Person object.
    */
    public int getiPerscare() {
        return iPerscare;
    }
    /**
    * @return int the value of the dPOB attribute
    *
    * The getdPOB method gets the dPOB attribute of the Person object.
    */
    public int getdPOB() {
        return dPOB;
    }
    /**
    * @return int the value of the dPoverty attribute
    *
    * The getdPoverty method gets the dPoverty attribute of the Person object.
    */
    public int getdPoverty() {
        return dPoverty;
    }
    /**
    * @return int the value of the dPwgt1 attribute
    *
    * The getdPwgt1 method gets the dPwgt1 attribute of the Person object.
    */
    public int getdPwgt1() {
        return dPwgt1;
    }
    /**
    * @return int the value of the iRagechld attribute
    *
    * The getiRagechld method gets the iRagechld attribute of the Person object.
    */
    public int getiRagechld() {
        return iRagechld;
    }
    /**
    * @return int the value of the dRearning attribute
    *
    * The getdRearning method gets the dRearning attribute of the Person object.
    */
    public int getdRearning() {
        return dRearning;
    }
    /**
    * @return int the value of the iRelat1 attribute
    *
    * The getiRelat1 method gets the iRelat1 attribute of the Person object.
    */
    public int getiRelat1() {
        return iRelat1;
    }
    /**
    * @return int the value of the iRelat2 attribute
    *
    * The getiRelat2 method gets the iRelat2 attribute of the Person object.
    */
    public int getiRelat2() {
        return iRelat2;
    }
    /**
    * @return int the value of the iRemplpar attribute
    *
    * The getiRemplpar method gets the iRemplpar attribute of the Person object.
    */
    public int getiRemplpar() {
        return iRemplpar;
    }
    /**
    * @return int the value of the iRiders attribute
    *
    * The getiRiders method gets the iRiders attribute of the Person object.
    */
    public int getiRiders() {
        return iRiders;
    }
    /**
    * @return int the value of the iRlabor attribute
    *
    * The getiRlabor method gets the iRlabor attribute of the Person object.
    */
    public int getiRlabor() {
        return iRlabor;
    }
    /**
    * @return int the value of the iRownchld attribute
    *
    * The getiRownchld method gets the iRownchld attribute of the Person object.
    */
    public int getiRownchld() {
        return iRownchld;
    }
    /**
    * @return int the value of the dRpincome attribute
    *
    * The getdRpincome method gets the dRpincome attribute of the Person object.
    */
    public int getdRpincome() {
        return dRpincome;
    }
    /**
    * @return int the value of the iRPOB attribute
    *
    * The getiRPOB method gets the iRPOB attribute of the Person object.
    */
    public int getiRPOB() {
        return iRPOB;
    }
    /**
    * @return int the value of the iRrelchld attribute
    *
    * The getiRrelchld method gets the iRrelchld attribute of the Person object.
    */
    public int getiRrelchld() {
        return iRrelchld;
    }
    /**
    * @return int the value of the iRspouse attribute
    *
    * The getiRspouse method gets the iRspouse attribute of the Person object.
    */
    public int getiRspouse() {
        return iRspouse;
    }
    /**
    * @return int the value of the iRvetserv attribute
    *
    * The getiRvetserv method gets the iRvetserv attribute of the Person object.
    */
    public int getiRvetserv() {
        return iRvetserv;
    }
    /**
    * @return int the value of the iSchool attribute
    *
    * The getiSchool method gets the iSchool attribute of the Person object.
    */
    public int getiSchool() {
        return iSchool;
    }
    /**
    * @return int the value of the iSept80 attribute
    *
    * The getiSept80 method gets the iSept80 attribute of the Person object.
    */
    public int getiSept80() {
        return iSept80;
    }
    /**
    * @return int the value of the iSex attribute
    *
    * The getiSex method gets the iSex attribute of the Person object.
    */
    public int getiSex() {
        return iSex;
    }
    /**
    * @return int the value of the iSubfam1 attribute
    *
    * The getiSubfam1 method gets the iSubfam1 attribute of the Person object.
    */
    public int getiSubfam1() {
        return iSubfam1;
    }
    /**
    * @return int the value of the iSubfam2 attribute
    *
    * The getiSubfam2 method gets the iSubfam2 attribute of the Person object.
    */
    public int getiSubfam2() {
        return iSubfam2;
    }
    /**
    * @return int the value of the iTmpabsnt attribute
    *
    * The getiTmpabsnt method gets the iTmpabsnt attribute of the Person object.
    */
    public int getiTmpabsnt() {
        return iTmpabsnt;
    }
    public int getdTravtime() {
        return dTravtime;
    }
    public int getiVietnam() {
        return iVietnam;
    }
    public int getdWeek89() {
        return dWeek89;
    }
    public int getiWork89() {
        return iWork89;
    }
    public int getiWorklwk() {
        return iWorklwk;
    }
    public int getiWWII() {
        return iWWII;
    }
    public int getiYearsch() {
        return iYearsch;
    }
    public int getiYearwrk() {
        return iYearwrk;
    }
    public int getdYrsserv() {
        return dYrsserv;
    }
    public boolean getVisited() {
        return visited;
    }
    public int getId() {
        return id;
    }
    public boolean getisInCluster() {
        return isInCluster;
    }
    public int getCluster() {
        return cluster;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setdAge(int dAge) {
        this.dAge = dAge;
    }
    public void setdAncstry1(int dAncstry1) {
        this.dAncstry1 = dAncstry1;
    }
    public void setdAncstry2(int dAncstry2) {
        this.dAncstry2 = dAncstry2;
    }
    public void setiAvail(int iAvail) {
        this.iAvail = iAvail;
    }
    public void setiCitizen(int iCitizen) {
        this.iCitizen = iCitizen;
    }
    public void setiClass(int iClass) {
        this.iClass = iClass;
    }
    public void setdDepart(int dDepart) {
        this.dDepart = dDepart;
    }
    public void setiDisabl1(int iDisabl1) {
        this.iDisabl1 = iDisabl1;
    }
    public void setiDisabl2(int iDisabl2) {
        this.iDisabl2 = iDisabl2;
    }
    public void setiEnglish(int iEnglish) {
        this.iEnglish = iEnglish;
    }
    public void setiFeb55(int iFeb55) {
        this.iFeb55 = iFeb55;
    }
    public void setiFertil(int iFertil) {
        this.iFertil = iFertil;
    }
    public void setdHispanic(int dHispanic) {
        this.dHispanic = dHispanic;
    }
    public void setdHour89(int dHour89) {
        this.dHour89 = dHour89;
    }
    public void setdHours(int dHours) {
        this.dHours = dHours;
    }
    public void setiImmigr(int iImmigr) {
        this.iImmigr = iImmigr;
    }
    public void setdIncome1(int dIncome1) {
        this.dIncome1 = dIncome1;
    }
    public void setdIncome2(int dIncome2) {
        this.dIncome2 = dIncome2;
    }
    public void setdIncome3(int dIncome3) {
        this.dIncome3 = dIncome3;
    }
    public void setdIncome4(int dIncome4) {
        this.dIncome4 = dIncome4;
    }
    public void setdIncome5(int dIncome5) {
        this.dIncome5 = dIncome5;
    }
    public void setdIncome6(int dIncome6) {
        this.dIncome6 = dIncome6;
    }
    public void setdIncome7(int dIncome7) {
        this.dIncome7 = dIncome7;
    }
    public void setdIncome8(int dIncome8) {
        this.dIncome8 = dIncome8;
    }
    public void setdIndustry(int dIndustry) {
        this.dIndustry = dIndustry;
    }
    public void setiKorean(int iKorean) {
        this.iKorean = iKorean;
    }
    public void setiLang1(int iLang1) {
        this.iLang1 = iLang1;
    }
    public void setiLooking(int iLooking) {
        this.iLooking = iLooking;
    }
    public void setiMarital(int iMarital) {
        this.iMarital = iMarital;
    }
    public void setiMay75880(int iMay75880) {
        this.iMay75880 = iMay75880;
    }
    public void setiMeans(int iMeans) {
        this.iMeans = iMeans;
    }
    public void setiMilitary(int iMilitary) {
        this.iMilitary = iMilitary;
    }
    public void setiMobility(int iMobility) {
        this.iMobility = iMobility;
    }
    public void setiMobillim(int iMobillim) {
        this.iMobillim = iMobillim;
    }
    public void setdOccup(int dOccup) {
        this.dOccup = dOccup;
    }
    public void setiOthrserv(int iOthrserv) {
        this.iOthrserv = iOthrserv;
    }
    public void setiPerscare(int iPerscare) {
        this.iPerscare = iPerscare;
    }
    public void setdPOB(int dPOB) {
        this.dPOB = dPOB;
    }
    public void setdPoverty(int dPoverty) {
        this.dPoverty = dPoverty;
    }
    public void setdPwgt1(int dPwgt1) {
        this.dPwgt1 = dPwgt1;
    }
    public void setiRagechld(int iRagechld) {
        this.iRagechld = iRagechld;
    }
    public void setdRearning(int dRearning) {
        this.dRearning = dRearning;
    }
    public void setiRelat1(int iRelat1) {
        this.iRelat1 = iRelat1;
    }
    public void setiRelat2(int iRelat2) {
        this.iRelat2 = iRelat2;
    }
    public void setiRemplpar(int iRemplpar) {
        this.iRemplpar = iRemplpar;
    }
    public void setiRiders(int iRiders) {
        this.iRiders = iRiders;
    }
    public void setiRlabor(int iRlabor) {
        this.iRlabor = iRlabor;
    }
    public void setiRownchld(int iRownchld) {
        this.iRownchld = iRownchld;
    }
    public void setdRpincome(int dRpincome) {
        this.dRpincome = dRpincome;
    }
    public void setiRPOB(int iRPOB) {
        this.iRPOB = iRPOB;
    }
    public void setiRrelchld(int iRrelchld) {
        this.iRrelchld = iRrelchld;
    }
    public void setiRspouse(int iRspouse) {
        this.iRspouse = iRspouse;
    }
    public void setiRvetserv(int iRvetserv) {
        this.iRvetserv = iRvetserv;
    }
    public void setiSchool(int iSchool) {
        this.iSchool = iSchool;
    }
    public void setiSept80(int iSept80) {
        this.iSept80 = iSept80;
    }
    public void setiSex(int iSex) {
        this.iSex = iSex;
    }
    public void setiSubfam1(int iSubfam1) {
        this.iSubfam1 = iSubfam1;
    }
    public void setiSubfam2(int iSubfam2) {
        this.iSubfam2 = iSubfam2;
    }
    public void setiTmpabsnt(int iTmpabsnt) {
        this.iTmpabsnt = iTmpabsnt;
    }
    public void setdTravtime(int dTravtime) {
        this.dTravtime = dTravtime;
    }
    public void setiVietnam(int iVietnam) {
        this.iVietnam = iVietnam;
    }
    public void setdWeek89(int dWeek89) {
        this.dWeek89 = dWeek89;
    }
    public void setiWork89(int iWork89) {
        this.iWork89 = iWork89;
    }
    public void setiWorklwk(int iWorklwk) {
        this.iWorklwk = iWorklwk;
    }
    public void setiWWII(int iWWII) {
        this.iWWII = iWWII;
    }
    public void setiYearsch(int iYearsch) {
        this.iYearsch = iYearsch;
    }
    public void setiYearwrk(int iYearwrk) {
        this.iYearwrk = iYearwrk;
    }
    public void setdYrsserv(int dYrsserv) {
        this.dYrsserv = dYrsserv;
    }
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public void setinNeighborhood(boolean inNeighborhood) {
        this.inNeighborhood = inNeighborhood;
    }
    public void setisInCluster(boolean isInCluster) {
        this.isInCluster = isInCluster;
    }
    public boolean getinNeighborhood() {
        return inNeighborhood;
    }
    public void setCluster(int cluster) {
        this.cluster = cluster;
    }
}
