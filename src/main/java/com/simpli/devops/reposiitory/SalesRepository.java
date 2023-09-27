package com.simpli.devops.reposiitory;

import com.simpli.devops.dto.ICustomBookSalesDTO;
import com.simpli.devops.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {
    Optional<List<Sales>> findByBookId(Long bookId);

    Optional<List<Sales>> findByCustomerId(Long customerId);

    Optional<List<Sales>> findBySaleDate(Date saleDate);

    @Query(value = "select b.bookId,b.bookName,b.authorName, s.salesId, s.saleDate, s.saleValue, " +
            "c.customerName from sales s, books b, customers c " +
            "where s.bookId = b.bookId and s.customerId = c.customerId and b.bookId=?1", nativeQuery = true)
    List<ICustomBookSalesDTO> findSalesByBookId(@Param("bookId") long bookId);

  /*  @Query(value="select s.bookId,b.bookName,b.authorName, s.salesId, s.saleDate, s.saleValue," +
            "c.customerName, c.email " +
            "from sales s, books b, customers c " +
            "where s.bookId = b.bookId and s.customerId=c.customerId and c.email=?1", nativeQuery = true)
    List<> findSalesByCustomerEmail(@Param("email") String email);

   */
}
