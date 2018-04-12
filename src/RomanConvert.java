public class RomanConvert {

      public static int parseRoman(String input){
        int decimal = 0;

        String romanNumeral = input.toUpperCase();

        for (int i = 0; i <romanNumeral.length() ; i++) {

          char convertToDecimal = input.charAt(c);

          switch (convertToDecimal) {
            case 'I':
              decimal += 1;
              break;
            case 'V':
              decimal += 5;
              break;
            case 'X':
              decimal += 10;
              break;
            case 'L':
              decimal += 50;
              break;
            case 'C':
              decimal += 100;
              break;
            case 'D':
              decimal += 500;
              break;
            case 'M':
              decimal += 1000;
              break;
            case 'I' + 'V':
              decimal += 4;
              break;
            case 'I' + 'X':
              decimal += 9;
              break;
            case 'X' + 'L':
              decimal += 40;
              break;
            case 'X' + 'C':
              decimal += 90;
              break;
            case 'C' + 'D':
              decimal += 400;
              break;
            case 'C' + 'M':
              decimal += 900;
              break;
          }

        }
      return decimal;
  }


}









