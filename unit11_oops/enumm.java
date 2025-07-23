public class enumm {
    public static void main(String[] args) {
        // if enum inside class that enum is limited to that class
        // else can be access in any class
        for(year i:year.values()){//accessing enum enum name typr var:enum.values()
            System.out.println(i);

        }
    }
    
}
enum year{
    jan,feb,mar,apr,may;
}
