public class Main {
    public static void main(String[] args) {
        //親クラス型の変数に子クラスのインスタンスを代入できる（継承関係のため）
        //itemsとういう配列に異なるクラスを持たせることで、forループを使って効率よく呼び出すことができる
        Item[] items = { 
            new Buki("鉄の剣", 20), 
            new Armor("皮の服", 10)
            };
        
        //上記の配列(items)の要素がitemに入る
        //useメソッドに代入し処理する
        for (Item item : items) {
            item.use();
        }
    }
}