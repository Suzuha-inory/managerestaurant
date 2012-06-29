package uml.hibernate;

// Generated 2012-6-16 15:50:44 by Hibernate Tools 3.4.0.CR1

/**
 * Tabledish generated by hbm2java
 */
public class Tabledish implements java.io.Serializable {

	private Integer menuid;
	private Product product;
	private Dinningtable dinningtable;
	private Integer amount;
	private String description;
	private int bookingbillid;
	private int walkinbillid;

	public Tabledish() {
	}

	public Tabledish(Product product, Dinningtable dinningtable,
			int bookingbillid, int walkinbillid) {
		this.product = product;
		this.dinningtable = dinningtable;
		this.bookingbillid = bookingbillid;
		this.walkinbillid = walkinbillid;
	}

	public Tabledish(Product product, Dinningtable dinningtable,
			Integer amount, String description, int bookingbillid,
			int walkinbillid) {
		this.product = product;
		this.dinningtable = dinningtable;
		this.amount = amount;
		this.description = description;
		this.bookingbillid = bookingbillid;
		this.walkinbillid = walkinbillid;
	}

	public Integer getMenuid() {
		return this.menuid;
	}

	public void setMenuid(Integer menuid) {
		this.menuid = menuid;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Dinningtable getDinningtable() {
		return this.dinningtable;
	}

	public void setDinningtable(Dinningtable dinningtable) {
		this.dinningtable = dinningtable;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBookingbillid() {
		return this.bookingbillid;
	}

	public void setBookingbillid(int bookingbillid) {
		this.bookingbillid = bookingbillid;
	}

	public int getWalkinbillid() {
		return this.walkinbillid;
	}

	public void setWalkinbillid(int walkinbillid) {
		this.walkinbillid = walkinbillid;
	}

}