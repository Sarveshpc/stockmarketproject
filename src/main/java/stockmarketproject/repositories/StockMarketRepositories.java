package stockmarketproject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import stockmarketproject.dto.StockMarket;

public interface StockMarketRepositories extends JpaRepository<StockMarket, Integer> {


	 List<StockMarket> findByStockName(String stockName);
	
//	StockMarket fetchbyStockMarketbyid(int id);
	
//	List<StockMarket> findByStockMarketnameandClientID(String Grow , String clientid);
//
//	List<StockMarket> findByStockMarketnameAndPrice(String AngelOne, double price);
//	
//	List<StockMarket> findfetchByStockMarketnameAndid(int id, String AngelOne);
//	
//	List<StockMarket> findByStockMarketnameAndshairs(String AngelOne, String HDFCBank);
//	
//	List<StockMarket> findByAllStockMarketnamefetchByid(String stockmarketname, int id);
//	
//	List<StockMarket> findByAllStockMarketnameByTradePrice(String AngelOne, double price);
//	  
//	List<StockMarket> findByAllStockMarketnameByQuantityandvolume(String quantity , String volume);
//	
//	List<StockMarket> findfetchByStockMarketnameAndPricedate(String stockmarketname, String pricedate);
//	
//	List<StockMarket> findfetchByStockMarketnameAndvolume(String stockmarketname, String volume);
//
//	StockMarket update(Integer id, StockMarket stockMarket);
//	
//	List<StockMarket> findByStockName(String stockName);
//
//	StockMarket deleteByStockID(Integer id);
//
//	StockMarket save(String stockName);
//	
	
	
	
	
	

   
	
	
	
	

}
