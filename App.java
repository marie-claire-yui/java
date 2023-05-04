// portee - constuire un  objet comme étant une classe - nom de la classe identique au nom du fichier
public class App {
    public static void main(String[] args){
       // System.out.println("Salut les devs");
     //   Miaou tom = new Miaou(); // instance de la classe Miaou
     //   Miaou tom2 = new Miaou(); // chaque  instance de chat aura une allocation mémoire, un espace qui lui est alloué, il existe un réfèrencement pour le retrouver 
    Miaou c = new Miaou("Tom",1,false);
    Miaou c2 = new Miaou("Félix",2,true);
  //  Ouaf d = new Ouaf("Snoopy",12,false)
       // Ouaf jingle =  new Ouaf();
        name(c);
        name(c2);

    }
    public static void name(Miaou chat) {
    //    System.out.println("c.mAge" + chat.getAge());
    //    System.out.println("c.mName" + chat.getName());  
    //    System.out.println("c.mName" + chat.getVaccin());  
    System.out.println("Bonjour je m'appelle: " +chat.getAge()+ " je suis un chat de : "+chat.getAge()+ " et " +(chat.getVaccin()?"je suis vacciné":"je ne suis pas vacciné"));     
    }

 
}


