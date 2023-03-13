public class Main {
PAK_UNIVERSITIES[] universities= new PAK_UNIVERSITIES[100];
String []keys = new String[100];

private static final HASH_Of_UNI map = new HASH_Of_UNI(100);
private  static  final StachUni  myStack1= new StachUni();
private  static  final StachUni  myStack2= new StachUni();
public static HASH_Of_UNI getMap(){return map;}


    private static final StachUni SindhUETs=new StachUni();
    private static final StachUni PunjabUETs=new StachUni();
    private static final StachUni BalochistanUETs=new StachUni();
    private static final StachUni KPK_UETs=new StachUni();
    private static final StachUni AJK_UETs=new StachUni();
    private static final StachUni GilgitBiltistanUETs=new StachUni();




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