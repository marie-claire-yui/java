// portee - constuire un  objet comme étant une classe - nom de la classe identique au nom du fichier

import java.util.Scanner;

public class App {
    public static void main(String[] args){
       // System.out.println("Salut les devs");
     //   Miaou tom = new Miaou(); // instance de la classe Miaou
     //   Miaou tom2 = new Miaou(); // chaque  instance de chat aura une allocation mémoire, un espace qui lui est alloué, il existe un réfèrencement pour le retrouver 
    Miaou c = new Miaou("Tom",1,false,"miaou");
    Miaou c2 = new Miaou("Félix",2,true,"miaou");
  //  Ouaf d = new Ouaf("Snoopy",12,false)
       // Ouaf jingle =  new Ouaf();
        name(c);
      name(c2);

    }
    public static void name(Miaou chat) {
    //    System.out.println("c.mAge" + chat.getAge());
    //    System.out.println("c.mName" + chat.getName());  
    //    System.out.println("c.mName" + chat.getVaccin()); 
     Scanner scanner = new Scanner( System.in ); 
    System.out.println("Bonjour je m'appelle: " +chat.getName()+ " je suis un chat de : "+chat.getAge()+ " ans et " +(chat.getVaccin()?"je suis vacciné":"je ne suis pas vacciné")+" Voulez-vous que je miaule?");     
    String reponse = scanner.nextLine();
    if (reponse.equals("oui")){
        System.out.println(chat.getAction());
    }else {
        System.out.println("ronron");
    }
  //   scanner.close();

}

 
}


