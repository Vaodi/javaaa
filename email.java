public class email {
    public static void main(String[] args) {
   //  isAlphanumeric('A');
   //  isValidDomainChar(' ');

    // getDomain("Jacoblalement@eliasMhamdi");
  // getPrefix("Chirac@josephine.com");
  // isValidPrefix("abc_.a@mail.com");
 // isValidDomain("karan.sharma@mail.mcgill.ca");
//    exactlyOneAt("tesos@gmail.com");
      isValidEmail("karan.sharma@mail.mcgill.ca");

    }

    public static boolean isValidEmail (String email) {

        System.out.println("1. is valid prefix est" + isValidPrefix(email));
         System.out.println("2. is valid DOMAIN est" + isValidDomain(email));
        System.out.println("3. is valid EXACTLYONEAT est" + exactlyOneAt(email));

        if (isValidPrefix(email) && isValidDomain(email) && exactlyOneAt(email)) {
            System.out.println("AHHHHHHH ton truc est true");
            return true;
        } else {
        System.out.println("XXXXXX ton truc est false");
        return false;}
    }

    public static boolean exactlyOneAt (String emailCheck) {
        String someString = emailCheck;
        char someChar = '@';
        int count = 0;

        for (int i = 0; i < emailCheck.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }
        }
        if (count>1) {
            System.out.println("Il y'a plus de 2 @@@");
            return false;
        }
        System.out.println("Tu n'a pas de soucis de mon ami @@@");
        return true;
    }


   public static boolean isAlphanumeric(char letter){
            boolean a;
       if ((letter>='0' && letter<='9') ||(letter>='A' && letter<='Z')||(letter>='a' && letter<='z')) {
           a = true;

       } else {
          a = false;

       }
//       System.out.println("bob " + a);
        return a;
    }

    public static boolean isValidPrefixChar(char prefix){
            boolean b;
        if (isAlphanumeric(prefix) || (prefix == '_' || prefix == '-' || prefix == '.')){
             b =true;


        } else {
             b = false;

        }
        System.out.println("this is " + b);
        return b;
    }
    public static boolean isValidDomainChar(char prefix){
        boolean c;
        if (isAlphanumeric(prefix) || (prefix == '-' || prefix == '.')){
            c =true;


        } else {
            c = false;

        }
        System.out.println("this iiiiis " + c);
        return c;
    }

//    public static boolean exactlyOneAt(String email) {
//
//        for (int i=0; i< email.length(); i++){
//
//        }
//    }
    public static String getDomain(String emailAdress) {


        String emailAdressOutput = emailAdress.substring(emailAdress.lastIndexOf("@") + 1);
        System.out.println(emailAdressOutput);
        return emailAdressOutput;

    }

    public static String getPrefix(String possibleEmail) {
        String part = possibleEmail.substring(0 , possibleEmail.indexOf("@"));
        System.out.println("pikachu est " + part);
        return part;

    }

    public static Boolean isValidPrefix(String isPrefixValid ){
        // String aicha = isPrefixValid.substring(0,isPrefixValid.indexOf("@"));
        String prefix = getPrefix(isPrefixValid);
       System.out.println("John cena is " + prefix);

        boolean jacob;

        if(prefix.length()<=0)
        {
            System.out.println("OPTION 1");
            jacob = false;
            return jacob;
        }


        for (int i=0; i<prefix.length();i++ ){

            // the second part of this if statement is problematic
            if((!isAlphanumeric(prefix.charAt(0)))||(!isAlphanumeric(prefix.charAt(prefix.length()-1))))
            {
                System.out.println("OPTION 2");
                jacob = false;
                return jacob;
            }

            if (!isValidPrefixChar(prefix.charAt(i))) {
                System.out.println("OPTION 3");
                jacob = false;
                return jacob;
            }

            if(prefix.charAt(i)=='_'|| prefix.charAt(i)=='.' || prefix.charAt(i)=='-')

            {
                System.out.println("OPTION 4");
                if((i+1<prefix.length())&&(!isAlphanumeric(prefix.charAt(i+1))))
                {
                    System.out.println("OPTION 5");
                    jacob = false;
                    return jacob;
                }
            }

            System.out.println("OPTION 6");
            jacob = true;
            System.out.println("your thing is jhbajhbf " + jacob);

//            System.out.println(isValidPrefixChar(isPrefixValid.charAt(i)));
//            boolean bg = isValidPrefixChar(isPrefixValid.charAt(i));
//           System.out.println(isValidPrefixChar(i));

        }

        return  true;
//    isValidDomainChar("put here the first letter os isPrefixValid")
//    isValidDomainChar("put here the last letter os isPrefixValid")

   }

      public static boolean isValidDomain(String isPrefixValid) {
      String domain = getDomain(isPrefixValid);

          if (!domain.contains(".")) {
              System.out.println("Option A");
              System.out.println("je n'ai pas de point");
              return false;
          }

          if (domain.contains(".")) {
              System.out.println("Option B");
          String firstDomain = domain.substring(0,domain.indexOf("."));
          String secondDomain = domain.substring(domain.indexOf("."),domain.length());
          System.out.println("I go here");
          System.out.println("33. first domain is" + firstDomain);
          System.out.println("44. second domain is " + secondDomain);

          // isValidPrefix(firstDomain);



          if (secondDomain.length()<=1) {
              System.out.println("Option C");
              return false;
          }


          for (int i=0; i<secondDomain.length();i++ ){

              if (secondDomain.charAt(i ) == '.'){
                  if (secondDomain.charAt(i + 1 ) == '.'){
                      System.out.println("j'ai 2 points suivis");
                      return false;
                  }
              }


              if(!(secondDomain.charAt(i)>'A' && secondDomain.charAt(i)<'Z' || secondDomain.charAt(i)>'a' && secondDomain.charAt(i)<'z'))
              {
                  if (secondDomain.charAt(i) == '.') {
                      System.out.println("Option ca va ");
                      return true;
                  }

                  System.out.println("Option D");

                  return false;
              }
          }


          if (firstDomain.length()>0 && secondDomain.length()>0) {
              System.out.println("Option E");
              System.out.println("You are True my friend");
              return true;
          } else {
              System.out.println("Option F");
              System.out.println("You are False my friend");
              return false;
          }
      }

    return true;
    }

}
