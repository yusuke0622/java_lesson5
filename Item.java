public abstract class Item {
//抽象メソッドをもつクラスは、必ず「抽象クラス」になる
    String name;
    int value;
    
    Item (String name, int value) {
        this.name = name;
        this.value = value;
    }
    //抽象メソッド
    public abstract void use();
}