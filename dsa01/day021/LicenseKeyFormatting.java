package day021;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w-r45-323f-3e-3e";
        int k = 3;
        System.out.println(licenseKeyFormatting(s,k));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder output = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        //split output to array by '-'
        String[] splitDashes = s.split("-");
        String firstGroup = splitDashes[0];
        output.append(firstGroup);

        for (int i = 1; i < splitDashes.length; i++) {
        }


        int j = 1;
        for (int i = 0; i < splitDashes.length; i++) {
            while(j < k){
                temp =
                j++;
                splitDashes.;
            }
            output.append("-").append(temp);

        }
        return output.toString();
    }
}
