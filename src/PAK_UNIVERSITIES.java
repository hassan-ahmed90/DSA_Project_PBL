public class PAK_UNIVERSITIES {

private  String uni_Name;
private  String location_Uni;
private  int pak_Rank;
private  int asia_Rank;
int no_Of_Publication;
int world_Ranking;

public PAK_UNIVERSITIES(String uni_Name,String location_Uni,int pak_Rank,int asia_Rank,int no_Of_Publication,int world_Ranking){
    this.asia_Rank=asia_Rank;
    this.pak_Rank=pak_Rank;
    this.location_Uni=location_Uni;
    this.no_Of_Publication=no_Of_Publication;
    this.uni_Name=uni_Name;
    this.world_Ranking=world_Ranking;
}

    public int getPak_Rank() {
        return pak_Rank;
    }

    public int getAsia_Rank() {
        return asia_Rank;
    }

    public int getNo_Of_Publication() {
        return no_Of_Publication;
    }

    public int getWorld_Ranking() {
        return world_Ranking;
    }

    public String getLocation_Uni() {
        return location_Uni;
    }

    public String getUni_Name() {
        return uni_Name;
    }
    public String toString() {
        return uni_Name+" "+no_Of_Publication+" "+location_Uni+" "+world_Ranking+" "+asia_Rank+" "+pak_Rank;
    }
}
