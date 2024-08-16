package in.co.nmsworks.week2;

import in.co.nmsworks.week2.collections.contactdirectory.Contact;

import java.util.*;

public class MapPractice {

    static Map<Integer,Set<String>> movieMap = new HashMap<>();

    private String[] getDataAsArray()
    {
        return new String[] {
                "Ninaithale Inikkum-1979",
                "Kudiyirundha Koyil-1968",
                "Ulagam Suttrum Valiban-1973",
                "Vennira Aadai-1965",
                "Thangapathakkam-1974",
                "Kakka Kakka-2003",
                "Sila Nerangalil Sila Manidhargal-1976",
                "Muthalali-1966",
                "Kalyana Parisu-1959",
                "Aboorva Sagodharargal-1989",
                "Sathi Leelavathi-1995",
                "Nenjathai Killathe-1980",
                "Nizhalgal-1980",
                "Paarthiban Kanavu-2003",
                "Siva Kangal-1977",
                "Sangam-1964",
                "Azhagiya Tamil Magan-2007",
                "Thiruvilayadal-1965",
                "Kappalottiya Thamizhan-1953",
                "Devar Magan-1992",
                "Maanagaram-2017",
                "Kali-2016",
                "Chidambara Rahasiyam-1957",
                "Nadodigal-2009",
                "Rajavin Parvaiyile-1995",
                "Kizhakku Vasal-1990",
                "Chinna Thambi-1991",
                "Nadodigal-2009",
                "Raja Chinna Roja-1989",
                "Manichitrathazhu-1993",
                "Kaalal-2003",
                "Thiruda Thiruda-1993",
                "Mudhalvan-1999",
                "Kandukondain Kandukondain-2000",
                "Kokki-2003",
                "Vettaiyaadu Vilaiyaadu-2006",
                "Kalyanaraman-1979",
                "Kamal Haasan's Vikram-1986",
                "Rajapattai-2011",
                "Thirunavukkarasu-1988",
                "Kumki-2012",
                "Mankatha-2011",
                "Kalamellam Neeye-1990",
                "Jodi-1999",
                "Iruttu Araiyil Murattu Kuththu-2018",
                "Kollam Avittam-1968",
                "Azhagi-2002",
                "Vetri Vizha-1989",
                "Raja Raja Cholan-1958",
                "Apoorva Sagodharargal-1989",
                "Nenjil Or Aalayam-1962",
                "Thiruda Thiruda-1993",
                "Kandha Kadamba-1987",
                "Sabaash Meena-1992",
                "Meera-1979",
                "Singam-2010",
                "Engeyum Eppothum-2011",
                "Sathuranga Vettai-2014",
                "Marupuram-1992",
                "Kavikuyil-1954",
                "Gopurangal Saivathillai-1982",
                "Peranbu-2018",
                "Vasandham-2001",
                "Madhura-2005",
                "Bharathi-1956",
                "Sathyaraj's Raajathi Raja-1989",
                "Paasa Muthirai-2001",
                "Senthamizh Paattu-1982",
                "Chinna Gounder-1992",
                "Muthu-1995",
                "Rajapattai-2011",
                "Sivakumar's Naalai Namadhe-1975",
                "Ninaithale Inikkum-1979",
                "Yaaradi Nee Mohini-2008",
                "Pariyerum Perumal-2018",
                "Rajinikanth's Petta-2019",
                "Kalyana Parisu-1959",
                "Annamalai-1992",
                "Thiruvizha-1989",
                "Bhagyaraj's Mundhanai Mudichu-1983",
                "Kannan-2006",
                "Oru Thalai Mutham-1982",
                "Kamal Haasan's Moondram Pirai-1982",
                "Pokkiri-2007",
                "Netrikkan-1981",
                "Marupuram-1992",
                "Sillunu Oru Kaadhal-2006",
                "Ullathai Allitha-1996",
                "Rajinikanth's Enthiran-2010",
                "Chinna Thambi-1991",
                "Sathya-1988",
                "Jigarthanda-2014",
                "Putham Pudhu Kaalai-2020",
                "Thappu Thanda-1992",
                "Sathya-1988",
                "Mouna Ragam-1986",
                "Pallavi Anu Pallavi-1983",
                "Kizhakku Vasal-1990",
                "Kandukondain Kandukondain-2000",
                "Avargal-1977",
                "Parasakthi-1952",
                "Karnan-1964",
                "Madhumati-1958",
                "Anbe Sivam-2003",
                "Thiruvilayadal-1965",
                "Sankarabharanam-1979",
                "Muthalali-1966",
                "Chidambaram-1985",
                "Baashha-1995",
                "Thalapathi-1991",
                "Indian-1996",
                "Enthiran-2010",
                "Guru-2007",
                "Moondram Pirai-1982",
                "Vikram Vedha-2017",
                "Pudhupettai-2006",
                "Sethu-1999",
                "Ratsasan-2018",
                "Nayakan-1987",
                "Kakka Kakka-2003",
                "Master-2021",
                "Mankatha-2011",
                "Super Deluxe-2019",
                "Aruvi-2017",
                "Aadukalam-2011",
                "Ghajini-2005",
                "Kamal Haasan's Dasavathaaram-2008",
                "Vada Chennai-2018",
                "Kaatru Veliyidai-2017",
                "Iruvar-1997",
                "Siva-1989",
                "Kangalal Kaidhu Sei-2003",
                "Vikram-1986",
                "Kizhakku Cheemayile-1993",
                "Petta-2019",
                "Pallavi Anu Pallavi-1983",
                "Veerapandiya Kattabomman-1959",
                "Kandukondain Kandukondain-2000",
                "Nermai-1992",
                "Thiruttu Payale-2006",
                "Mankatha-2011",
                "Thangamagan-2015",
                "Thevar Magan-1992",
                "Sathya-1988",
                "Jigarthanda-2014",
                "Thuppakki-2012",
                "Mouna Ragam-1986",
                "Rajaparvai-1985",
                "Alaipayuthey-2000",
                "Kumbakarna-1960"
        };
    }

    public static void main(String[] args) {
        MapPractice mapExample = new MapPractice();
        String[] moviesDataArray = mapExample.getDataAsArray();
        toList(moviesDataArray);
        displayDetails();
    }

    public static void toList(String[] moviesDataArray){
        List<String> movieNames = new ArrayList<>();
        List<Integer> year = new ArrayList<>();

        for (String s : moviesDataArray) {
            String[] movieName = s.split("-");
            movieNames.add(movieName[0]);
            year.add(Integer.valueOf(movieName[1]));
        }

        for (int i = 0; i < moviesDataArray.length; i++) {
            addMovieMap(year.get(i), movieNames.get(i));
        }

    }

    public static void addMovieMap(Integer year, String name) {

        if (movieMap.containsKey(year))
        {
            movieMap.put(year, Collections.singleton(name));
        }
        else
        {
            movieMap.put(year, Collections.singleton(name));
        }
    }
    public static void displayDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year to search  : ");
        Integer name = sc.nextInt();
        Set<String> nameSet = movieMap.get(name);
        Set<String> receivedSet = movieMap.get(name);
        if (receivedSet.isEmpty()){
            System.out.println("Not Found");
            return;
        }
        else{
        for(String values : nameSet){
            System.out.println(values);
        }}
    }

}
