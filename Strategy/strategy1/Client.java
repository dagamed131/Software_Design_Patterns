public class Client {
    public static void main(String[] args){
        Developer developer = new Developer();

        developer.setCommon(new Shooters());
        developer.doCommon();

        developer.setCommon(new Casual());
        developer.doCommon();

        developer.setCommon(new RPG());
        developer.doCommon();
    }
}
