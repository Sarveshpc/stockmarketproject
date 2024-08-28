package stockmarketproject.dto;
//import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stockMarkets")
public class StockMarket {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    
    @Column(name = "name")
	private String stockname;
    
    @CreationTimestamp
    @Column(name = "pricedate")
	private String pricedate;
    
//    @CreationTimestamp
//    private Date createdAt;
//
//    @CreationTimestamp
//    private Date updatedAt;
    
    @Column(name = "price")
	private double price;
	
    @Column(name = "quantity")
	private String quantity;
    
    @Column(name = "volume")
	private String volume;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public String getPricedate() {
		return pricedate;
	}

	public void setPricedate(String pricedate) {
		this.pricedate = pricedate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "StockMarket [id=" + id + ", stockname=" + stockname + ", pricedate=" + pricedate + ", price=" + price
				+ ", quantity=" + quantity + ", volume=" + volume + "]";
	}

	

	
}
	
	
    
    
	