package stockmarketproject.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.transaction.Transactional;
import stockmarketproject.dto.StockMarket;
import stockmarketproject.exception.UsernameNotFoundException;
import stockmarketproject.repositories.StockMarketRepositories;

@Service
@Transactional
public interface StockMarketService {
	
	 StockMarket updateStockMarket(StockMarket stockMarket);

	    List < StockMarket > getAllStockMarket();

	    StockMarket getStockMarketById(int id);

	    void deleteStockMarket(int id);
	    
	    StockMarket getStockMarketNameById(String stockname , int id);
	    
	    void updateStockMarket(int id);
	    
	    StockMarket getStockMarketNameByPricedate(String stockname, String priceDate);
	    void fetchStockMarketBydateprice(int id);
	    
	    StockMarket getStockMarketNameByPrice(String stockName, String priceDate);
	    
	    void updateStockMarketByprice(int id, double price);
	    
	    StockMarket getStockMarketNamebyQuantity(String stockName, String qantity);
	    
	    void deleteStockMarketbyquantity(int id);

		StockMarket createStockMarket(StockMarket stockMarket);

		StockMarket updateStockMarket1(StockMarket stockMarket);

		List<StockMarket> getAllStockMarket1();

		StockMarket getStockMarketById1(int Id);

		void deleteStockMarket1(int Id);
		
		
		
	    
	    
	}

	
	
	
	
	    	    