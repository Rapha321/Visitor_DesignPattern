public class Chat implements Animal{

    @Override
    public void communiquer() {
        System.out.println("Miaule");
        
    }

    @Override
    public void communiquer(Chien chien) {
        System.out.println("Chat communique avec un Chien");
        
    }

    @Override
    public void communiquer(Chat chat) {
        System.out.println("Chat communique avec un Chat");
        
    }

    // DEFAULT
    // public void communiquer(Animal animal) {
    //     System.out.println("Animal communique avec un Chat");
        
    // }

    
}
