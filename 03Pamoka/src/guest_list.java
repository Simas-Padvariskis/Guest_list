import java.util.Scanner;

public class guest_list {
//---------------------------------------------------------------------------
    public static void listRead (String[] name){
        for (int i = 0; i < name.length; i++){
            Scanner scanner1 = new Scanner (System.in);
            System.out.print("Iveskite svecio varda: ");
            name[i] = scanner1.nextLine();
        }
    }
//---------------------------------------------------------------------------
    public static void printList (String[] name){
        for (int i = 0; i < name.length; i++) {
            System.out.println(i + 1 + ". " + name[i]);
        }
    }
//---------------------------------------------------------------------------
    public static void listCheck (String[] name, String[] bList){
        for (int i = 0; i < bList.length; i++){
            for (int j = 0; j < name.length; j++){
                if (bList[i].equals(name[j])){
                    name[j] = name[j].concat(" (juodam sarase)");
                }
            }
        }
    }
//---------------------------------------------------------------------------
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kiek sveciu sarase? ");
        int number = scanner.nextInt();

        String[] names = new String[number];
        String[] blackList = {"Jonas", "Tomas", "Tadas"};

        listRead(names);

        printList(names);

        scanner.close();

        listCheck(names, blackList);

        System.out.println("Galutinis sarasas: ");
        printList(names);
    }
}
