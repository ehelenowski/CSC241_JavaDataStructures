package Lab10;

public interface Hashable {
	public int hash(int sizeTable);
	public String toString();
	public boolean equals(Hashable that);
	public int getValue();
}