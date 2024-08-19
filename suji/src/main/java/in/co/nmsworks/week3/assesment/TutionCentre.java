package in.co.nmsworks.week3.assesment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 class Q4 {
    Map<String, List<TutionCentre>> map;
    List<TutionCentre> chennai=new ArrayList<>();
    List<TutionCentre> salem=new ArrayList<>();
    List<TutionCentre> madurai=new ArrayList<>();
public void display() {
    TutionCentre CH01 = new TutionCentre(30, 40, 50, 40, 20);
    TutionCentre SA01 = new TutionCentre(25, 35, 30, 40, 0);
    TutionCentre MD01 = new TutionCentre(20, 30, 40, 30, 0);

    chennai.add(CH01);
    salem.add(SA01);
    madurai.add(MD01);

    map=new HashMap<>();
    map.put("CHENNAI-CH01",chennai);
    map.put("SALEM-SA01",salem);
    map.put("MADURAI-MD01",madurai);

    for (Map.Entry<String,List<TutionCentre>> i:map.entrySet())
    {
        System.out.println(i.getKey()+" "+i.getValue());
    }

}
    public static void main(String[] args) {

Q4 ob=new Q4();
ob.display();

    }

}

 class TutionCentre {
    int phy;
    int bio;
    int maths;
    int hindi;
     int chem;
     public int getPhy() {
         return phy;
     }
     public TutionCentre(int phy,int chem,int bio,int maths,int hindi)
     {
         this.phy = phy;
         this.bio = bio;
         this.maths = maths;
         this.hindi = hindi;
         this.chem = chem;
     }

     public int getBio() {
         return bio;
     }


     public int getMaths() {
         return maths;
     }


     public int getHindi() {
         return hindi;
     }
     public int getChem() {
         return chem;
     }

     @Override
     public String toString() {
         return "TutionCentre{" +
                 "phy=" + phy +
                 ", bio=" + bio +
                 ", maths=" + maths +
                 ", hindi=" + hindi +
                 ", chem=" + chem +
                 '}';
     }

 }
