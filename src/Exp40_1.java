class Exp40_1 {
	public static void main(String[] args) {
		Dragon dragon = new Dragon("レッドドラゴン", 70);
		Ghost ghost = new Ghost("ナイトゴースト", 60);

		dragon.showName();
		System.out.println("ダメージ：" + dragon.calculateDamage());
		ghost.showName();
		System.out.println("ダメージ：" + ghost.calculateDamage());
	}
}