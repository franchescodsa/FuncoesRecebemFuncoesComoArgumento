package model.services;

import entities.Product;
import java.util.List;

public class ProductService {

  //Vai somar somente os preõs que começa coma letra T
  public double filteredSum(List<Product> list, Predicate<Product> criteria) {
    double sum = 0.0;

    for (Product p : list) {
      if (criteria.test(p)) {
        sum += p.getPrice();
      }
    }
    return sum;
  }
}
