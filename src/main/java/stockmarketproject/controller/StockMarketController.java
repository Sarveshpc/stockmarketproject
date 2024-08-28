package stockmarketproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stockmarketproject.dto.StockMarket;
import stockmarketproject.repositories.StockMarketRepositories;
import stockmarketproject.service.StockMarketService;

@RestController
@RequestMapping("/api/stocks")
public class StockMarketController {
	
	@Autowired
    private StockMarket stockMarketService;

    @PostMapping
    public ResponseEntity<StockMarket> createStockMarket(@RequestBody StockMarket stockMarket) {
        return new ResponseEntity<>(((StockMarketRepositories) stockMarketService).save(stockMarket), HttpStatus.CREATED);
    }
    
    
    @GetMapping("/stockMarketfetch")
    public ResponseEntity<String> getAllStockMarket() {
        return ResponseEntity.ok().body(stockMarketService.getPricedate());
    }

    @GetMapping("/stockMarket/{id}")
    public ResponseEntity<String> getStockMarketById(@PathVariable int Id) {
        return ResponseEntity.ok().body(stockMarketService.getStockname());
    }

    @PostMapping("/stockMarketUpdated")
    public ResponseEntity<String> createStockMarket1(@RequestBody StockMarket stockMarket) {
        return ResponseEntity.ok().body(this.stockMarketService.getStockname());
    }
    
    @PutMapping("/stockMarket/{id}")
    public ResponseEntity < StockMarket > updateStockMarket(@PathVariable int id, @RequestBody StockMarket stockMarket) {
        stockMarket.setId(id);
        return ResponseEntity.ok().body(((StockMarketService) this.stockMarketService).updateStockMarket(stockMarket));
    }

    @DeleteMapping("/stockMarket/{id}")
    public HttpStatus deleteProduct(@PathVariable long id) {
        ((StockMarketService) this.stockMarketService).deleteStockMarket((int) id);
        return HttpStatus.OK;
    }
    
    

    

    
}
    
    
    
   
    
    


