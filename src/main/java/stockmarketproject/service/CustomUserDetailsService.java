package stockmarketproject.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import stockmarketproject.dto.StockMarket;
import stockmarketproject.dto.User;
import stockmarketproject.repositories.StockMarketRepositories;
import stockmarketproject.repositories.UserRepositories;

@Service
@Transactional
public abstract class CustomUserDetailsService implements StockMarketService {


    @Autowired
    private StockMarketRepositories stockMarketRepository;


    @Override
    public StockMarket createStockMarket(StockMarket stockMarket) {
        return stockMarketRepository.save(stockMarket);
    }

    

    @Override
    public List < StockMarket > getAllStockMarket() {
        return this.stockMarketRepository.findAll();
    }

    @Override
//    public StockMarket getStockMarketById1(int Id) {
//
//        Optional < StockMarket > stockMarketDb = this.stockMarketRepository.findById(Id);
//        System.out.println("stockMarket id"+stockMarketDb);
//        if (stockMarketDb.isPresent()) {
//            return stockMarketDb.get();
//        } else {
//            throw new ResourceNotFoundException("Record stockMarket data not found with id : " + Id);
//        }
//   


//	@Override
//	public StockMarket updateStockMarket(StockMarket stockMarket) {
//		// TODO Auto-generated method stub
//		
//		Optional < StockMarket > stockMarketDb = this.stockMarketRepository.findById(stockMarket.getId());
//
//        if (stockMarketDb.isPresent()) {
//            StockMarket stockMarketUpdate = stockMarketDb.get();
//            stockMarketUpdate.setId(stockMarket.getId());
//            stockMarketUpdate.setStockname(stockMarket.getStockname());
//            stockMarketUpdate.setPricedate(stockMarket.getPricedate());
//            stockMarketUpdate.setPrice(stockMarket.getPrice());
//            stockMarketUpdate.setQuantity(stockMarket.getQuantity());
//            stockMarketUpdate.setVolume(stockMarket.getVolume());
//            stockMarketRepository.save(stockMarketUpdate);
//            return stockMarketUpdate;
//        } else {
//            throw new ResourceNotFoundException("StockMarket data not found with id : " + stockMarket.getId());
//        }
//    }

		
	

//	@Override
//	public List<StockMarket> getAllStockMarket() {
//		// TODO Auto-generated method stub
//		return this.stockMarketRepository.findAll();
//	}

//	@Override
//	public StockMarket getStockMarketById(int id) {
//		// TODO Auto-generated method stub
//		 Optional < StockMarket > stockMarketDb = this.stockMarketRepository.findById(Id);
//	        System.out.println("stockMarket id"+stockMarketDb);
//	        if (stockMarketDb.isPresent()) {
//	            return stockMarketDb.get();
//	        } else {
//	            throw new ResourceNotFoundException("Record stockMarket data not found with id : " + Id);
//	        }
//	    }
	

  public void deleteStockMarket(int id) {
      Optional < StockMarket > stockMarketDb = this.stockMarketRepository.findById(id);

      if (stockMarketDb.isPresent()) {
          this.stockMarketRepository.delete(stockMarketDb.get());
      } else {
          throw new UsernameNotFoundException("Record not found with id : " + id);
      }
      
  }


	@Override
	public StockMarket getStockMarketNameById(String stockname, int id) {
		// TODO Auto-generated method stub
		 Optional < StockMarket > stockMarketDb = this.stockMarketRepository.findById(id);
        System.out.println("stockMarket id"+stockMarketDb);
        if (stockMarketDb.isPresent()) {
            return stockMarketDb.get();
        } else {
            throw new UsernameNotFoundException("Record stockMarket data not found with id : " + id);
        }
    }
	

	@Override

		public StockMarket updateStockMarket(StockMarket stockMarket) {
			// TODO Auto-generated method stub
			
			Optional < StockMarket > stockMarketDb = this.stockMarketRepository.findById(stockMarket.getId());

	        if (stockMarketDb.isPresent()) {
	            StockMarket stockMarketUpdate = stockMarketDb.get();
	            stockMarketUpdate.setId(stockMarket.getId());
	            stockMarketUpdate.setStockname(stockMarket.getStockname());
	            stockMarketUpdate.setPricedate(stockMarket.getPricedate());
	            stockMarketUpdate.setPrice(stockMarket.getPrice());
	            stockMarketUpdate.setQuantity(stockMarket.getQuantity());
	            stockMarketUpdate.setVolume(stockMarket.getVolume());
	            stockMarketRepository.save(stockMarketUpdate);
	            return stockMarketUpdate;
	        } else {
	            throw new UsernameNotFoundException("StockMarket data not found with id : " + stockMarket.getId());
	        }
	    }

		

	@Override
	public StockMarket getStockMarketNameByPricedate(String stockname, String priceDate) {
		// TODO Auto-generated method stub
		return getStockMarketNameByPrice(stockname, priceDate);
	}
	
}



	