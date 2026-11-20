class Exp40_2 {
	public static void main(String[] args) {
		Monster[] monsters = {
				new Dragon("フレイムドラゴン", 60),
				new Ghost("シャドウゴースト", 35),
				new Dragon("アイスドラゴン", 45)
		};

		for (int i = 0; i < monsters.length; i++) {
			System.out.println("【モンスターがあらわれた】");
			monsters[i].showName();

			System.out.println("【モンスターのこうげき】");
			System.out.println("ダメージ：" + monsters[i].calculateDamage());

			System.out.println();
		}
	}
}