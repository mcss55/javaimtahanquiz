public class SadeArrayNumune {
    public static void main(String[] args) {
        Person ali=new Person("Ali",19);
        Person mamed=new Person("Mamed",25);
        Person[] personArray=new Person[2];
        personArray[0]=ali;
        personArray[1]=mamed;
        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i]);
        }
    }
}
