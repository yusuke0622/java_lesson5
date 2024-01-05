public class Buki extends Item {
    
    Buki(String name, int value) {
        //スーパクラスのコンストラクラ呼び出し
        super(name, value);
    }
    
    public void use() {
        System.out.println(this.name + "でこうでき!!");
        System.out.println("敵に" + this.value + "のダメージ!");
    }
}