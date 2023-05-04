public class Ouaf {
    public Ouaf(String name, int age, boolean vaccin){
         this.mName = name;
         this.mAge = age;
         this.mVaccin = vaccin;
        System.out.println("Bonjour je m'appelle : " + this.mName + " je suis un chien de " + this.mAge + " ans" +  (this.mVaccin ? " Je suis vacciné" : " Je ne suis pas vacciné"));
     }
     public String mName;
     public int mAge;
     private boolean mVaccin;
}