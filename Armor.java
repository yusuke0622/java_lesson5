public class Armor extends Item {
    
    Armor(String name, int value) {
        super(name, value);
    }
    
    public void use() {
        System.out.println(this.name + "を身につけた");
        System.out.println("守備力が" + this.value + "上がった");
    }
}