public class Main {
    public static void main(String[] args) {
        CountVietnameseCharacters countVietNam = new CountVietnameseCharacters();
        String inputString = "sadadqowksas";
        int output = countVietNam.countCharacters(inputString);
        System.out.println(output);

    }
}