public class Miaou {
    private String mName;
    private int mAge;
    private boolean mVaccin;
    private String mAction;

    public Miaou(String name, int age, boolean vaccin, String action){
       // System.out.println("Je suis le chat" + this); // this donne la "référence de l'instance" dans la console
        this.mName = name;
        this.mAge = age;
        this.mVaccin = vaccin;
        this.mAction = action;
       // System.out.println("Bonjour je m'appelle : " + this.mName + " je suis un chat de " + this.mAge + " ans, vaccin : " + this.mVaccin);
    //   System.out.println("Bonjour je m'appelle : " + this.mName + " je suis un chat de " + this.mAge + " ans" +  (this.mVaccin ? " Je suis vacciné" : " Je ne suis pas vacciné"));
    }
 public int getAge(){
    return mAge;
 }

 public String getName(){
    return mName;
 }

 public boolean getVaccin(){
    return mVaccin;
 }

 public String getAction(){
    return mAction;
 }
}
