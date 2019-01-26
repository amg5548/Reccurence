
public class Library {

    public static String reccurenceFinder(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int counter = 0;
            stringBuilder.append(String.valueOf(string.charAt(i)));
            for (int j = 0; j < stringBuilder.length(); j++) {
                if (String.valueOf(string.charAt(i)).equals(String.valueOf(stringBuilder.charAt(j)))) {
                    counter++;
                }
                if (counter == 2) {
                    return String.valueOf(string.charAt(i));
                }
            }
        }
        return "No recurring values for given string!";
    }
}
