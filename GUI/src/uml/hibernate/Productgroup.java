package uml.hibernate;

// Generated 2012-6-16 9:24:29 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Productgroup generated by hbm2java
 */
public class Productgroup implements java.io.Serializable {

	private Integer productcateid;
	private String category;
	private Set products = new HashSet(0);

	public Productgroup() {
	}

	public Productgroup(String category) {
		this.category = category;
	}

	public Productgroup(String category, Set products) {
		this.category = category;
		this.products = products;
	}

	public Integer getProductcateid() {
		return this.productcateid;
	}

	public void setProductcateid(Integer productcateid) {
		this.productcateid = productcateid;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}