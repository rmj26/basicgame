import java.util.Locale;

public class strings {


    public static void main (String [] args )

    {
       // String jj= "Hello how are you"; // value of string

        //System.out.println(jj); // printing string
        //System.out.println(jj.indexOf("how")); // searching for the index where it is located from start
        //System.out.println(jj.lastIndexOf("are"));// searching for the index where it located from end of string
        //System.out.println(jj.lastIndexOf("l")); // it alwasy start counting from first index and moves forward

  //  String aa ="Shelly sell sea shells down by the sea shore."; // string

    //    System.out.println(aa); // printing the string
      //  System.out.println(aa.lastIndexOf("sea")); // printing the last index of string from start
       // System.out.println(aa.indexOf("sea")); // printing the first index of string from start
       // System.out.println("The first index of the word sea is \t " + aa.indexOf("sea") + "last index is \t"+ aa.lastIndexOf("sea"));

      //  String aa = "Junaid raja";// string
        //char  array [] = new char[11]; // array with 11 characters
        //char array2[]= new char[10];
        //aa.getChars(0,6,array,0);
        // 0 means source begining in the string
        // 6 means the last word of the source
        // array is the name of the array where you want to store the data
        // 0 is the index of array where you are storing the said data
        //aa.getChars(3,8,array2,3);
        //System.out.println(array[0]);
        //System.out.println(array[1]);
        //System.out.println(array[2]);
        //System.out.println(array[3]);
        //System.out.println(array[4]);
        //System.out.println(array[5]);// so that will print just one character because that is the only one stored
        //System.out.println();
        //System.out.println(array2[3]);
        //System.out.println(array2[4]);
        //System.out.println(array2[5]);
   // String jj = "I really like this restaurant";
     //   System.out.println(jj);
       // System.out.println(jj.toUpperCase(Locale.ROOT));
        //String aa= "WHAT ARE YOU DOING";
       // System.out.println(aa.toLowerCase(Locale.ROOT));
       // String password= "apples"; // string
       // String passwordtypedin= "APPLES"; // string
        //passwordtypedin=passwordtypedin.toLowerCase(Locale.ROOT); // convert into lowercase
        //if (password.equals(passwordtypedin)) // if statement
        //{
          //  System.out.println("password accepted");
        //}

        // REPLACING CHARACTERS IN A STRING
        String jj = "Welcome to the black parade";
        System.out.println(jj); // print
        jj=jj.replace('t','T'); // whereever you will see t it will be replace by T
        System.out.println(jj);
        jj=jj.replace("black", "White"); // replacing the whole character sequence
        System.out.println(jj);

        String aa= "junaid went to Washington";
        System.out.println(aa);
        aa=aa.replace('j','J');
        aa=aa.replace('w','W');
        aa=aa.replace("dc","DC");
        System.out.println(aa);
    }
}


