import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//I forget to write the comments here
public class Main {
PAK_UNIVERSITIES[] universities= new PAK_UNIVERSITIES[100];
String []keys = new String[100];

private static final HASH_Of_UNI map = new HASH_Of_UNI(100);
    public void insertIntoMap(){
        for(int i=0;i<100;i++)map.addData(keys[i],universities[i]);
    }
private  static  final StachUni  myStack1= new StachUni();
private  static  final StachUni  myStack2= new StachUni();
public static HASH_Of_UNI getMap(){return map;}

    public void  readFile(){

        File file=new File("UniversitiesData.csv");
        File file1=new File("UniKey.txt");
        try {
            int i=0;
            Scanner scan = new Scanner(file);
            Scanner scanner=new Scanner(file1);
            while (scan.hasNextLine()){
                String[] parts= scan.nextLine().split(",");
                universities[i]=new PAK_UNIVERSITIES(parts[0],Integer.parseInt(parts[1]),
                        Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),
                        parts[4],parts[5],Integer.parseInt(parts[6]));
                keys[i]=scanner.nextLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        insertIntoMap();
        insertIntoStack("noOfPublications");
        insertIntoStack("PakRanking");

    }
    private static final StachUni SindhUETs=new StachUni();
    private static final StachUni PunjabUETs=new StachUni();
    private static final StachUni BalochistanUETs=new StachUni();
    private static final StachUni KPK_UETs=new StachUni();
    private static final StachUni AJK_UETs=new StachUni();
    private static final StachUni GilgitBiltistanUETs=new StachUni();
    public void insertIntoStack(String orderBy){
        for(int i=0;i<100;i++){
            if(orderBy.equals("noOfPublications")) myStack1.push(keys[i],universities[i],orderBy);
            else if(orderBy.equals("PakRanking")){
                myStack2.push(keys[i],universities[i],orderBy);
                switch (universities[i].getProvince()){
                    case "Sindh"->SindhUETs.push(keys[i],universities[i],orderBy);
                    case "Punjab"->PunjabUETs.push(keys[i],universities[i],orderBy);
                    case "Balochistan"->BalochistanUETs.push(keys[i],universities[i],orderBy);
                    case "KPK"->KPK_UETs.push(keys[i],universities[i],orderBy);
                    case "AJK"->AJK_UETs.push(keys[i],universities[i],orderBy);
                    case "Gilgit Biltistan"->GilgitBiltistanUETs.push(keys[i],universities[i],orderBy);
                }
            }
        }

    }
    public static StachUni getStack1(){return myStack1;}
    public static StachUni getStack2(){return myStack2;}

    public static StachUni getSindhUETs() {
        return SindhUETs;
    }

    public static StachUni getPunjabUETs() {
        return PunjabUETs;
    }

    public static StachUni getGilgitBiltistanUETs() {
        return GilgitBiltistanUETs;
    }

    public static StachUni getKPK_UETs() {
        return KPK_UETs;
    }

    public static StachUni getBalochistanUETs() {
        return BalochistanUETs;
    }

    public static StachUni getAJK_UETs() {
        return AJK_UETs;
    }

}