public class Chien implements Animal{

    @Override
    public void communiquer() {
        System.out.println("Aboyer");
        
    }


    @Override
    public void communiquer(Chien chien) {
        System.out.println("Chien communique avec un Chien");
        
    }

    @Override
    public void communiquer(Chat chat) {
        System.out.println("Chien communique avec un Chat");
        
    }

    // DEFAULT
    // @Override
    // public void communiquer(Animal animal) {
    //     System.out.println("Animal communique avec un Chien");
        
    // }
    
    
}
