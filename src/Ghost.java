class Ghost extends Monster {
	private int magic;

	Ghost(String name, int magic) {
		super(name);
		this.magic = magic;
	}

	@Override
	public int calculateDamage() {
		return this.magic * 3;
	}
}