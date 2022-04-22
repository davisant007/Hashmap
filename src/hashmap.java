import java.util.HashMap;



    class Main {



        public static void main(String[] args) {



            HashMap<String, Integer> familyMembers = new HashMap<String, Integer>();



            familyMembers.put("Mia", 2004) ;

            familyMembers.put("Maya", 2006);

            familyMembers. put("Jonus", 2007);

            familyMembers.put("Lily", 2008);

            familyMembers.put ("Kris", 2009) ;

            familyMembers.put("Gibson", 2015) ;

            familyMembers.put ("TBD", 2022);



            System.out.println(familyMembers);



            for (String i : familyMembers.keySet()){

                System.out.println(i + ";" + familyMembers.get(i));



            }





        }


}
