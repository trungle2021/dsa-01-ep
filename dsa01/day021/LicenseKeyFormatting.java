package day021;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(licenseKeyFormatting(s,k));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder output = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        //split output to array by '-'
        String[] splitDashes = s.split("-");
        output.append(splitDashes[0]);

        for (int i = 1; i < splitDashes.length; i++) {
            output.append("-");
            if(temp.length() < k ){
                temp.append(splitDashes[i]);

            }
            output.append("-");
            output.append(temp);
        }
        return output.toString();
    }
}
